package NewJourney;

import java.util.ArrayList;

public class ArrayListmethods {
    public static void main(String[] args) {
        ArrayList<String> arr =new ArrayList<>();
        arr.add("loki");
        arr.add("Iron Man");
        arr.add("Hulk");
        arr.add("Captain America");
        arr.add("Thor");
        arr.add("Spider man");
        arr.add("Ant Man");

        ArrayList<String> arr2=new ArrayList<>();
        arr2.add("Wonder women");
        arr2.add("ant wasp");
        arr2.add("fighter");
        arr2.add("Penny");
        arr2.add("sheldon");

        arr.addAll(arr2);
        System.out.println(arr);
    }
}
