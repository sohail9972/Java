package allotherprograms;

import java.util.HashSet;
import java.util.Iterator;

public class HashSet_practi {
    public static void main(String[] args) {
        HashSet<String> set =new HashSet<>();
        set.add("killer");
        set.add("liquid");
        set.add("monster");
        set.add("joker");
        set.add("water");


        //iterating the Elements in randomly
        Iterator<String> itr= set.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
