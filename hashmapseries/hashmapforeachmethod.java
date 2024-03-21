package hashmapseries;

import java.util.HashMap;

public class hashmapforeachmethod {
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

        //using for Each method
        ages1.forEach((k,v)-> System.out.println(" " + k + " " + v));
    }
}
