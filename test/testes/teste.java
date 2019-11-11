package testes;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author genilton
 */
public class teste {

    public static void main(String args[]) throws InterruptedException {
        ArrayList<Files> list = new ArrayList<>();
        
        list.add(new Files("1", "Tamanho"));
        list.add(new Files("8", "Tamanho"));
        list.add(new Files("2", "Tamanho"));
        list.add(new Files("9", "Tamanho"));
        list.add(new Files("3", "Tamanho"));
        list.add(new Files("5", "Tamanho"));
        list.add(new Files("4", "Tamanho"));
        
        System.out.println(list.toString());
        Collections.sort(list);
        System.out.println(list.toString());
    }
}

//        Numbers numbers = new Numbers(10);
//        numbers.random();
//
//        System.out.println(Arrays.toString(numbers.getVector()));
//
//        double startTime = System.currentTimeMillis();
////        new QuickSort(numbers).quickSort( 0, 9);
//        Thread thread1 = new Thread(new QuickSort( 0, 4, numbers));
//        Thread thread2 = new Thread(new QuickSort( 5, 9, numbers));
//        thread1.start();
//        thread2.start();
//        thread1.join();
//        thread2.join();
//        System.out.println(Arrays.toString(numbers.getVector()));
//        new QuickSort(numbers).quickSort(0, 9);        
//        double endTime = System.currentTimeMillis();
//
//        System.out.println("Tempo Sequencial: " + (endTime - startTime) + "ms");
//        System.out.println(Arrays.toString(numbers.getVector()));
