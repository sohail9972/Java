package DSA_All;

import java.util.Arrays;
import java.util.Scanner;

public class darray_DSA2 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
//        int[][] arr= new int[3][3];
//        int[][] arrmul = {
//                {1,2,3},
//                {4,5},
//                {7,8,9}
////        };

        //input
        int[][] arr= new int[3][3];
        System.out.print(arr.length);

        for (int row=0;row<arr.length;row++){
            for (int col=0;col<arr[row].length;col++){
                arr[row][col]= in.nextInt();
            }
        }

        //output
//        for (int row=0;row<arr.length;row++){
//            for (int col=0;col<arr[row].length;col++){
//                System.out.print(arr[row][col]+" ");
//            }
//            System.out.println();
//        }

//        for (int row=0;row< arr.length;row++){
//            System.out.println(Arrays.toString(arr[row]));
//        }
        //using enhanced for loop
        for (int[] a:arr) {
            System.out.println(Arrays.toString(a));
        }
    }
}
