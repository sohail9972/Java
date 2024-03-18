package NewJourney;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class SchronizatonofArraylist {
    public static void main(String[] args) {
//        List<String> arr =Collections.synchronizedList(new ArrayList<String>());
//        arr.add("loki");
//        arr.add("Iron Man");
//        arr.add("Hulk");
//        arr.add("Captain America");
//        arr.add("Thor");
//        arr.add("Spider man");
//        arr.add("Ant Man");

//        synchronized (arr){
//            Iterator<String> itr = arr.iterator();
//
//            while(itr.hasNext()){
//                System.out.println(itr.next());
//            }
//        }

        //copyonwriteArraylist
        CopyOnWriteArrayList<String> arr = new CopyOnWriteArrayList<String>();
        arr.add("loki");
        arr.add("Iron Man");
        arr.add("Hulk");
        arr.add("Captain America");
        arr.add("Thor");
        arr.add("Spider man");
        arr.add("Ant Man");
        Iterator<String>itr=arr.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }


    }
}
