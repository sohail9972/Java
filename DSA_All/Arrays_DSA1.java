package DSA_All;

import java.util.Arrays;
import java.util.Scanner;

public class Arrays_DSA1 {
//    String[] arr=new String[6];

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        Scanner in1=new Scanner(System.in);
        int[] arr=new int[5];

//        System.out.println(arr[i]);
    for (int i=0;i< arr.length;i++){
        arr[i]= in.nextInt();
    }
//        for (int i=0;i< arr.length;i++){
//            System.out.print(arr[i]+" ");
//        }
        for (int num:arr) {
            System.out.print(num+" ");
        }


        //array of objects
        String [] str= new String[6];
        for (int i=0;i< str.length;i++){
            str[i]=in1.next();
        }

        System.out.print(Arrays.toString(str));


    }

}
