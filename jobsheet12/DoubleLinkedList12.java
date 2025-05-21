public class DoubleLinkedList12 {
    Node12 head;
    Node12 tail;
    int size;

    public DoubleLinkedList12() {
        head = null;
        tail = null;
        size = 0;
    }
    public boolean isEmpty() {
        return head == null;
    }
    public void addFirst(Mahasiswa12 data) {
        Node12 newNode = new Node12(data);
        if (isEmpty()) {
            head = tail = newNode;
        } else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
        size++;
    }
    public void addLast(Mahasiswa12 data) {
        Node12 newNode = new Node12(data);
        if (isEmpty()) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
        size++;
    }

    public void add(int index, Mahasiswa12 data) {
        if (index < 0 || index > size) {
            System.out.println("Indeks di luar jangkauan.");
            return;
        }
        if (index == 0) {
            addFirst(data);
        } else if (index == size) {
            addLast(data);
        } else {
            Node12 current = head;
            for (int i = 0; i < index; i++) {
                current = current.next;
            }
            Node12 newNode = new Node12(data);
            newNode.prev = current.prev;
            newNode.next = current;
            current.prev.next = newNode;
            current.prev = newNode;
            size++;
        }
    }
    public void removeFirst() {
        if (isEmpty()) {
        System.out.println("List masih kosong. Tidak ada data yang bisa dihapus.");
        return;
    }
    Mahasiswa12 removedData = head.data;
    if (head == tail) { 
        head = tail = null;
    } else {
        head = head.next;
        head.prev = null;
    }
    size--;
    System.out.println("Data sudah berhasil dihapus. Data yang terhapus adalah:");
    removedData.tampil();
    }

    public void removeLast() {
        if (isEmpty()) {
            System.out.println("List kosong.");
            return;
        }
        Mahasiswa12 removedData = tail.data;
        if (head == tail) {
            head = tail = null;
        } else {
            tail = tail.prev;
            tail.next = null;
        }
        size--;
        System.out.println("Data sudah berhasil dihapus. Data yang terhapus adalah:");
        removedData.tampil();
    }
     public void removeAfter(String keyNim) {
        Node12 current = head;
        while (current != null && !current.data.nim.equals(keyNim)) {
            current = current.next;
        }
        if (current == null || current.next == null) {
            System.out.println("Node setelah NIM " + keyNim + " tidak ditemukan atau tidak ada.");
            return;
        }
        Node12 toDelete = current.next;
        current.next = toDelete.next;
        if (toDelete.next != null) {
            toDelete.next.prev = current;
        } else {
            tail = current;
        }
        size--;
        System.out.println("Data setelah NIM " + keyNim + " telah dihapus.");
    }

    public void remove(int index) {
        if (index < 0 || index >= size) {
            System.out.println("Indeks di luar jangkauan.");
            return;
        }
        if (index == 0) {
            removeFirst();
        } else if (index == size - 1) {
            removeLast();
        } else {
            Node12 current = head;
            for (int i = 0; i < index; i++) {
                current = current.next;
            }
            Mahasiswa12 removedData = current.data;
            current.prev.next = current.next;
            current.next.prev = current.prev;
            size--;
            System.out.println("Data sudah berhasil dihapus. Data yang terhapus adalah:");
            removedData.tampil();
        }
    }

    public void insertAfter(String keyNim, Mahasiswa12 data) {
        Node12 current = head;

        while (current != null && !current.data.nim.equals(keyNim)) {
            current = current.next;
        }

        if (current == null) {
            System.out.println("Node dengan NIM " + keyNim + "tidak ditemukan.");
            return;
        }
        Node12 newNode = new Node12(data);
        if(current == tail) {
            current.next = newNode;
            newNode.prev = current;
            tail = newNode;
        } else {
            newNode.next = current.next;
            newNode.prev = current;
            current.next.prev = newNode;
            current.next = newNode;
        }
        System.out.println("Node berhasil disisipkan setelah NIM" + keyNim);
    }
    public Node12 search(String nim) {
        Node12 current = head;
        while (current != null) {
            if (current.data.nim.equals(nim)) {
                return current;
            }
            current = current.next;
        }
        return null;
    }
    public void print() {
    if (isEmpty()) {
        System.out.println("Linked list masih kosong.");
        return;
    }
    Node12 current = head;
    while (current != null) {
        current.data.tampil();
        current = current.next;
        }
    }
    public void getFirst() {
        if (head != null) {
            System.out.println("Data pertama:");
            head.data.tampil();
        } else {
            System.out.println("List masih kosong.");
        }
    }

    public void getLast() {
        if (tail != null) {
            System.out.println("Data terakhir:");
            tail.data.tampil();
        } else {
            System.out.println("List masih kosong.");
        }
    }

    public void getIndex(int index) {
        if (index < 0 || index >= size) {
            System.out.println("Indeks di luar jangkauan.");
            return;
        }
        Node12 current = head;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }
        System.out.println("Data pada indeks ke-" + index + ":");
        current.data.tampil();
    }

    public int getSize() {
        return size;
    }
}