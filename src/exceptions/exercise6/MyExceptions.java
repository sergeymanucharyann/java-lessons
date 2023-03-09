package exceptions.exercise6;

import java.util.Scanner;

public class MyExceptions {
    public static void main(String[] args) throws Exception {
        System.out.println("Enter (1-3) -> ");
        Scanner scanner = new Scanner(System.in);
        int l = scanner.nextInt();
        try {
            switch (l) {
                case 1:
                    throw new FirstException("1");
                case 2:
                    throw new SecondException("2");
                case 3:
                    throw new ThirdException("3");
                default: throw new Exception(" Default");
            }

        } catch (Exception e) {
            System.out.println(e);
            throw e;
        }

    }
}
