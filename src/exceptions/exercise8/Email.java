package exceptions.exercise8;

import java.util.Scanner;

public class Email {
    public static void main(String[] args) throws InvalidEmail {
        System.out.println("enter your email address -> ");
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();

        int countDog = 0;
        int dogIndex = 0;
        int countDotAfterDot = 0;
        int dotIndex = 0;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '@') {
                countDog++;
                dogIndex = i;
            }
        }

        if (countDog != 1) throw new InvalidEmail("invalid email");


        for (int i = dogIndex; i < str.length(); i++) {
            if (str.charAt(i) == '.') {
                countDotAfterDot++;
                dotIndex = i;
            }
        }

        if (countDotAfterDot != 1 || dotIndex - dogIndex < 2 || str.length() - dotIndex < 2)
            throw new InvalidEmail("invalid email");

        System.out.println("success");
    }


}
