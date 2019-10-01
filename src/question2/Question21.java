package question2;

import java.util.Scanner;

public class Question21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String string = sc.next();
        int index = sc.nextInt();
        Question22 obj = new Question22(string, index);
        System.out.println(obj.output());
    }
}
