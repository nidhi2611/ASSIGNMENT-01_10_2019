package question4;

import java.util.Scanner;

public class Question41 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the string");
        String string = sc.next();
        Question42 obj = new Question42(string);
        obj.output();

    }
}
