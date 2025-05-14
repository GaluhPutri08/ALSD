public class AntrianLinkedList {
    private Node front, rear;
    private int size;
    private final int kapasitas;

    public AntrianLinkedList(int kapasitas) {
        this.front = this.rear = null;
        this.size = 0;
        this.kapasitas = kapasitas;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return size == kapasitas;
    }

    public void clear() {
        front = rear = null;
        size = 0;
        System.out.println("Antrian dikosongkan.");
    }

    public void enqueue(Mahasiswa mhs) {
        if (isFull()) {
            System.out.println("Antrian penuh, tidak bisa menambahkan.");
            return;
        }
        Node newNode = new Node(mhs);
        if (isEmpty()) {
            front = rear = newNode;
        } else {
            rear.next = newNode;
            rear = newNode;
        }
        size++;
        System.out.println("Mahasiswa " + mhs.nama + " masuk antrian.");
    }

    public void dequeue() {
        if (isEmpty()) {
            System.out.println("Antrian kosong, tidak ada yang dipanggil.");
            return;
        }
        System.out.println("Mahasiswa " + front.data.nama + " dipanggil dari antrian.");
        front = front.next;
        size--;
        if (front == null) rear = null;
    }

    public void peekFront() {
        if (!isEmpty()) {
            System.out.println("Mahasiswa terdepan: " + front.data);
        } else {
            System.out.println("Antrian kosong.");
        }
    }

    public void peekRear() {
        if (!isEmpty()) {
            System.out.println("Mahasiswa terakhir: " + rear.data);
        } else {
            System.out.println("Antrian kosong.");
        }
    }

    public void printQueue() {
        if (isEmpty()) {
            System.out.println("Antrian kosong.");
            return;
        }
        System.out.println("Daftar antrian:");
        Node temp = front;
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }

    public int getSize() {
        return size;
    }
}