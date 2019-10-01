package question1;

import java.util.Scanner;

public class Question11 {
    public static void main(String[] agrs) {
        Scanner sc = new Scanner(System.in);
        String string = sc.next();
        Question12 obj = new Question12(string);
        obj.modify();
    }
}
