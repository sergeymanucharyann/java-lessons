package exceptions.exercise7;

import java.util.Scanner;

public class Age {
    public static void main(String[] args) throws InvalidAge{
        Scanner scanner = new Scanner(System.in);
        int age = scanner.nextInt();

        if (age<0 || age >120) throw new InvalidAge("invalige age");
        System.out.println("sucsess");
    }
}
