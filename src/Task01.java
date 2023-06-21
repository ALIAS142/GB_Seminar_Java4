//Заполнить список элементами Array и LinkedList

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Random;

public class Task01 {
    public static void main(String[] args) {
        Random rnd = new Random();
        ArrayList<Integer> list1 = new ArrayList<Integer>();
         long time_start = System.currentTimeMillis();
        for (int i = 0; i < 100000 ; i++) {
            int val = rnd.nextInt(100);
            list1.add(0, val);
        }
        long time_finish = System.currentTimeMillis();
        System.out.println(time_finish - time_start);

        long time_start2 = System.currentTimeMillis();
        LinkedList<Integer> list2 = new LinkedList<Integer>();
        for (int i = 0; i < 100000 ; i++) {
            int val = rnd.nextInt(100);
            list2.add(0,val);
        }
        long time_finish2 = System.currentTimeMillis();
        System.out.println(time_finish2 - time_start2);
    }
}
