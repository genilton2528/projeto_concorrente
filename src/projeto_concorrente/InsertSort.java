package projeto_concorrente;

/**
 *
 * @author genilton
 */
public class InsertSort implements Runnable {

    private int[] vector;
    private int max;
    private int fist, last;

    public InsertSort(Numbers number) {
        this.vector = number.getVector();
        this.max = number.getMax();
    }

    public InsertSort(int fist, int last, Numbers number) {
        this.vector = number.getVector();
        this.max = number.getMax();
        this.fist = fist;
        this.last = last;
    }

    @Override
    public void run() {
        this.insertionSortThread();
    }

    public void insertionSort() {
        int key, i, j;

        for (j = 1; j < this.max; j++) {
            key = this.vector[j];
            for (i = j - 1; (i >= 0) && (this.vector[i] > key); i--) {
                this.vector[i + 1] = this.vector[i];
            }
            this.vector[i + 1] = key;
        }
    }

    public void insertionSortThread() {
        int key, i, j;
        
        //double startTime = System.currentTimeMillis();
        
        for (j = this.fist + 1; j <= this.last; j++) {
            key = this.vector[j];
            for (i = j - 1; (i >= this.fist) && (this.vector[i] > key); i--) {
                this.vector[i + 1] = this.vector[i];
            }
            this.vector[i + 1] = key;
        }
        
        //double endTime = System.currentTimeMillis();
    }
}
