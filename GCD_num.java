import java.util.Scanner;

public class GCD_num {
   public static int gcd(int a , int b){
        if (a==0){
            return b;
        }
        if (b==0){
            return a;
        }
        if (a==b){
            return a;
        }
        if (a>b){
            return gcd(a%b,b);
        }
        else {
            return gcd(a,b%a);
        }

    }
    public static void main(String[] args) {
        Scanner num=new Scanner(System.in);
        int number1=num.nextInt();
        int number2=num.nextInt();
        System.out.println(gcd(number1,number2));
    }
}
