package allotherprograms;

import java.util.*;

public class DublicateinString {
    public static void main(String[] args) {
        System.out.println(findDublicates("code decode"));
    }
    public static Set<Character> findDublicates(String name){
        Set<Character> Dublicates=new LinkedHashSet<>();
        HashMap<Character,Integer> CounterMap= new HashMap<>();
        for (int i=0;i<name.length();i++){
            if (CounterMap.containsKey(name.charAt(i))){
                CounterMap.put(name.charAt(i),CounterMap.get(name.charAt(i))+1);

            }
            else {
                CounterMap.put(name.charAt(i),1);
            }
        }
        for (Map.Entry<Character,Integer>entry:CounterMap.entrySet()){
if (entry.getValue()>1){
    Dublicates.add(entry.getKey());
}
        }
        return Dublicates;
    }
//    public static Set<Character> findDublicates(String name) {
//        Set<Character> dublicates = new LinkedHashSet<>();
//        for (int i = 0; i < name.length(); i++) {
//            for (int j = 0; j < name.length(); j++) {
//                if (name.charAt(i) == name.charAt(j)) {
//                    dublicates.add(name.charAt(j));
//                }
//
//            }
//        }
//    return dublicates;
//    }

}
