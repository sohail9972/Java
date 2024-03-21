package NewJourney;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class iteratoronarrayList {
    public static void main(String[] args) {

        ArrayList<String> arr = new ArrayList<>();
        arr.add("sohail");
        arr.add("tanveer");
        arr.add("shoba");
        arr.add("Ravi");
        arr.add("rahul");
        arr.add("abhishek");

        for (int i=0;i<arr.size();i++){
            System.out.println(arr.get(i));
        }

        for (String s:arr) {
            System.out.println(s);
        }

        Iterator<String> it= arr.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }

        ArrayList<Integer> arrint= new ArrayList<Integer>(Arrays.asList(10,20,16,32));
        System.out.println(arrint);
    }
}
