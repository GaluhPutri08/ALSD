import java.util.Scanner;

public class DosenDemo {
    public static void main(String[] args) {
        DosenMain sistem = new DosenMain();

        // Data awal
        sistem.tambahDosen(new DataDosen("1101", "Putri", "putri@polinema.ac.id", 2015, "Teknik Informatika"));
        sistem.tambahDosen(new DataDosen("1102", "Budi", "budi@polinema.ac.id", 2018, "Teknik Elektro"));
        sistem.tambahDosen(new DataDosen("1103", "Rani", "Rani@polinema.ac.id", 2010, "Teknik Sipil"));
        sistem.tambahDosen(new DataDosen("1105", "Tegar", "tegas@polinema.ac.id", 2006, "Akuntansi"));

        Scanner sc = new Scanner(System.in);
        int pilih;

        do {
            System.out.println("\n=== Menu Sistem Pengelolaan Data Dosen ===");
            System.out.println("1. Tampilkan semua data dosen");
            System.out.println("2. Urutkan berdasarkan NIDN (Ascending)");
            System.out.println("3. Cari dosen berdasarkan Nama");
            System.out.println("4. Urutkan berdasarkan Masa Kerja (Descending)");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu: ");
            pilih = sc.nextInt();
            sc.nextLine(); // buang newline

            switch (pilih) {
                case 1:
                    sistem.tampilkanSemuaDosen();
                    break;
                case 2:
                    sistem.urutkanBerdasarkanNIDN();
                    sistem.tampilkanSemuaDosen();
                    break;
                case 3:
                    System.out.print("Masukkan nama yang dicari: ");
                    String nama = sc.nextLine();
                    sistem.cariDosenBerdasarkanNama(nama);
                    break;
                case 4:
                    sistem.urutkanBerdasarkanMasaKerja();
                    sistem.tampilkanSemuaDosen();
                    break;
                case 0:
                    System.out.println("Terima kasih!");
                    break;
                default:
                    System.out.println("Menu tidak valid!");
            }
        } while (pilih != 0);
    }
}
