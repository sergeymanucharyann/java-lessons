package stringHomework;

public class Strings {

    /**
     * Ex. 1.1
     * This method is used for concatenation.
     *
     * @param first  String
     * @param second String
     * @return String
     */
    public String concat(String first, String second) {
///        first = "hello";
//        second = "world";
        return first + second;
    }

    /**
     * Ex.1.2
     * This method is used for concatenation.
     *
     * @param first  int
     * @param second int
     * @param third  String
     * @return String
     */
    public String concat2(int first, int second, String third) {

        return first + second + third;
    }

    /**
     * Ex.2
     * This method ...
     *
     * @param str String
     */
    void newLine(String str) {
        String[] arr = null;
        arr = str.split(" ");
        for (String s : arr) {
            System.out.println(s);
        }
    }


// /   void ppp(){
//        String str = new String("hello world");
//        for (int i = 0; i < str.length(); i++) {
//            if (str[i] == " ") {
//                str[i] = "\n";
//            }
//        }
//        System.out.println(str);
//    }


    /**
     * Ex.3
     * This method ...
     *
     * @param originalWord String
     * @return reversWorld String type
     */
    public String revers(String originalWord) {
        String reverseWord = "";
        char ch;
        for (int i = 0; i < originalWord.length(); i++) {
            ch = originalWord.charAt(i);
            reverseWord = ch + reverseWord;
        }
        return reverseWord;
    }

    /**
     * Ex.4
     * @param line String
     * @param token String
     * @return int
     */
    int countSubString(String line, String token) {
        for (int i = 0; i < line.length(); i++) {

        }
        return 0;
    }

    /**
     * Ex.5
     * This method ...
     *
     * @param originalLine String
     * @return String
     */
    public String toUppercase(String originalLine) {
        return originalLine.toUpperCase();
    }

    //6 TODO
    public String toAddSymbols() {

        return null;
    }

    /**
     * Ex.7
     * @param line String
     * @return String
     */

    public String removeSymbol(String line) {
        return line.replaceAll("a","");
    }

    /**
     * Ex.8
     *
     * @param line
     * @return
     */
    public String transferSymA(String line) {
        return line.replaceAll("a","*");
    }

}
