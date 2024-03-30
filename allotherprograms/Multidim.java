package allotherprograms;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Multidim {
    public static void main(String[] args) {
        int[][] arr= new int[3][3];
        System.out.println(arr.length);
        Scanner in =new Scanner(System.in);
        for (int row=0;row<arr.length;row++){
            for (int col=0;col<arr[row].length;col++){
                arr[row][col]=in.nextInt();
            }
        }

//        for (int row=0;row<arr.length;row++){
//            for (int col=0;col<arr[row].length;col++){
//                System.out.print(arr[row][col] + " ");
//            }
//            System.out.println();
//        }
//        for (int row=0;row< arr.length;row++){
//            System.out.println(Arrays.toString(arr[row]));
//        }
//         for (int[] a :arr){
//             System.out.println(Arrays.toString(a));
//          }
//        String[]arr =new String[4];
//        System.out.println(arr[0]);
//        for (String[] element : arr){
//            System.out.println(element);

//        }
    }

}
