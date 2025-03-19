import java.util.Scanner;

public class DosenDemo12 {

    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);
        DataDosen12 list = new DataDosen12(10);

        for (int i = 0; i < list.listDsn.length; i++) {
            System.out.println("\nMasukkan data Dosen ke-" + (i + 1) + ":");
            Dosen12 dsn = Dosen12.inputData(); 
            list.tambah(dsn); 
            System.out.println("---------------------------");
        }

        System.out.println("Data Dosen sebelum sorting: ");
        list.tampil();

        System.out.println("Data Dosen setelah sorting berdasarkan UMUR(ASC)");
        list.bubbleSort();
        list.tampil();

        System.out.println("Data yang sudah terurut menggunakan SELECTION SORT(DSC)");
        list.SelectionSort();
        list.tampil();

        System.out.println("Data yang sudah terurut menggunakan INSERTION SORT (DSC)");
        list.insertionSort();
        list.tampil();
    }
}