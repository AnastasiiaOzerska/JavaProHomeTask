package task6_1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> palindromes = new ArrayList<>(Arrays.asList("A man, a plan, a canal: Panama","Was it a car or a cat I saw", " ", "race a car"));
        for (int i = 0; i < palindromes.size(); i++) {
            if(checkingPalindrome(palindromes.get(i))){
                if(palindromes.get(i).equals(" ")){
                    System.out.println("Phrase " + palindromes.get(i) + " after removing non-alphanumeric characters.\n" +
                            "Since an empty string reads the same forward and backward, it is a palindrome.");
                    continue;
                }
                System.out.println("Phrase \" "+ palindromes.get(i) + " \" is palindrome");
            }
            else {System.out.println("Phrase \" "+ palindromes.get(i) + " \" is not palindrome");}

        }
    }
    public static boolean checkingPalindrome(String phrase){
        phrase = phrase.replaceAll("\\W","");
        StringBuilder master = new StringBuilder(phrase);
        master.reverse();
        String updatedPhrase = master.toString();

        return phrase.equalsIgnoreCase(updatedPhrase);
    }
}
