public class MataKuliahMain_12 {

    public static void main(String[] args) {
        
        MataKuliah_12 mk1 = new MataKuliah_12("A001", "Matematika", 4);
        MataKuliah_12 mk2 = new MataKuliah_12("A002", "Basis Data", 6);
        MataKuliah_12 mk3 = new MataKuliah_12("A003", "Pemrograman", 8);

        System.out.println("Informasi Mata Kuliah 1 : ");
        mk1.tampilkanInfo();
        System.out.println();
        System.out.println("Informasi Mata Kuliah 2 : ");
        mk2.tampilkanInfo();
        System.out.println();
        System.out.println("Informasi Mata Kuliah 3 : ");
        mk3.tampilkanInfo();
        System.out.println();

        mk3.ubahNamaMK("Pemrograman Dasar");
        mk3.ubahSks(1);

        System.out.println("Informasi Mata Kuliah 3 Setelah Perubahan:");
        mk3.tampilkanInfo();
    }
}