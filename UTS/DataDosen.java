import java.util.Calendar;

class DataDosen{

    String nidn;
    String nama;
    String email;
    int tahunMasuk;
    String prodi;

    public DataDosen(String nidn, String nama, String email, int tahunMasuk, String prodi){
        this.nidn = nidn;
        this.nama = nama;
        this.email = email;
        this.tahunMasuk = tahunMasuk;
        this.prodi = prodi;
    }
    public int MasaKerja(){
        int tahunSekarang = 2025;
        return tahunSekarang - tahunMasuk;
    }
    public void tampilDataDosen(){
        System.out.println("NIDN : " + nidn + " | Nama Dosen : " + nama+ " | Email : " + email+ " | Masa Kerja : " + MasaKerja() + " tahun" );
    }
}