package allotherprograms;

import java.util.Arrays;
import java.util.Scanner;

public class First {
    public static void main(String[] args) {

//        Scanner in = new Scanner(System.in);
//        int n = in.nextInt();
//        for (int i=0;i<=n;i++){
//            System.out.println(i);
//      int n=1;
//      while(n<=10){
//          System.out.println(n);
//          n++;
//        }
//        int n=1;
//        do{
//            System.out.println(n);
//
//        }while(n!=1);
//        Scanner in = new Scanner(System.in);
//        char ch = in.next().charAt(0);
//        System.out.println(ch);
//
//Scanner in = new Scanner(System.in);
//    int n=in.nextInt();
//    int a=0;
//    int b=1;
//   int count=2;
//   while(count<=n){
//       int temp=b;
//       b=a+b;
//       a=temp;
//       count++;
//   }
//        System.out.println(b);

//     Scanner in = new Scanner(System.in);
//     int n = in.nextInt();
//        int  n=7872;
//        int count=0;
//     while(n>0){
//
//         int rem=n%10;
//         if(rem==7){
//             count++;
//
//         }
//         n=n/10;
//     }


//        String word="hello";
//        System.out.println(word.charAt(2));
Scanner in =new Scanner(System.in);
//int[] arr=new int[5];
//for (int i =0;i<arr.length;i++){
// arr[i]=in.nextInt();
//
//}
//for (int i=0;i<arr.length;i++){
//    System.out.print(arr[i]+ " ");
//}
//for (int num:arr){
//    System.out.print(num + " ");
//}

//        System.out.println(Arrays.toString(arr));

        String[] str= new String[10];
        for (int i=0;i<str.length;i++){
            str[i]= in.next();
        }
        System.out.println(Arrays.toString(str));

    }
}