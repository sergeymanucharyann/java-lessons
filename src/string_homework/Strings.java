package string_homework;

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
        String[] arr;
        arr = str.split(" ");
        for (String s : arr) {
            System.out.println(s);
        }
    }

    /**
     * Ex.3
     * This method ...
     *
     * @param originalWord String
     * @return reversWorld String type
     */
    public String revers(String originalWord) {
        StringBuilder reverseWord = new StringBuilder();
        char ch;
        for (int i = 0; i < originalWord.length(); i++) {
            ch = originalWord.charAt(i);
            reverseWord.append(ch);
        }
        return reverseWord.toString();
    }

    /**
     * Ex.4
     *
     * @param line  String
     * @param token String
     * @return int
     */
    int countSubString(String line, String token) {
        int tokenCount = 0;
        for (int i = 0; i < line.length(); i++) {
            if (line.contains(token)) {
                tokenCount++;
            }
        }
        return tokenCount;
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
     *
     * @param line String
     * @return String
     */
    public String removeSymbol(String line) {
        return line.replaceAll("a", "");
    }

    /**
     * Ex.8
     *
     * @param line String
     * @return String
     */
    public String transferSymA(String line) {
        return line.replaceAll("a", "*");
    }

    /**
     * Ex.9
     *
     * @param string string
     */
    void getLongestWord(String string) {
        StringBuilder word = new StringBuilder();
        String large = "";
        String[] words = new String[100];
        int length = 0;

        string = string + " ";

        for (int i = 0; i < string.length(); i++) {
            if (string.charAt(i) != ' ') {
                word.append(string.charAt(i));
            } else {
                words[length] = word.toString();
                length++;
                word = new StringBuilder();
            }
        }

        for (int k = 0; k < length; k++) {
            if (large.length() < words[k].length())
                large = words[k];
        }
        System.out.println("Largest word: " + large);
    }

    /**
     * Ex.10
     *
     * @param line   Strong
     * @param symbol Strong
     */
    void symbolIndex(String line, String symbol) {
        System.out.println(line.indexOf(symbol));
    }

}
