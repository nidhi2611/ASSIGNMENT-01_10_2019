package question10;

import java.util.Scanner;

public class Question101 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String string = sc.next();
        char ch = sc.next().trim().charAt(0);
        Question102 obj = new Question102(string, ch);
        System.out.print(obj.index());

    }
}
