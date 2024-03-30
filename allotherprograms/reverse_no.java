package allotherprograms;

import java.util.Scanner;

public class reverse_no {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

long num=in.nextInt();
//        long num=56783456789l;
        long ans=0;
        while (num>0){
           long rem= num%10;
           num=num/10;
           ans=ans*10+rem;
        }
        System.out.println(ans);
    }
}
