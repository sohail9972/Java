package NewJourney;

import java.util.ArrayList;

public class arrayListConcept {
    public static void main(String[] args) {
        ArrayList<Object> ar = new ArrayList<Object>();
        ar.add(100);
        ar.add("hello");
        ar.add(12.33);
        System.out.println(ar);
        System.out.println(ar.get(2));
    }
}
