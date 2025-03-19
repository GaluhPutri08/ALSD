import java.util.Scanner;

public class Mahasiswa12 {

    String nim;
    String nama;
    String kelas;
    double ipk;

    Mahasiswa12(){

    }

    Mahasiswa12 (String nm, String name, String kls, double ip){
        nim = nm;
        nama = name;
        ipk = ip;
        kelas = kls;
    }

    void tampilInformasi(){
        System.out.println("Nama: "+ nama);
        System.out.println("NIM: "+ nim);
        System.out.println("Kelas "+ kelas);
        System.out.println("IPK: " + ipk);
    }
    public static Mahasiswa12 inputData() {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Masukkan NIM: ");
        String nim = scanner.nextLine();
        
        System.out.print("Masukkan Nama: ");
        String name = scanner.nextLine();
        
        System.out.print("Masukkan Kelas: ");
        String kelas = scanner.nextLine();
        
        System.out.print("Masukkan IPK: ");
        double ipk = scanner.nextDouble();
        return new Mahasiswa12(nim, name, kelas, ipk);

    }
}