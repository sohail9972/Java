import java.sql.SQLOutput;
import java.util.*;

public class Testing_practice {
//    public static void main(String[] args) {
//        String str="December";
//        TreeMap<Character,Integer>map=new TreeMap<>();
//
//        for (int i=0;i<str.length();i++){
//            char c=str.charAt(i);
//            Integer value=map.get(c);
//
//            if(value==null){
//                map.put(c,1);
//            }
//            else {
//                map.put(c,value+1);
//            }
//        }
//        Set<Map.Entry<Character,Integer>>set=map.entrySet();
//        List<Map.Entry<Character,Integer>>list=new ArrayList<>(set);
//
//        Collections.sort(list, new Comparator<Map.Entry<Character, Integer>>() {
//            @Override
//            public int compare(Map.Entry<Character, Integer> o1, Map.Entry<Character, Integer> o2) {
//
//                return o2.getValue().compareTo(o1.getValue());
//            }
//
//        });
//        for(Map.Entry<Character,Integer>entry:list){
//            System.out.println("The Frequency of the Letters in the Word  "+entry.getKey() +" = "+entry.getValue());
//        }
//    }

//    public static void main(String[] args) {
////        String str1="aaba";
////        String str2="abaa";
//        System.out.println(isanagram("aabc","abaa"));
//    }
//    public static boolean isanagram(String str1,String str2){
//
//        int count[]=new int[256];
//
//        for (int i=0;i<str1.length();i++){
//            count[str1.charAt(i)]++;
//            count[str2.charAt(i)]--;
//
//        }
//        for (int i=0;i< count.length;i++){
//            if (count[i]!=0){
//                return false;
//            }
//
//        }
//        return true;
//
//    }
//}

    public static void main(String[] args) {
        int a[]=new int[]{1,2,3,6,8,9};
        ismissingnum(a);
    }

    private static void ismissingnum(int[] a) {
        HashSet<Integer>set=new HashSet<>();

        for (int num:a) {
            set.add(num);
        }
        int n=a.length+1;
        for (int i=0;i<n;i++){
            if(!set.contains(i)){
                System.out.println(i);
            }
        }
    }
}
