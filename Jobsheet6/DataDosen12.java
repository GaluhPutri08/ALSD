public class DataDosen12 {
    Dosen12[] listDsn;
    int idx;

    public DataDosen12(int jumlahDosen){
        listDsn = new Dosen12[jumlahDosen];
        idx=0;
    }
    void tambah(Dosen12 dsn){
        if (idx<listDsn.length) {
            listDsn[idx]=dsn;
            idx++;
        }else {
            System.out.println("Data sudah penuh");
        }
    }
    void tampil(){
        for (Dosen12 d:listDsn){
            if (d!= null) {
                d.tampilInformasi();
                System.out.println("-----------------------------------");
            }
        }
    }
    void bubbleSort(){
        for (int i=0; i<listDsn.length-1; i++){
            for (int j=0; j<listDsn.length-1-i;j++){
                if (listDsn[j].usia>listDsn[j+1].usia){

                    Dosen12 tmp = listDsn[j];
                    listDsn[j]=listDsn[j+1];
                    listDsn[j+1]=tmp;
                }
            }
        }
    }
    void SelectionSort(){
        for (int i=0; i<listDsn.length-1;i++){
            int idxMax=i;
            for (int j=i+1; j<listDsn.length;j++){
                if (listDsn[j].usia>listDsn[idxMax].usia){
                    idxMax=j;
                }
            }
            Dosen12 tmp = listDsn[idxMax];
            listDsn[idxMax]=listDsn[i];
            listDsn[i]=tmp;
        }
    }
    void insertionSort(){
        for (int i=1; i<listDsn.length;i++){
            Dosen12 temp = listDsn[i];
            int j=i;
            while (j>0 && listDsn[j-1].usia<temp.usia){
                listDsn[j]=listDsn[j-1];
                j--;
            }
            listDsn[j]=temp;
        }
    }
}