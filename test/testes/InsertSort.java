package testes;

public class InsertSort implements Runnable {

    public  int[] array;
    private int fist;
    private int last;

    public InsertSort() {
    }

    public InsertSort(int fist, int last, int[] array) {
        this.array = array;
        this.fist = fist;
        this.last = last;
    }

    @Override
    public void run() {
        this.insertionSort();
    }

    public void insertionSort() {
        int key, i, j;
                
        for (j = this.fist + 1; j <= this.last; j++) {
            key = this.array[j];
            for (i = j - 1; (i >= this.fist) && (this.array[i] > key); i--) {
                this.array[i + 1] = this.array[i];
            }
            this.array[i + 1] = key;
        }
        System.err.print(Thread.currentThread().getName()+": ");
        for(int x = this.fist; x <= this.last; x++){
            System.err.print(" " + this.array[x] + ",");
        }
        System.err.println("");
    }
}
