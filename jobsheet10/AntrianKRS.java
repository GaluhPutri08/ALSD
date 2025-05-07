package Tugas;
public class AntrianKRS {
    Mahasiswa12[] data;
    int front, rear, size;
    int max = 10;
    int totalKRS = 0;

    public AntrianKRS() {
        data = new Mahasiswa12[max];
        front = 0;
        rear = -1;
        size = 0;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return size == max;
    }

    public void clear() {
        front = 0;
        rear = -1;
        size = 0;
        totalKRS = 0;
        System.out.println("Antrian dikosongkan.");
    }

    public void tambahAntrian(Mahasiswa12 mhs) {
        if (isFull()) {
            System.out.println("Antrian penuh!");
        } else {
            rear = (rear + 1) % max;
            data[rear] = mhs;
            size++;
            System.out.println("Mahasiswa ditambahkan ke antrian.");
        }
    }

    public void prosesKRS() {
        if (size < 2) {
            System.out.println("Antrian kurang dari 2 orang.");
        } else {
            System.out.println("Memproses 2 mahasiswa:");
            for (int i = 0; i < 2; i++) {
                Mahasiswa12 mhs = data[front];
                front = (front + 1) % max;
                size--;
                totalKRS++;
                mhs.tampilkanData();
            }
        }
    }

    public void tampilkanSemua() {
        if (isEmpty()) {
            System.out.println("Antrian kosong.");
        } else {
            System.out.println("Isi Antrian:");
            for (int i = 0; i < size; i++) {
                int idx = (front + i) % max;
                System.out.print((i + 1) + ". ");
                data[idx].tampilkanData();
            }
        }
    }

    public void tampilkanTerdepan() {
        if (size < 2) {
            System.out.println("Antrian tidak memiliki dua orang.");
        } else {
            System.out.println("2 Mahasiswa Terdepan:");
            data[front].tampilkanData();
            data[(front + 1) % max].tampilkanData();
        }
    }

    public void tampilkanTerakhir() {
        if (isEmpty()) {
            System.out.println("Antrian kosong.");
        } else {
            System.out.println("Mahasiswa terakhir:");
            data[rear].tampilkanData();
        }
    }

    public void cetakJumlah() {
        System.out.println("Jumlah dalam antrian: " + size);
    }

    public void cetakSudahKRS() {
        System.out.println("Jumlah yang sudah KRS: " + totalKRS);
    }

    public void cetakBelumKRS() {
        int belum = 30 - totalKRS;
        System.out.println("Jumlah mahasiswa belum KRS (maks 30): " + belum);
    }
}
