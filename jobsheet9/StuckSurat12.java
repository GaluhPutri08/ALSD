public class StuckSurat12 {
    Surat12[] stack;
    int top;
    int size;


    public StuckSurat12(int size) {
        this.size = size;
        this.stack = new Surat12[size];
        this.top = -1;
    }
    public boolean isFull() {
        return top == size - 1;
    }
    public boolean isEmpty() {
        return top == -1;
    }
    public void push(Surat12 s) {
        if (!isFull()) {
            stack[++top] = s;
        } else {
            System.out.println("Stack penuh, tidak bisa menambahkan surat.");
        }
    }




    public Surat12 pop() {
        if (!isEmpty()) {
            return stack[top--];
        } else {
            System.out.println("Stack kosong, tidak ada surat yang bisa diproses.");
            return null;
        }
    }
    public Surat12 peek() {
        if (!isEmpty()) {
            return stack[top];
        } else {
            return null;
        }
    }
    public boolean cariSurat(String nama) {
        for (int i = 0; i <= top; i++) {
            if (stack[i].namaMahasiswa.equalsIgnoreCase(nama)) {
                return true;
            }
        }
        return false;
    }
}
