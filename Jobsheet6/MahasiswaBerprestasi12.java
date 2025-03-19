public class MahasiswaBerprestasi12{
    Mahasiswa12[] listMhs;
    int idx;

    public MahasiswaBerprestasi12(int jumlahMahasiswa){
        listMhs = new Mahasiswa12[jumlahMahasiswa];
        idx=0;
    }

    void tambah (Mahasiswa12 mhs){
        if (idx<listMhs.length){
            listMhs[idx]=mhs;
            idx++;
        } else {
            System.out.println("data sudah penuh");
        }
    }
    void tampil() {
        for (Mahasiswa12 m:listMhs){
            if (m != null) { 
                m.tampilInformasi();
                System.out.println("---------------------------------");
            }
        }
    }
    void bubbleSort(){
        for (int i=0; i<listMhs.length-1; i++){
            for (int j=0; j<listMhs.length-1-i;j++){
                if (listMhs[j].ipk<listMhs[j+1].ipk){

                    Mahasiswa12 tmp = listMhs[j];
                    listMhs[j]=listMhs[j+1];
                    listMhs[j+1]=tmp;
                }
            }
        }
    }
    void SelectionSort(){
        for (int i=0; i<listMhs.length-1;i++){
            int idxMin=i;
            for (int j=i+1; j<listMhs.length;j++){
                if (listMhs[j].ipk<listMhs[idxMin].ipk){
                    idxMin=j;
                }
            }
            Mahasiswa12 tmp = listMhs[idxMin];
            listMhs[idxMin]=listMhs[i];
            listMhs[i]=tmp;
        }
    }
    void insertionSort(){
        for (int i=1; i<listMhs.length;i++){
            Mahasiswa12 temp = listMhs[i];
            int j=i;
            while (j>0 && listMhs[j-1].ipk>temp.ipk){
                listMhs[j]=listMhs[j-1];
                j--;
            }
            listMhs[j]=temp;
        }
    }
}

