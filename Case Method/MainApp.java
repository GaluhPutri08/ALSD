import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) {
        AntrianPasien antrian = new AntrianPasien();
        TransaksiLayanan[] transaksiArray = new TransaksiLayanan[100];
        int jumlahTransaksi = 0;

        Scanner input = new Scanner(System.in);
        boolean running = true;

        while (running) {
            System.out.println("\n=== Menu Sistem Antrian Klinik ===");
            System.out.println("1. Tambah Pasien");
            System.out.println("2. Tampilkan Antrian");
            System.out.println("3. Layani Pasien");
            System.out.println("4. Cek Sisa Antrian Pasien");
            System.out.println("5. Lihat Riwayat Transaksi");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu: ");
            int pilihan = input.nextInt();
            input.nextLine();

            switch (pilihan) {
                case 1:
                    System.out.print("Nama Pasien: ");
                    String nama = input.nextLine();
                    System.out.print("NIK: ");
                    String nik = input.nextLine();
                    System.out.print("Keluhan: ");
                    String keluhan = input.nextLine();
                    antrian.tambahPasien(new Pasien(nama, nik, keluhan));
                    break;

                case 2:
                    antrian.tampilkanAntrian();
                    break;

                case 3:
                    Pasien pasienDilayani = antrian.layaniPasien();
                    if (pasienDilayani != null) {

                    System.out.println("Pasien " +pasienDilayani.nama + " dipanggil");
                    System.out.print("ID Dokter: ");
                    String id = input.nextLine();
                    System.out.print("Nama Dokter: ");
                    String namaDokter = input.nextLine();
                    System.out.print("Durasi Layanan (jam): ");
                    int durasi = input.nextInt();
                    input.nextLine();

                    Dokter dokter = new Dokter(id, namaDokter);
                    TransaksiLayanan transaksi = new TransaksiLayanan(pasienDilayani, dokter, durasi);
                    transaksiArray[jumlahTransaksi++] = transaksi;

                    System.out.println(">> Pasien telah dilayani, transaksi berhasil di catat");
                    }
                    break;
                case 4:
                    System.out.println(">> Sisa pasien dalam antrian : " + antrian.getJumlahAntrian());
                    break;

                case 5:
                    if (jumlahTransaksi == 0) {
                        System.out.println("Belum ada transaksi.");
                    } else {
                        System.out.println("=== Riwayat Transaksi ===");
                        for (int i = 0; i < jumlahTransaksi; i++) {
                            TransaksiLayanan t = transaksiArray[i];
                            System.out.println(t.pasien + " (" + t.durasiLayanan + " jam) : Rp " + t.hitungBiaya());
                            System.out.println("---------------------------");
                        }
                    }
                    break;

                case 0:
                    running = false;
                    break;

                default:
                    System.out.println("Pilihan tidak valid!");
            }
        }

        input.close();
    }
}