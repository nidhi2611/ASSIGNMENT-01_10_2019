package question11;

import java.util.Scanner;

public class Question111 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String string = sc.next();
        char ch = sc.next().trim().charAt(0);
        Question112 obj = new Question112(string, ch);
        obj.output();

    }
}
