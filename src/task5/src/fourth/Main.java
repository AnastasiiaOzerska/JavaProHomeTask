package task5.src.fourth;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> mountains = new ArrayList<>(Arrays.asList("Hoverla", "Mont blanc", "Mckinley", "Elbrus", "Kosciuszko", "Hoverla", "Mckinley","Hoverla","Kilimanjaro","Elbrus","Everest","Elbrus","Aconcagua","Kilimanjaro","Elbrus","Mont blanc","Kosciuszko"));
            calcOccurance(mountains);
    }
    public static void calcOccurance(ArrayList<String> mountains){
        ArrayList<String> uniqueMount = new ArrayList<>();
        for (String mount:mountains) {
            int count = Collections.frequency(mountains,mount);
            if(uniqueMount.contains(mount)){
                continue;
            } else {
                uniqueMount.add(mount);
            }
            System.out.println("mount " + mount + " :" + count);

        }
    }
}
