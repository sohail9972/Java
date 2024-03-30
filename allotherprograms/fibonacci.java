package allotherprograms;

import java.util.Scanner;

public class fibonacci {
    public static void main(String[] args) {
        Scanner num=new Scanner(System.in);
        int number= num.nextInt();
        int a=0,b=1;
        for (int i=2;i<number;i++){
            int nextnumber= a+b;
            a=b;
            b=nextnumber;
            System.out.println(nextnumber);
        }

    }
}
