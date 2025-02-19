public class MahasiswaMain13 {
    public static void main(String[] args) {
        Mahasiswa13 mhs1 = new Mahasiswa13();
        mhs1.nama = "Muhammad Ali Farhan";
        mhs1.nim = "2241720171";
        mhs1.kelas = "S1 2J";
        mhs1.ipk = 3.55;

        mhs1.tampilkanInformasi();
        mhs1.ubahKelas("SI 2K");
        mhs1.updateIPK(3.60);
        mhs1.tampilkanInformasi();

        Mahasiswa13 mhs2 = new Mahasiswa13 ("Annisa Nabilla", "2141720160", 3.25, "TI 2L");
        mhs2.updateIPK(3.60);
        mhs2.tampilkanInformasi();

        Mahasiswa13 mhs3 = new Mahasiswa13 ("Galuh Saprilia Putri", "244107606154", 4.00, "SIB 1F");
        mhs3.tampilkanInformasi();
    }
}
