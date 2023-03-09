package exceptions.exercise2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ListOfIntegers {
    public static void main(String[] args) {
        int n, x[], s = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Count of Numbers -> ");
        try {
            n = scanner.nextInt();
            x = new int[n];
            for (int i = 0; i < n; i++) {
                x[i] = scanner.nextInt();
                s += x[i];
            }
            System.out.println(s);
        } catch (InputMismatchException e) {
            System.out.println("not a number ");
            throw new InputMismatchException("not a number");
        }

    }
}
