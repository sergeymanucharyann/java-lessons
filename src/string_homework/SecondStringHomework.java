package string_homework;


import array_homework.Array;

import java.util.ArrayList;
import java.util.List;

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

    /**
     * Ex. 4
     *
     * @param stringArray String[]
     * @return ArrayList
     */
    ArrayList<String> toLoweCaseA(String[] stringArray) {
        ArrayList<String> returnLine = new ArrayList<String>();
        for (int i = 0; i < stringArray.length; i++) {
            if (stringArray[i].length() == 3) {
                if (stringArray[i].startsWith("a")) {
                    returnLine.add(stringArray[i]);
                }
            }
        }

        return returnLine;
    }

    /**
     * Ex.8
     *
     * @param string1
     * @param string2
     * @return
     */
    public String longestCommonSubstring(String string1, String string2) {
        int count = 0;
        List<String> strings1 = allSubStrings(string1);
        List<String> strings2 = allSubStrings(string2);
        List<String> commonSubStrings = new ArrayList<>();

        for (int i = 0; i < strings1.size(); i++) {
            if (strings2.contains(strings1.get(i))) {
                commonSubStrings.add(strings1.get(i));
            }
        }
        int maxLengthIndex = 0;
        int maxLength = 1;
        for (int i = 0; i < commonSubStrings.size(); i++) {
            if (maxLength < commonSubStrings.get(i).length()) {
                maxLength = commonSubStrings.get(i).length();
                maxLengthIndex = i;
            }
        }
        return commonSubStrings.get(maxLengthIndex);
    }

    /**
     * This method used in Exercise 8
     *
     * @param str String
     * @return List of Strings
     */
    public List<String> allSubStrings(String str) {
        List<String> subStrings = new ArrayList<>();
        for (int i = 0; i < str.length() - 1; i++) {
            for (int j = i; j < str.length(); j++) {
                if (!subStrings.contains(str.substring(i, j + 1))) {
                    subStrings.add(str.substring(i, j + 1));
                }
            }
        }
        return subStrings;
    }


    /**
     * Ex.9
     *
     * @param string1 String
     * @param string2 String
     * @return int
     */
    public int commonCharacterCount(String string1, String string2) {
        int count = 0;
        List<Character> string1chars = allCharacters(string1);
        List<Character> string2chars = allCharacters(string2);

        for (int i = 0; i < string1chars.size(); i++) {
            if (string2chars.contains(string1chars.get(i))) {
                count++;
            }
        }
        return count;
    }

    /**
     * This method used in Exercise 9
     *
     * @param str String
     * @return List<Character>
     */
    public List<Character> allCharacters(String str) {
        List<Character> characters = new ArrayList<>();
        for (int i = 0; i < str.length(); i++) {
            if (!characters.contains(str.charAt(i))) {
                characters.add(str.charAt(i));
            }
        }
        return characters;
    }


}
