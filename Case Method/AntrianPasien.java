import java.util.LinkedList;

public class AntrianPasien {

    private LinkedList<Pasien> antrian = new LinkedList<>();

    public void tambahPasien(Pasien pasien) {
        antrian.addLast(pasien); 
        System.out.println(">> Pasien masuk ke dalam antrian.");
    }

    public void tampilkanAntrian() {
        if (antrian.isEmpty()) {
            System.out.println("Antrian kosong.");
            return;
        }
         System.out.println("-- Antrian Pasien --");
        for (Pasien p : antrian) {
            p.tampilkanInformasi();
            System.out.println("----------------------");
        }
    }
    public Pasien layaniPasien() {
        if (!antrian.isEmpty()) {
            return antrian.removeFirst();
        } else {
            System.out.println("Tidak ada pasien dalam antrian.");
            return null;
        }
    }
    public int getJumlahAntrian() {
        return antrian.size();
    }
    public boolean isKosong() {
        return antrian.isEmpty();
    }
}