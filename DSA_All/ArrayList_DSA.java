package DSA_All;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayList_DSA {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>(10);
        //Integer is not premitive data type its an wrapper classes
//        list.add(67);
//        list.add(676);
//        list.add(6794);
//        list.add(675);
//        list.add(67515);
//        list.add(675);
//
//        System.out.println(list.contains(67));
//
//        list.set(0,100);
//        list.remove(0);
//        System.out.println(list);

        Scanner in=new Scanner(System.in);
        for (int i=0;i<5;i++){
            list.add(in.nextInt());
        }
        for (int i=0;i<5;i++){
            System.out.print(list.get(i)+" ");
        }
    }
}
