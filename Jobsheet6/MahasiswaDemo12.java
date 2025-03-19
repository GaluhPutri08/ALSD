import java.util.Scanner;

public class MahasiswaDemo12 {
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);
        MahasiswaBerprestasi12 list = new MahasiswaBerprestasi12(5);
        for (int i = 0; i < list.listMhs.length; i++) {
            System.out.println("\nMasukkan data mahasiswa ke-" + (i + 1) + ":");
            Mahasiswa12 mhs = Mahasiswa12.inputData(); 
            list.tambah(mhs); 
            System.out.println("---------------------------");
        }

        System.out.println("Data mahasiswa sebelum sorting: ");
        list.tampil();

        System.out.println("Data Mahasiswa setelah sorting berdasarkan IPK(DESC)");
        list.bubbleSort();
        list.tampil();

        System.out.println("Data yang sudah terurut menggunakan SELECTION SORT(ASC)");
        list.SelectionSort();
        list.tampil();

        System.out.println("Data yang sudah terurut menggunakan INSERTION SORT (ASC)");
        list.insertionSort();
        list.tampil();
    }
    
}