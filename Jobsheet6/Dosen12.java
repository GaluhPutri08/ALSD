import java.util.Scanner;

public class Dosen12{

    String kode, nama;
    String jenisKelamin;
    int usia;

    Dosen12(){

    }
    Dosen12 (String kd, String name, String jk , int age){
        kode = kd;
        nama = name;
        jenisKelamin = jk;
        usia = age;
    }
    void tampilInformasi(){
        System.out.println("Kode: "+ kode);
        System.out.println("Nama: "+ nama);
        System.out.println("Jenis Kelamin:  "+ jenisKelamin);
        System.out.println("Usia: " + usia);
    }
    public static Dosen12 inputData() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan Kode Dosen : ");
        String kode = scanner.nextLine();
        System.out.print("Masukkan nama Dosen : ");
        String nama = scanner.nextLine();
        System.out.print("Masukkan Jenis Kelamin (L/P): ");
        String jenisKelamin = scanner.nextLine();
        System.out.print("Masukkan Usia Dosen : ");
        int usia = scanner.nextInt();

        return new Dosen12(kode, nama, jenisKelamin, usia);
    }
}