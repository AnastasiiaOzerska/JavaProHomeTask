package task5.src.first;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
    String randomString = "cat";
        ArrayList<String> animals = new ArrayList<>(Arrays.asList("cat","dog","rat","duck","squirrel","sheep","cat","cow","dog","dragon","cat"));

        System.out.println("Quantity of repeat animal " + randomString+ " is " + counter(animals,randomString));
        }
        public static int counter(ArrayList<String> animals,String randomString){
        int number = 0;
            for (int i = 0; i < animals.size(); i++) {
                if(animals.get(i).equals(randomString)){
                    number++;
                }

            }
            return number;
        }
    }
