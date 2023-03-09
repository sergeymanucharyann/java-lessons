package exceptions.exercise3;

import java.util.Scanner;

public class Divide {
    public static void main(String[] args) {
        double a, b;
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter first number");
        a = scanner.nextDouble();

        System.out.println("enter second number");
        b = scanner.nextDouble();

        if (b == 0) throw new ArithmeticException("Second number is 0");
        System.out.println(a / b);

    }
}
