import java.util.Scanner;

public class reverse_num {
    public static void main(String[] args) {
        Scanner num= new Scanner(System.in);
        int number= num.nextInt();
        int reverse=0;
        String s=" ";
        while (number !=0){
            int last=number%10;
            reverse=reverse*10+last;
//            s=s+Integer.toString(last);
            number=number/10;
        }
        System.out.println(reverse);
        num.close();
    }
}
