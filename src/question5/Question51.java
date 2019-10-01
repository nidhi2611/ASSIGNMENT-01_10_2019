package question5;

import java.util.Scanner;

public class Question51 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        Question52 obj = new Question52(str);
        System.out.print(obj.output());
    }
}
