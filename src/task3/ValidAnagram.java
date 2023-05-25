package task3;

import java.util.Arrays;

public class ValidAnagram {
    boolean isAnagramSort(String string1, String string2) {
        if (string1.length() != string2.length()) {
            return false;
        }
        char[] a1 = string1.toCharArray();
        char[] a2 = string2.toCharArray();
        Arrays.sort(a1);
        Arrays.sort(a2);
        return Arrays.equals(a1, a2);
    }

    public static class Main {
        public static void main(String[] args) {
            String firstWord = "string";
            String secondWord = "gnirts";
            ValidAnagram comparator = new ValidAnagram();
            if (comparator.isAnagramSort(firstWord, secondWord) == true) {
                System.out.println(firstWord + " is anagram " + secondWord);

            } else {
                System.out.println(firstWord + " is not anagram " + secondWord);
            }
        }
    }
}
