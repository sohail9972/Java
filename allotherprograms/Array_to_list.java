package allotherprograms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;

public class Array_to_list {
    public static void main(String[] args) {
//        String[] arr = {"manish", "poul", "kdx", "royal", "killer"};
//        System.out.println(Arrays.toString(arr));
//
//        //Converting a allotherprograms.Array to List
//    List<String> arr_to_list= new ArrayList<String>();
//    for (String lang:arr){
//        arr_to_list.add(lang);
//    }
//        System.out.println(arr_to_list);

        //########################################################
        //converting the List to the allotherprograms.Array

//        List<String> fruitlist=new ArrayList<>();
//        fruitlist.add("mango");
//        fruitlist.add("pineapple");
//        fruitlist.add("apple");
//        fruitlist.add("grapes");
//        fruitlist.add("butterfruit");
//
//        String[] arr=fruitlist.toArray(new String[fruitlist.size()]);
//        System.out.println(Arrays.toString(arr));

        //##########################################
//ListIterator interface

        List<String> list_iterator=new ArrayList<>();
        list_iterator.add("Amint");
        list_iterator.add("vishwa");
        list_iterator.add("bottle");
        list_iterator.add("minister");
        list_iterator.add("profile");
        ListIterator<String> itr=list_iterator.listIterator();
        System.out.println("one direction");
        while (itr.hasNext()){
            System.out.println(itr.nextIndex()+" "+itr.next());

        }
        System.out.println("backward");
        while (itr.hasPrevious()){
            System.out.println(itr.previousIndex()+" "+itr.previous());
        }
    }
}
