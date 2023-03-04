public class HighArrayO {
    private long[] a;
    private int nElems;

    public HighArrayO(int maxSize){
        a = new long[maxSize];
        nElems = 0;
    }


    //in insert ALWAYS remember to shift before doing the actual insertion or else you will lose data
    //always remember to increment nElems at the end
    public void Insert(long value){

            for(int j = 0; j < nElems; j++){
                if(a[j] > value){ //found the index to place it in
                    for(int k = nElems; k > j; k--){ //shift to the right
                        a[k] = a[k-1];
                    }
                    a[j] = value; //insert
                    nElems++; //increment
                    return; //return so that the last part does not run
                }
            }
        //if, at the end of the loop, you don't find a number greater than the number you want to insert,
        //just insert at the end
        a[nElems] = value;
        nElems++;
    }

    //always remember to decrement nElems at the end
    //always remember to break out the loop when you found the index to delete from
    public boolean Delete(long value){

        for(int j = 0; j < nElems; j++){
            if(a[j] == value){
                for(int k = j; k < nElems; k++){ //shift to the left
                    a[k] = a[k+1];
                }
                nElems--; //decrement
                return true; //return true
            }
        }

        return false;
    }

    public boolean find(long searchKey){
        for(int j = 0; j < nElems; j++){
            if(a[j] == searchKey){
                return true;
            }
        }

        return false;
    }

    public int findInt(long searchKey){
        for(int j = 0; j < nElems; j++){
            if(a[j] == searchKey){
                return j; //return index of searchKey
            }
        }
        return -1; //not found
    }

    public void display(){
        for(int j = 0; j < nElems; j++){
            System.out.println("" + a[j]);
        }
    }
}
