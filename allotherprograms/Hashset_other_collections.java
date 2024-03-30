package allotherprograms;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class Hashset_other_collections {
    public static void main(String[] args) {
        ArrayList<String> list=new ArrayList<>();
        list.add("honda");
        list.add("remo");
        list.add("pen");
        list.add("butterfly");
        list.add("book");

        HashSet<String>Set = new HashSet<>(list);
        Set.add("grover");
        Iterator<String> itr = Set.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
