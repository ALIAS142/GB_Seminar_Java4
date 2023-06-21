//Даны два Deque, представляющие два целых числа. Цифры хранятся в обратном порядке и каждый из их узлов
// содержит одну цифру.
//        1) Умножьте два числа и верните произведение в виде связанного списка.
//        2) Сложите два числа и верните сумму в виде связанного списка.
//        Одно или два числа могут быть отрицательными.
//
//        Даны два Deque, цифры в обратном порядке.
//        [3,2,1] - пример Deque
//        [5,4,3]- пример второго Deque
//        1) 123 * 345 = 42 435
//        Ответ всегда - связный список, в обычном порядке
//        [4,2,4,3,5] - пример ответа


import java.util.*;

public class HW4 {
    public static void main(String[] args) {
        Deque<Integer> deque1 = new ArrayDeque<>();
        Deque<Integer> deque2 = new ArrayDeque<>();
        deque1.add(3);
        deque1.add(2);
        deque1.add(1);
        deque2.add(5);
        deque2.add(4);
        deque2.add(3);
        System.out.println(deque1);
        System.out.println(deque2);

        StringBuilder sb1 = new StringBuilder();
        for (int i = deque1.size() - 1; i >= 0; i--) {
            sb1.append(deque1.pollLast());
        }
        StringBuilder sb2 = new StringBuilder();
        for (int i = deque2.size() - 1; i >= 0; i--) {
            sb2.append(deque2.pollLast());
        }

        System.out.println(sb1);
        System.out.println(sb2);

        String num1 = new StringBuilder(sb1).toString();
        String num2 = new StringBuilder(sb2).toString();
        int numb1 = Integer.parseInt(num1);
        int numb2 = Integer.parseInt(num2);
        int mult = numb1 * numb2;

        System.out.println(mult);
        String fStr = "" + mult;

        char[] chars = fStr.toCharArray();
        LinkedList<Character> fStrList = new LinkedList<>();
        for (int i = 0; i < chars.length; i++) {
            fStrList.add(chars[i]);
        }
        System.out.println(fStrList);
    }
}


