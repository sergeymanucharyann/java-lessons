package exceptions.exercise5;

import java.util.Scanner;

public class Root {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a;
        System.out.println("enter a number ->");
        a = scanner.nextInt();

        try {
            if (a < 0) throw new ArithmeticException("Invalid input");
            System.out.println(Math.sqrt(a));
        } finally {
            System.out.println(" good Bye");
        }
    }
}
