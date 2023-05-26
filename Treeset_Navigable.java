import java.util.TreeSet;

public class Treeset_Navigable {
    public static void main(String[] args) {
        TreeSet<String> apl=new TreeSet<>();
        apl.add("A");
        apl.add("B");
        apl.add("C");
        apl.add("D");
        apl.add("E");

        System.out.println("initial the Set" + apl);

//        System.out.println("reverse the set "+ apl.descendingSet());
//
//        System.out.println("Head set" + apl.headSet("C",false));
//
//        System.out.println("Subset" + apl.subSet("A",false,"E",true));
//
//        System.out.println("Tailset" + apl.tailSet("C",false));


        System.out.println("head set" + apl.headSet("C"));
        System.out.println("subset" + apl.subSet("A","E"));
        System.out.println("tailset" + apl.tailSet("C"));
    }
}
