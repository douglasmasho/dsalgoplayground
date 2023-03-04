public class HighArrayUO {
    private long[] a;
    private int nElems;

    public HighArrayUO(int max){
        a = new long[max];
        nElems = 0;
    }

    public void Insert(long value){
        a[nElems] = value;
        nElems++;
    }

    public boolean Delete(long value){
        for(int j = 0; j < nElems; j++){
            if(a[j] == value){
                for(int k = j ; k < nElems; k++){ //shifting elements to the left
                    a[k] = a[k+1];
                }
                nElems--;
                return true;
            }
        }

        return false;
    }


    public boolean find(long value){
        for(int j = 0; j < nElems; j++){
            if(a[j] == value){
                return true;
            }
        }
        return false;
    }

    public int findInt(long value){
        for(int j = 0; j < nElems; j++){
            if(a[j] == value){
                return j;
            }
        }
        return -1;
    }

    public void display(){
        for(int j = 0; j < nElems; j++){
            System.out.println("" + a[j]);
        }
    }
}
