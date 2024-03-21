package hashmapseries;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class hashmappingiterator {
    public static void main(String[] args) {
        HashMap<String, Integer> ages = new HashMap<>();
        ages.put("sohail",12);
        ages.put("saniya",32);
        ages.put("Pooja",23);
        ages.put("Skandana",21);
        ages.put("manoja",12);
        ages.put("vedraj",22);
        ages.put("Akhila",24);
        ages.put("Vera",43);
        ages.remove("Vera");

        Iterator<Map.Entry<String,Integer>> map= ages.entrySet().iterator();
        while(map.hasNext()){
            Map.Entry<String, Integer> en = map.next();
            System.out.println(" " + en.getKey() +" " + en.getValue());
        }

    }
}
