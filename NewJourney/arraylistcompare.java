package NewJourney;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class arraylistcompare {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>(Arrays.asList("naveen","Robert","Harsha","Neil","Sohail"));
        ArrayList<String> names2 = new ArrayList<>(Arrays.asList("naveen","Robert","Harsha","Neil","Sameer"));
        ArrayList<String> names3 = new ArrayList<>(Arrays.asList("Robert","Harsha","Neil","Sameer","naveen"));
        Collections.sort(names2);
        Collections.sort(names);

        System.out.println(names.equals(names2));

        Collections.sort(names3);
        System.out.println(names2.equals(names3));


        ArrayList<String> names4 = new ArrayList<>(Arrays.asList("naveen","Robert","Harsha","Neil","Sohail"));
        ArrayList<String> names5 = new ArrayList<>(Arrays.asList("naveen","Robert","Harsha","Neil","Sameer"));

//                names4.removeAll(names5);
//        System.out.println(names4);
//
//        names5.removeAll(names4);
//        System.out.println(names5);

        names4.retainAll(names5);
        System.out.println(names4);
    }
}
