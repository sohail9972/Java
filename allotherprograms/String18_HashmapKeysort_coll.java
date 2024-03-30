package allotherprograms;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class String18_HashmapKeysort_coll {
    public static void main(String[] args) {

        Map<String,String> unsorted=new HashMap<>();
        unsorted.put("apple","apple");
        unsorted.put("banana","banana");
        unsorted.put("guva","guva");

        for (Map.Entry<String,String>entry: unsorted.entrySet()){
            System.out.println("keys are "+ entry.getKey());
        }

        Map<String,String>treemap=new TreeMap<>(unsorted);
        for (Map.Entry<String,String>entry: treemap.entrySet()){
            System.out.println("keys are sorted "+ entry.getKey());
        }
    }
}
