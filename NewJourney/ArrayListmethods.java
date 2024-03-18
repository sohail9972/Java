package NewJourney;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

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


//        arr.clear();
//        System.out.println(arr);
//        System.out.println(arr2);

        ArrayList<String> arrclone= (ArrayList<String>)arr.clone();
        System.out.println(arrclone);

        System.out.println(arr.contains("Thor"));

        ArrayList<String> list1= new ArrayList<String>(Arrays.asList("10","20","30","45","64","75"));
        int i =list1.lastIndexOf("75");
        System.out.println(i);

        ArrayList<Integer> list2 = new ArrayList<>(Arrays.asList(10,20,35,65,25,12,42,56,75,48,69,98));
        list2.removeIf(num -> num%2!=0);
        System.out.println(list2);
        
        
        ArrayList<String> names = new ArrayList<String>(Arrays.asList("Thor","Spiderman","Ant man","Ironman","Hulk","Ant man"));
        names.retainAll(Collections.singleton("Ant man"));
        System.out.println(names);

        ArrayList<String> names1 = new ArrayList<String>(Arrays.asList("Thor","Spiderman","Ant man","Ironman","Hulk","Ant man"));
        ArrayList<String> subnames= new ArrayList<>(names1.subList(0,3));
        System.out.println(subnames);

        ArrayList<String> names2 = new ArrayList<String>(Arrays.asList("Thor","Spiderman","Ant man","Ironman","Hulk","Ant man"));
        Object arrnames[] =names2.toArray();
        System.out.println(Arrays.toString(arrnames));

        for (Object c: arrnames) {
            System.out.println(c);

        }
    }

}
