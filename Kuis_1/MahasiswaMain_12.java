public class MahasiswaMain_12 {

    public static void main(String[] args) {
        
        Mahasiswa_12 mhs1 = new Mahasiswa_12("244107060164","Putri Aisyah" , 2024);

        MataKuliah_12 mk1 = new MataKuliah_12("A001", "Matematika", 4);
        MataKuliah_12 mk2 = new MataKuliah_12("A002", "Basis Data", 6);
        MataKuliah_12 mk3 = new MataKuliah_12("A003", "Pemrograman", 8);

        mhs1.tambahMataKuliah(mk1);
        mhs1.tambahMataKuliah(mk2);
        mhs1.tambahMataKuliah(mk3);

        System.out.println("Informasi Mahasiswa:");
        mhs1.tampilInfo();
        System.out.println();

        int totalSKS = mhs1.hitungTotalSKS();
        System.out.println("Total SKS yang diambil: " + totalSKS);
    }
}