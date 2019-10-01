package question8;

import java.util.Scanner;

public class Question81 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        Question82 obj = new Question82(str);
        System.out.print(obj.upper_case_weight());
    }
}
