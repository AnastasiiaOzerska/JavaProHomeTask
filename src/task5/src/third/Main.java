package task5.src.third;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(1,45,23,87,3,45,2,4,9,1,3,4,7,45,34,0));
        System.out.println(findUnique(numbers));
    }
    public static ArrayList<Integer> findUnique(ArrayList <Integer> numbers){
        ArrayList<Integer> uniqueNumber = new ArrayList<>();
        for (Integer number: numbers) {
            int count = Collections.frequency(numbers,number);
            if(count==1){
                uniqueNumber.add(number);
            }

        }
        return uniqueNumber;
    }
}
