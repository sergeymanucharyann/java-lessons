package string_homework;

public class Main {
    public static void main(String[] args) {
        Strings str = new Strings();
        SecondStringHomework str1 = new SecondStringHomework();

        System.out.println(str.concat("hello", " world"));
        System.out.println(str.concat2(1, 2, " test code"));

        str.newLine("Java Academic Program");//2

        str.revers("Coffee");//3

        System.out.println(str.countSubString("Nice to meet you!!", "e"));//4

        System.out.println(str.toUppercase("java"));//5

        System.out.println(str.removeSymbol("java academic program"));//7
        System.out.println(str.transferSymA("java academic program"));//8

        str.getLongestWord("Hardships often prepare ordinary people for an extraordinary destiny");//9

        str.symbolIndex("oop in java ", "p");

        System.out.println(str1.firstSymbols("ozymandias"));
        System.out.println(str1.countXX("dxxx"));
        System.out.println(str1.palindrome("abcba"));
    }
}
