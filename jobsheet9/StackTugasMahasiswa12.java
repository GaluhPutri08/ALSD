public class StackTugasMahasiswa12{
    Mahasiswa12[] stack;
    int top;
    int size;

    public StackTugasMahasiswa12(int size){
        this.size = size;
        stack = new Mahasiswa12[size];
        top = -1;
    }
    public boolean isFull(){
        if (top == size -1) {
            return true;
        } else {
            return false;
        }
    }
    public boolean isEmpty(){
        if (top == -1){
            return true;
        } else {
            return false;
        }
    }
    public void push(Mahasiswa12 mhs) {
        if (!isFull()){
            top++;
            stack[top] = mhs;
        } else {
            System.out.println("Stack penuh! Tidak bisa menambahkan tugas lagi.");
        }
    }
    public Mahasiswa12 pop(){
        if (!isEmpty()){
            Mahasiswa12 m = stack[top];
            top--;
            return m;
        } else {
            System.out.println("Stack kosong! Tidak ada tugas untuk dinilai.");
            return null;
        }
    }
    public Mahasiswa12 peek(){
        if (!isEmpty()) {
            return stack[top];
        } else {
            System.out.println("Stack kosong! Tidak ada tugas yang dikumoulkan");
            return null;
        }
    }
    Mahasiswa12 bottom() {
        if (!isEmpty()) {
            return stack[0]; // elemen pertama yang masuk
        }
        return null;
    }
    int jumlahTugas() {
        return top + 1;
    }    
    public void print(){
        for (int i = 0; i <= top; i++){
            System.out.println(stack[i].nama + "\t" + stack[i].nim + "\t" + stack[i].kelas);
        }
        System.out.println("");
    }
    public String konversiDesimalKeBiner(int nilai) {
        StackKonversi12 stack = new StackKonversi12();
        while (nilai > 0){
            int sisa = nilai % 2;
            stack.push(sisa);
            nilai = nilai /2;
        }
        String biner = new String();
        while (!stack.isEmpty()){
            biner += stack.pop();
        }
        return biner;
    }
}