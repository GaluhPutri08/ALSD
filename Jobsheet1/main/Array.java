import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] mataKuliah = {
            "Pancasila",
            "Konsep Teknologi Informasi",
            "Critical Thinking dan Problem Solving",
            "Matematika Dasar",
            "Bahasa Inggris",
            "Dasar Pemrograman",
            "Praktikum Dasar Pemrograman",
            "Keselamatan dan Kesehatan Kerja"
        };

        double[] nilaiAngka = new double[mataKuliah.length];
        double totalBobot = 0;
        System.out.println("==============================");
        System.out.println("Program Menghitung IP Semester");
        System.out.println("==============================");

        for (int i = 0; i < mataKuliah.length; i++) {
            System.out.print("Masukkan nilai angka untuk MK " + mataKuliah[i] + ": ");
            nilaiAngka[i] = sc.nextDouble();
        }

        System.out.println("==============================");
        System.out.println("\nHasil Konversi Nilai");
        System.out.println("==============================");
        System.out.printf("%-40s %-12s %-12s %s\n", "MK", "Nilai Angka", "Nilai Huruf", "Bobot Nilai");
        
        for (int i = 0; i < mataKuliah.length; i++) {
            String nilaiHuruf = konversiNilaiHuruf(nilaiAngka[i]);
            double bobot = konversiBobot(nilaiHuruf);
            totalBobot += bobot;
            
            System.out.printf("%-40s %-12.2f %-12s %.2f\n", mataKuliah[i], nilaiAngka[i], nilaiHuruf, bobot);
        }
        System.out.println("==============================");
        double ipSemester = totalBobot / mataKuliah.length;
        System.out.printf("\nIP : %.2f\n", ipSemester);

        sc.close();
    }

    public static String konversiNilaiHuruf(double nilai) {
        if (nilai > 80 && nilai <= 100) return "A";
        else if (nilai > 73 && nilai <=80) return "B+";
        else if (nilai > 65 && nilai <=73) return "B";
        else if (nilai > 60 && nilai <=65) return "C+";
        else if (nilai > 50 && nilai <=60) return "C";
        else if (nilai > 39 && nilai <=50) return "D";
        else return "E";
    }

    public static double konversiBobot(String nilaiHuruf) {
        switch (nilaiHuruf) {
            case "A": return 4.00;
            case "B+": return 3.50;
            case "B": return 3.00;
            case "C+": return 2.50;
            case "C": return 2.00;
            case "D": return 1.00;
            default: return 0.00;
        }
    }
}
