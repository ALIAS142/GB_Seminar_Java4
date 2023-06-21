//Реализовать конмольное приложение: Пользователь вводит строку Text;
//Сохранем текст в список; Если введено ptint~num, выводит строку из позиции Num и удаляет ее из списка.

import java.util.LinkedList;
import java.util.Scanner;

public class Task02 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter you line");
        String stroka = in.nextLine();

        LinkedList<String> list1 = new LinkedList<String>();

        while (!stroka.equals("exit")){
            if (stroka.startsWith("print~")) {
                int number = Integer.parseInt(stroka.split("~")[1]);
                list1.remove(number);

            }
            else {
                list1.add(stroka);

        }
            System.out.println(list1);
            System.out.println("Enter you line");
            stroka = in.nextLine();
        }
    }
}