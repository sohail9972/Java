package hashmapseries;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Hashmapping {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();
        map.put("India","Delhi");
        map.put("USA","Washington DC");
        map.put("UK"," london");
        map.put("pink","colour");
        map.put("japan","Tokyo");

map.put(null,"LA");
map.put("kali",null);


//        System.out.println(map.get("USA"));

        //iterator
        Iterator<String> itr= map.keySet().iterator();
        while (itr.hasNext()){
            String key = itr.next();
            String value = map.get(key);
            System.out.println("Keys : "+ key  + "   "+ value);
        }

        Iterator<Map.Entry<String, String>> itr2= map.entrySet().iterator();

        while (itr2.hasNext()){
            Map.Entry<String,String> entry = itr2.next();
            System.out.println(" " + entry.getKey() + " " + entry.getValue());

        }
    }


}
