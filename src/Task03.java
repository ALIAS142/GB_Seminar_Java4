import java.util.Scanner;
import java.util.Stack;

public class Task03 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter you line");
        String stroka = in.nextLine();
        Stack<String> list2 = new Stack<String>();

        while (!stroka.equals("exit")) {
             if (stroka.equals("print")) {
                while (!list2.empty()) {
                    System.out.println(list2.pop());
                }
            } else {
                list2.push(stroka);
            }
            System.out.println(list2);
            System.out.println("Enter you line");
            stroka = in.nextLine();
        }
        in.close();
    }
}