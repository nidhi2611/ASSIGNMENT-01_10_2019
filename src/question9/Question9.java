package question9;

import java.util.Scanner;

public class Question9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String string = sc.next();
        Question91 obj = new Question91(string);
        System.out.print(obj.absolute_weight());
    }
}
