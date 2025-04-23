import java.util.ArrayList;

public class DosenMain{
    ArrayList<DataDosen> listDosen = new ArrayList<>();

    public void tambahDosen(DataDosen d) {
        listDosen.add(d);
    }

    public void tampilkanSemuaDosen() {
        for (DataDosen d : listDosen) {
            d.tampilDataDosen();
        }
    }
    public void urutkanBerdasarkanNIDN() {
        // Jenis algoritma sorting: Insertion Sort(ascending)
        for (int i = 1; i < listDosen.size(); i++) {
            DataDosen key = listDosen.get(i);
            int j = i - 1;
    
            while (j >= 0 && listDosen.get(j).nidn.compareTo(key.nidn) > 0) {
                listDosen.set(j + 1, listDosen.get(j));
                j = j - 1;
            }
            listDosen.set(j + 1, key);
        }
    }
    // Linear Search berdasarkan nama
    public void cariDosenBerdasarkanNama(String nama) {
        // Jenis algoritma searching: Linear Search
        boolean ditemukan = false;
        for (DataDosen d : listDosen) {
            if (d.nama.equalsIgnoreCase(nama)) {
                d.tampilDataDosen();
                ditemukan = true;
            }
        }
        if (!ditemukan) {
            System.out.println("Dosen dengan nama '" + nama + "' tidak ditemukan.");
        }
    }
    public void urutkanBerdasarkanMasaKerja() {
        // Jenis algoritma sorting: Insertion Sort (Descending)
        for (int i = 1; i < listDosen.size(); i++) {
            DataDosen key = listDosen.get(i);
            int j = i - 1;
    
            while (j >= 0 && listDosen.get(j).MasaKerja() < key.MasaKerja()) {
                listDosen.set(j + 1, listDosen.get(j));
                j = j - 1;
            }
            listDosen.set(j + 1, key);
        }
    }
}