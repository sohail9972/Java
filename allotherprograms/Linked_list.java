package allotherprograms;

import java.util.Iterator;
import java.util.LinkedList;

public class Linked_list {
    public static void main(String[] args) {
        LinkedList<String> list=new LinkedList<String>();
        list.add("malik");
        list.add("suhas");
        list.add("mahesh");
        list.add("strong");
        list.add("water");



        ///####################################
        LinkedList<Integer> list2=new LinkedList<Integer>();
        list2.add(23);
        list2.add(90);
        list2.add(9);
        list2.add(78);
        list2.add(34);

        System.out.println(list2);
//        list.removeFirstOccurrence("water");
//        list.removeLastOccurrence("strong");
//        System.out.println(list);

        //iterating through the lsit of element
//        Iterator <String> itr= list.iterator();
//        while(itr.hasNext()){
//            System.out.println(itr.next());

        //trversing the list of the Elements in desending order

        Iterator itr= list.descendingIterator();
        while(itr.hasNext()){
            System.out.println(itr.next());

        }
    }
}
