import java.util.Scanner;

public class NilaiMahasiswa {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Program Menghitung Nilai Akhir");
        System.out.println("==============================");
        System.out.print("Masukkan Nilai Tugas: ");
        double nilaiTugas = sc.nextDouble();
        System.out.print("Masukkan Nilai Kuis: ");
        double nilaiKuis = sc.nextDouble();
        System.out.print("Masukkan Nilai UTS: ");
        double nilaiUTS = sc.nextDouble();
        System.out.print("Masukkan Nilai UAS: ");
        double nilaiUAS = sc.nextDouble();
        System.out.println("==============================");
        System.out.println("==============================");

        if(nilaiTugas < 0 || nilaiTugas > 100 || nilaiKuis < 0 || nilaiKuis > 100 || nilaiUTS < 0 || nilaiUTS > 100 || nilaiUAS < 0 || nilaiUAS > 100){
            System.out.println("Nilai Tidak Valid");
        } else {
            double nilaiAkhir = (0.20 * nilaiTugas) + (0.20 * nilaiKuis) + (0.30 * nilaiUTS) + (0.30 * nilaiUAS); 

            String grade;
            if (nilaiAkhir > 80 || nilaiAkhir <= 100) {
                grade = "A";
            } else if (nilaiAkhir > 73 || nilaiAkhir <=80 ) {
                grade = "B+";
            } else if (nilaiAkhir > 65 || nilaiAkhir <=73) {
                grade = "B";
            } else if (nilaiAkhir > 60 || nilaiAkhir <=65 ) {
                grade = "C+";
            } else if (nilaiAkhir > 50 || nilaiAkhir <=60) {
                grade = "C";
            } else if (nilaiAkhir > 39 || nilaiAkhir <=50 ) {
                grade = "D";
            } else {
                grade = "E";
            }
            String status;
            if (grade.equals("A") || grade.equals("B+") || grade.equals("B") ||
                grade.equals("C+") || grade.equals("C")) {
                status = "SELAMAT ANDA LULUS";
            } else {
                status = "ANDA TIDAK LULUS";
            }

            System.out.println("Nilai Akhir : " + nilaiAkhir);
            System.out.println("Nilai Huruf : " + grade);

            System.out.println("==============================");
            System.out.println("==============================");
            
            System.out.println(status);

        }
        sc.close();
    } 
}