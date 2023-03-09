package exceptions.exercise4;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class File {

    public static void main(String[] args) throws FileNotFoundException {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();

        try {
            java.io.File file = new java.io.File(str);
            FileInputStream fis = new FileInputStream(file);
            System.out.println("file content: ");
            int r = 0;
            while ((r = fis.read()) != -1) {
                System.out.println((char) r);
            }
        } catch (FileNotFoundException e) {
            throw new FileNotFoundException("not found");
        } catch (IOException e) {
            throw new RuntimeException(e + "!!!!!!!!!!");
        }
    }


}
