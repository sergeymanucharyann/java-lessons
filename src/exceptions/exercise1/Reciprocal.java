package exceptions.exercise1;

import java.util.Scanner;

public class Reciprocal {
    public static void main(String[] args) {
        System.out.println("Input Integers without 0 ->");
        Scanner scanner = new Scanner(System.in);
        double answer;
        int x = scanner.nextInt();

        if (x == 0) throw new ArithmeticException("You entered 0");
        answer = 1.0 / x;
        System.out.println(answer);

    }
}
