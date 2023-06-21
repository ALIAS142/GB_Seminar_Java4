import javax.swing.*;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;

public class Task04 {
    public static void main(String[] args) {
        Random rnd = new Random();
        int[] arc = new int[10];

        for (int i = 0; i < 10 ; i++) {
            int val = rnd.nextInt(100);
            arc[i] = val;
        }
        System.out.println(InArr(arc));
    }

    public static Queue<Integer> InArr(int[] array){
     Queue<Integer> resault = new LinkedList<>();
        for (int i: array
             ) {
            resault.add(i);
        }
        return resault;
    }
}