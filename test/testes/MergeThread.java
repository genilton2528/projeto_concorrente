package testes;


import java.util.ArrayList;

public class MergeThread implements Runnable {

    private static ArrayList<Integer> array;
    private static ArrayList<Integer> result;

    MergeThread(ArrayList<Integer> array) {
        MergeThread.array = array;
    }

    @Override
    public void run() {
        ArrayList<Integer> left = new ArrayList<>();
        ArrayList<Integer> right = new ArrayList<>();

        if (array.size() <= 1) {
            System.out.println("one element: " + array.toString());
            return;
        }

        int middle = array.size() / 2;

        for (int i = 0; i < middle; i++) {
            left.add(array.get(i));
        }

        for (int j = middle; j < array.size(); j++) {
            right.add(array.get(j));
        }

        System.out.println("array left: " + left.toString());
        System.out.println("array right: " + right.toString());

        Thread threadleft = new Thread(new MergeThread(left));
        Thread threadright = new Thread(new MergeThread(right));

        threadleft.start();
        threadright.start();
        try {
            threadleft.join();
            threadright.join();
        } catch (InterruptedException e) {
        }

        //need to set left and right results here
        mergeLeftRight(left, right);
        System.out.println("result: " + array.toString());
    }

    public ArrayList<Integer> mergeLeftRight(ArrayList<Integer> left, ArrayList<Integer> right) {
        ArrayList<Integer> resulttemp = new ArrayList<>();
        System.out.println("Left, right: " + left.toString() + " " + right.toString());
        while (left.size() > 0 || right.size() > 0) {
            if (left.size() > 0 && right.size() > 0) {
                if (left.get(0) <= right.get(0)) {
                    resulttemp.add(left.get(0));
                    left.remove(0);
                } else {
                    resulttemp.add(right.get(0));
                    right.remove(0);
                }
            } else if (left.size() > 0) {
                resulttemp.add(left.get(0));
                left.remove(0);
            } else if (right.size() > 0) {
                resulttemp.add(right.get(0));
                right.remove(0);
            }
        }
        return resulttemp;
    }
}
