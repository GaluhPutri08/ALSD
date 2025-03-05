class Mahasiswa_12 {

    String nim, nama;
    int tahunMasuk;
    MataKuliah_12[] mataKuliahDiambil;
    int jumlahMataKuliah;

    static final int MAX_MATA_KULIAH = 3;

    public Mahasiswa_12(String nim, String nama, int tahunMasuk) {
        this.nim = nim;
        this.nama = nama;
        this.tahunMasuk = tahunMasuk;
        this.mataKuliahDiambil = new MataKuliah_12[MAX_MATA_KULIAH];
        this.jumlahMataKuliah = 0;
    }
    void tampilInfo() {
        System.out.println("NIM: " + nim);
        System.out.println("Nama: " + nama);
        System.out.println("Tahun Masuk: " + tahunMasuk);
        System.out.println("Mata Kuliah yang Diambil:");
        for (int i = 0; i < jumlahMataKuliah; i++) {
            mataKuliahDiambil[i].tampilkanInfo();
        }
    }
    void tambahMataKuliah(MataKuliah_12 mataKuliah) {
        if (jumlahMataKuliah < MAX_MATA_KULIAH) {
            mataKuliahDiambil[jumlahMataKuliah] = mataKuliah;
            jumlahMataKuliah++;
        } else {
            System.out.println("Jumlah maksimum mata kuliah yang dapat diambil sudah tercapai.");
        }
    }
    public int hitungTotalSKS() {
        int totalSKS = 0;
        for (int i = 0; i < jumlahMataKuliah; i++) {
            totalSKS += mataKuliahDiambil[i].sks;
        }
        return totalSKS;
    }
}