import java.util.*;
public class treeset_new {
    public static void main(String[] args) {
  TreeSet<String> tr=new TreeSet<String>();
          tr.add("sunday");
        tr.add("friday");
        tr.add("thursday");
        tr.add("wednesday");
        tr.add("tuesday");
        tr.add("monday");
Iterator<String> itr= tr.iterator();
while (itr.hasNext()){
    System.out.println(itr.next());
}

//Iterator<String> itr= tr.descendingIterator();
//while (itr.hasNext()){
//    System.out.println(itr.next());
//}
    }
}
