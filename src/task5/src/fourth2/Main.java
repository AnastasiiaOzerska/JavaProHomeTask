package task5.src.fourth2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> mountains = new ArrayList<>(Arrays.asList("Hoverla", "Mont blanc", "Mckinley", "Elbrus", "Kosciuszko", "Hoverla", "Mckinley","Hoverla","Kilimanjaro","Elbrus","Everest","Elbrus","Aconcagua","Kilimanjaro","Elbrus","Mont blanc","Kosciuszko"));
        System.out.println(findOccurrence(mountains));
    }
    public static ArrayList<String> findOccurrence(ArrayList<String> mountains){
        ArrayList<String> uniqueMount = new ArrayList<>();
        for (String mount:mountains) {
            int count = Collections.frequency(mountains,mount);
            if(!uniqueMount.contains("\n {name: \" " + mount + " \" occurrence: " + count + " }")){
                uniqueMount.add("\n {name: \" " + mount + " \" occurrence: " + count + " }");

            }

    }
        return uniqueMount;
    }}
