class MataKuliah_12 {

    String kodeMK,namaMK;
    int sks;

    public MataKuliah_12(String kodeMK, String namaMK, int sks){
        this.kodeMK = kodeMK;
        this.namaMK = namaMK;
        this.sks = sks;

    }
    void tampilkanInfo() {
        System.out.println("Kode Matkul: " + kodeMK);
        System.out.println("Nama Matkul: " + namaMK);
        System.out.println("Jumlah SKS : " + sks);
    }
    void ubahNamaMK(String namaMKBaru) {
        this.namaMK = namaMKBaru;
    }
    void ubahSks(int SKS){
        if (SKS >= 2){
            this.sks = SKS;
        }else {
            System.out.println("Jumlah SKS tidak valid! SKS minimal adalah 2(tidak boleh kurang dari 2).");
        }
    }
}