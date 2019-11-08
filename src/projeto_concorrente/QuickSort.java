package projeto_concorrente;

/**
 *
 * @author genilton
 */
public class QuickSort implements Runnable{
    private int[] vector;    
    private int fist;
    private int last;

    public QuickSort(Numbers number) {
        this.vector = number.getVector();
    }

    public QuickSort(int fist, int last, Numbers number) {
        this.vector = number.getVector();
        this.fist = fist;
        this.last = last;
    }

    @Override
    public void run() {
        this.quickSort( this.fist, this.last);
    }
    
    public void quickSort(int fist, int last) {
        if (fist < last) {
            int pivot = part( fist, last);            
            quickSort( fist, pivot -1);
            quickSort(pivot + 1, last);
        }
    }    

    public int part(int fist, int last) {
        int pivot = this.vector[fist];
        int i = fist + 1, f = last;
        while (i <= f) {
            if (this.vector[i] <= pivot) {
                i++;
            } else if (pivot < this.vector[f]) {
                f--;
            } else {
                int swap = this.vector[i];
                this.vector[i] = this.vector[f];
                this.vector[f] = swap;
                i++;
                f--;
            }
        }
        this.vector[fist] = this.vector[f];
        this.vector[f] = pivot;
        return f;
    }
}
