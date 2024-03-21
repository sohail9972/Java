package hashmapseries;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class hashmapcomparisions {
    public static void main(String[] args) {
        HashMap<String, Integer> ages1 = new HashMap<>();
        ages1.put("sohail", 12);
        ages1.put("saniya", 32);
        ages1.put("Pooja", 23);
        ages1.put("Skandana", 21);
        ages1.put("manoja", 12);
        ages1.put("vedraj", 22);
        ages1.put("Akhila", 24);
        ages1.put("Vera", 43);
        ages1.remove("Vera");

        HashMap<String, String> map = new HashMap<>();
        map.put("India","Delhi");
        map.put("USA","Washington DC");
        map.put("UK"," london");
        map.put("pink","colour");
        map.put("japan","Tokyo");



        System.out.println(ages1.equals(map));

        //Comparing hashmap Keys using the KeySet

        System.out.println(ages1.keySet().equals(map.keySet()));

// finding the Extra Key
        HashMap<String, String> map2 = new HashMap<>();
        map2.put("India","Delhi");
        map2.put("USA","Washington DC");
        map2.put("UK"," london");
        map2.put("pink","colour");
        map2.put("japan","Tokyo");
        map2.put("sohail","sohail");


      //  combine the keys both maps using Hashset
        HashSet<String> combinedkeys = new HashSet<String>(map.keySet());
        //adding all keys from the map2

        combinedkeys.addAll(map2.keySet());
        combinedkeys.removeAll(map.keySet());
        System.out.println(combinedkeys);


        //Compare by the value
        //duplicates are not allowed then use the Arraylist
        System.out.println(new ArrayList<>(map.values()).equals(new ArrayList<>(map2.values())));

        //duplicates are allowed then use the hash set
        System.out.println(new HashSet<>(map.values()).equals(new HashSet<>(map2.values())));

    }
}
