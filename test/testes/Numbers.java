package testes;



import projeto_concorrente.*;
import java.util.Random;

/**
 *
 * @author genilton
 */
public class Numbers{
    Random generator;
    private int max;
    private int vector[];

    public Numbers(int max) {
        this.max = max;
        this.vector = new int[max];
        this.generator = new Random(0);
    }

    public Numbers() {
    }

    public Numbers(Numbers number) {
        this.max = number.max;
        this.vector = number.vector.clone();
    }

    public int getMax() {
        return max;
    }

    public void setMax(int max) {
        this.max = max;
    }

    public int[] getVector() {
        return vector;
    }

    public void setVector(int[] vector) {
        this.vector = vector;
    }

    public void random() {
        for (int i = 0; i < this.max; i++) {
            this.vector[i] = this.generator.nextInt(this.max);
        }
    }
}
