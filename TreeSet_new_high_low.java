import java.util.Iterator;
import java.util.TreeSet;

public class TreeSet_new_high_low {
    public static void main(String[] args) {
        TreeSet<Integer> num= new TreeSet<Integer>();
        num.add(90);
        num.add(77);
        num.add(14);
        num.add(8);
        num.add(100);
        Iterator<Integer> itr= num.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
