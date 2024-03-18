package NewJourney;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.stream.Collectors;

public class removingduplicates {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(1,2,3,4,5,1,2,3,4,5,6,8,9,7,45,6,89,45,31,3,41));

        LinkedHashSet<Integer> list= new LinkedHashSet<Integer>(numbers);
        ArrayList<Integer> elementsnonrepeat= new ArrayList<Integer>(list);
        System.out.println(elementsnonrepeat);

        // using Stream Method
        ArrayList<Integer> num = new ArrayList<>(Arrays.asList(1,2,3,4,5,1,2,3,4,5,6,8,9,7,45,6,89,45,31,3,41));
        List<Integer> listStream= num.stream().distinct().collect(Collectors.toList());
        System.out.println(listStream);
    }
}
