package allotherprograms;

import java.security.KeyStore;
import java.util.*;
import java.util.HashMap;

public class String2_frequency_coll {
    public static void main(String[] args) {
        String str = "banana";

        TreeMap<Character,Integer> map = new TreeMap<>();
        for (int i=0;i<str.length();i++){
            char c=str.charAt(i);
            Integer value=map.get(c);

            if (value==null){
                map.put(c,1);
            }else{
                map.put(c,value+1);
            }
        }

        Set<Map.Entry<Character,Integer>> set=map.entrySet();
        List<Map.Entry<Character,Integer>> list= new ArrayList<Map.Entry<Character,Integer>>(set);
        Collections.sort(list, new Comparator<Map.Entry<Character, Integer>>() {
            @Override
            public int compare(Map.Entry<Character, Integer> o1, Map.Entry<Character, Integer> o2) {
                return o2.getValue().compareTo(o1.getValue());
            }
        });

        for (Map.Entry<Character,Integer>entry:list){
            System.out.println("The frequency of ocuurence "+ entry.getKey() + entry.getValue());
        }
//        set = map.entrySet();

    }
}
