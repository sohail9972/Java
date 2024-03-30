package allotherprograms;

import java.util.Scanner;

public class String8_countingnumberofword_Coll {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //sohail ia ma sohau
        System.out.println("Enter the String : ");
        String s= sc.nextLine();
       int count= wordinStringcount(s);
        System.out.println(count);
    }

    private static Integer wordinStringcount(String s) {
        int count=0;
        if(s.charAt(0)!=' '){
            count++;
        }
        for (int i=0;i<s.length();i++){
            if(s.charAt(i)==' ' && s.charAt(i+1)!=' '){
                count++;
            }

        }
        return count;
    }

}
