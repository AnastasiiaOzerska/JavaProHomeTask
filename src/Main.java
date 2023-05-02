
public class Main {
    public static void main(String[] args) {
         String firstWord = "string";
         String secondWord = "gnirts";
        ValidAnagram  comparator = new ValidAnagram();
        if (comparator.isAnagramSort(firstWord,secondWord)== true ){
            System.out.println(firstWord + " is anagram " + secondWord);

        }
        else {
            System.out.println(firstWord + " is not anagram "+ secondWord);
        }
    }
}