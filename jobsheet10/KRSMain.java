package Tugas;
import java.util.Scanner;

public class KRSMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        AntrianKRS antrian = new AntrianKRS();
        int pilih;

        do {
            System.out.println("\n===== MENU KRS MAHASISWA =====");
            System.out.println("1. Tambah Mahasiswa ke Antrian");
            System.out.println("2. Proses KRS (2 mahasiswa)");
            System.out.println("3. Tampilkan Semua Antrian");
            System.out.println("4. Lihat 2 Terdepan");
            System.out.println("5. Lihat Terakhir");
            System.out.println("6. Jumlah Antrian");
            System.out.println("7. Jumlah Sudah KRS");
            System.out.println("8. Jumlah Belum KRS");
            System.out.println("9. Kosongkan Antrian");
            System.out.println("0. Keluar");
            System.out.print("Pilih: ");
            pilih = sc.nextInt();
            sc.nextLine();

            switch (pilih) {
                case 1:
                    System.out.print("NIM    : ");
                    String nim = sc.nextLine();
                    System.out.print("Nama   : ");
                    String nama = sc.nextLine();
                    System.out.print("Prodi  : ");
                    String prodi = sc.nextLine();
                    System.out.print("Kelas  : ");
                    String kelas = sc.nextLine();
                    Mahasiswa12 mhs = new Mahasiswa12(nim, nama, prodi, kelas);
                    antrian.tambahAntrian(mhs);
                    break;

                case 2:
                    antrian.prosesKRS();
                    break;

                case 3:
                    antrian.tampilkanSemua();
                    break;

                case 4:
                    antrian.tampilkanTerdepan();
                    break;

                case 5:
                    antrian.tampilkanTerakhir();
                    break;

                case 6:
                    antrian.cetakJumlah();
                    break;

                case 7:
                    antrian.cetakSudahKRS();
                    break;

                case 8:
                    antrian.cetakBelumKRS();
                    break;

                case 9:
                    antrian.clear();
                    break;

                case 0:
                    System.out.println("Terima kasih.");
                    break;

                default:
                    System.out.println("Pilihan tidak valid.");
            }

        } while (pilih != 0);
        sc.close();
    }
}
