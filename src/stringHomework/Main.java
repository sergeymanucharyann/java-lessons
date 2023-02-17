package stringHomework;

public class Main {
    public static void main(String[] args) {
        Strings str = new Strings();

        System.out.println(str.concat("hello" , " world"));
        System.out.println(str.concat2(1,2," anime"));

        str.newLine("Java Academic Program");

        str.revers("Coffee");

        str.countSubString("helli ji jmi", "i");

        System.out.println(str.toUppercase("java"));

        System.out.println(str.removeSymbol("java academic program"));

        System.out.println(str.transferSymA("java academic program"));

    }
}
