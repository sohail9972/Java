
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Scanner;

public class Array_list_exp {
    public static void main(String[] args) {
        //ArrayList<Integer> list = new ArrayList<>();
//Wrapperclases are used
        Scanner in =new Scanner(System.in);

    ArrayList<Integer> list=new ArrayList<>(10);

//        list.add(90);
//        list.add(99);
//        list.add(94);
//        list.add(976);
//        list.add(998);
//        System.out.println(list.contains(92));
//        System.out.println(list);
//list.set(0,92);
//        System.out.println(list);

for (int i=0;i<5;i++){
    System.out.println(in.nextInt());
}
for (int i=0;i<5;i++){
    System.out.println(list.get(i));
}
        System.out.println(list);
    }
}
