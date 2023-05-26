import java.util.*;

public class DSA1 {
    public static void main(String[] args) {
        HashMap<String,String> map=new HashMap<>();
        map.put("china","sushi");
        map.put("India","Ragi");
        map.put("Russia","doa");
        System.out.println(map);

        int arr[]={12,78,90};
        for (int val:arr){
            System.out.println(val+" ");
        }
       for (Map.Entry<String,String> e: map.entrySet()){
           System.out.println(e.getKey()+e.getValue());
       }
       Set<String>keys=map.keySet();
       for (String key : keys){
           System.out.println(key+ " "+map.get(key));
       }
    }


}
