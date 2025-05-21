import java.util.Scanner;

public class DLLMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DoubleLinkedList12 dll = new DoubleLinkedList12();

        int pilihan;
        do {
            System.out.println("\n=== MENU DOUBLE LINKED LIST MAHASISWA ===");
            System.out.println("1. Tambah di awal");
            System.out.println("2. Tambah di akhir");
            System.out.println("3. Tambah di indeks tertentu");
            System.out.println("4. Tambah setelah NIM tertentu");
            System.out.println("5. Hapus dari awal");
            System.out.println("6. Hapus dari akhir");
            System.out.println("7. Hapus dari indeks tertentu");
            System.out.println("8. Hapus setelah NIM tertentu");
            System.out.println("9. Tampilkan semua data");
            System.out.println("10. Cari Mahasiswa berdasarkan NIM");
            System.out.println("11. Tampilkan data pertama");
            System.out.println("12. Tampilkan data terakhir");
            System.out.println("13. Tampilkan data pada indeks");
            System.out.println("14. Tampilkan jumlah data");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu: ");
            pilihan = sc.nextInt();
            sc.nextLine(); 

            switch (pilihan) {
                case 1 -> dll.addFirst(inputMahasiswa(sc));
                case 2 -> dll.addLast(inputMahasiswa(sc));
                case 3 -> {
                    System.out.print("Masukkan indeks: ");
                    int idx = sc.nextInt();
                    sc.nextLine();
                    dll.add(idx, inputMahasiswa(sc));
                }
                case 4 -> {
                    System.out.print("Masukkan NIM yang ingin disisipkan setelahnya: ");
                    String keyNim = sc.nextLine();
                    dll.insertAfter(keyNim, inputMahasiswa(sc));
                }
                case 5 -> dll.removeFirst();
                case 6 -> dll.removeLast();
                case 7 -> {
                    System.out.print("Masukkan indeks yang ingin dihapus: ");
                    int idx = sc.nextInt();
                    dll.remove(idx);
                }
                case 8 -> {
                    System.out.print("Masukkan NIM sebelum data yang ingin dihapus: ");
                    String keyNim = sc.nextLine();
                    dll.removeAfter(keyNim);
                }
                case 9 -> dll.print();
                case 10 -> {
                    System.out.print("Masukkan NIM yang dicari: ");
                    String nim = sc.nextLine();
                    Node12 result = dll.search(nim);
                    if (result != null) {
                        System.out.println("Data ditemukan:");
                        result.data.tampil();
                    } else {
                        System.out.println("Data tidak ditemukan.");
                    }
                }
                case 11 -> dll.getFirst();
                case 12 -> dll.getLast();
                case 13 -> {
                    System.out.print("Masukkan indeks yang ingin ditampilkan: ");
                    int idx = sc.nextInt();
                    dll.getIndex(idx);
                }
                case 14 -> System.out.println("Jumlah data saat ini: " + dll.getSize());
                case 0 -> System.out.println("Program selesai.");
                default -> System.out.println("Pilihan tidak valid.");
            }
        } while (pilihan != 0);
    }

    static Mahasiswa12 inputMahasiswa(Scanner sc) {
        System.out.print("Masukkan NIM: ");
        String nim = sc.nextLine();
        System.out.print("Masukkan Nama: ");
        String nama = sc.nextLine();
        System.out.print("Masukkan Kelas: ");
        String kelas = sc.nextLine();
        System.out.print("Masukkan IPK: ");
        double ipk = sc.nextDouble();
        sc.nextLine(); 
        return new Mahasiswa12(nim, nama, kelas, ipk);
    }
}
