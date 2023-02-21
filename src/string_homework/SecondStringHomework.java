package string_homework;

public class SecondStringHomework {
    /**
     * Ex.1
     *
     * @param word String
     * @return String
     */
    String firstSymbols(String word) {
        if (word.startsWith("oz")) {
            return "oz";
        } else if (word.startsWith("o")) {
            return "o";
        } else if (word.startsWith("z")) {
            return "z";
        } else {
            return "";
        }
    }

    /**
     * Ex.2
     *
     * @param line String
     * @return String
     */
    int countXX(String line) {
        int count = 0;
        for (int i = 0; i < line.length() - 1; i++) {
            if (line.substring(i, i + 2).equals("xx")) {
                count++;
            }
        }
        return count;
    }

    /**
     * Ex. 3
     *
     * @param line String
     * @return boolean
     */
    boolean palindrome(String line) {
        String reverseLine = "";
        int strLength = line.length();

        for (int i = (strLength - 1); i >= 0; --i) {
            reverseLine = reverseLine + line.charAt(i);
        }

        if (line.equalsIgnoreCase(reverseLine)) {
            return true;
        } else {
            return false;
        }
    }



}


