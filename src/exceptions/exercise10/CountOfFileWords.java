package exceptions.exercise10;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class CountOfFileWords {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();

        try {
            java.io.File file = new java.io.File(str);
            FileInputStream fis = new FileInputStream(file);
            System.out.println("file content: ");
            int r = 0, s = 0;
            if ((r = fis.read()) != -1) {
                s = 1;
                while ((r = fis.read()) != -1) {
                    if ((char) r == ' ') s++;
                    System.out.println((char) r);
                }
            }
            System.out.println("Count = " + s);
        } catch (FileNotFoundException e) {
            throw new FileNotFoundException("not found");
        } catch (IOException e) {
            throw new RuntimeException(e + "!!!!!!!!!!");
        }
    }

}
