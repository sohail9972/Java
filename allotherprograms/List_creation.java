package allotherprograms;

import java.util.ArrayList;
import java.util.List;

public class List_creation {
    public static void main(String[] args) {
        //creating list using Arraylist

        List<String> listy=new ArrayList<String>();
        listy.add("manish");
        listy.add("ganesh");
        listy.add("Rocket");
        listy.add("thunder");
        listy.add("Ravi");

        for (String ran:listy){
            System.out.println(ran);
        }
    }
}
