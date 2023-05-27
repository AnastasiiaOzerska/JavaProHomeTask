package task5.second;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        String[] flowers = new String[]{ "violet", "rose", "peonies", "tulip", "chamomile","eustoma", "lily", "daffodil"};
        System.out.println(toList(flowers));
    }
    public static ArrayList<String> toList(String[]flowers){
        ArrayList<String> listFlowers= new ArrayList<>();
        for (String plants: flowers) {
            listFlowers.add(plants);

        }
        return listFlowers;
    }
}
