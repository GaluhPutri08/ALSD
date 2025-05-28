public class TransaksiLayanan {

    Pasien pasien;
    Dokter dokter;
    int durasiLayanan; 

    public TransaksiLayanan(Pasien pasien, Dokter dokter, int durasi) {
        this.pasien = pasien;
        this.dokter = dokter;
        durasiLayanan = durasi;
    }

    public int hitungBiaya() {
        return durasiLayanan * 50000;
    }
}