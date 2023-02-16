import java.util.*;
public class ArrayList_Practice_JavaPoint {
    public static void main(String[] args) {
//        ArrayList<Integer>list=new ArrayList<Integer>();
//        list.add(34);
//        list.add(89);
//        list.add(478);
//        list.add(3);


        ArrayList<String>list=new ArrayList<String>();
        list.add("Kapil");
        list.add("Onetrust");
        list.add("lusy");
        list.add("india");
        list.add("sohail");
//        list.add(4);

//      for (Integer listx:list){
//          System.out.println(listx);
//          if(listx.equals(3)){
//              System.out.println("false");
//          }

        //###############
//setters and getters
        //get() will give the  element at the Specified index
        //ser() will give update the Element
//        System.out.println(list.get(2));
//        list.set(2,499);
//        for (Integer listy:list){
//            System.out.println(listy);



        //Sorting is done through the Collections through the Static sort()
//        Collections.sort(list);
//        for (Integer listxy:list)
//        {
//            System.out.println(listxy);
//
//        }

//        Collections.sort(list);
//            for (Integer listXY:list){
//                System.out.println(listXY);
//            }


        //iterating through the remaining Ways
//through the Lamda operators
//        list.forEach(a->{
//            System.out.println(list);
//        });


//        list.forEach(a->{
//            System.out.println(list);
//        });
//        Iterator itr= list.iterator();
//        while(itr.hasNext()){
//            System.out.println(itr.next());



        //removing an Element if that particular element is found the List
//        list.removeIf(str->str.contains("sohail"));
//        System.out.println(list);


        //isempty()
        System.out.println(list.isEmpty());
        }
    }






