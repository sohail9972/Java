package allotherprograms;

import java.util.Scanner;

public class leap_year {
    static boolean isleapyear(int year){
        if(year%400==0){
            System.out.println("its leap year");
            return true;

        }
        if (year%100==0){
            return false;
        }
        if (year%4==0){
            System.out.println("its leap year");
            return true;
        }
        System.out.println("its not a leap year");
        return false;
    }
    public static void main(String[] args) {
        Scanner num=new Scanner(System.in);
        int year = num.nextInt();
        System.out.println(isleapyear(year));
    }
}
