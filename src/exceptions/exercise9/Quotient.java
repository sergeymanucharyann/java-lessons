package exceptions.exercise9;

import java.util.Scanner;

public class Quotient {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.println("Enter first number");
        int a = scanner.nextInt();
        System.out.println("enter the second number");
        int b = scanner.nextInt();

        System.out.println(a/b);

    }
}
