import java.util.Scanner;

public class user_input_arr {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int arr[]=new int[10];
        System.out.println("array elements are:");
        for (int i=0;i<n;i++){
            arr[i]= sc.nextInt();
        }
        System.out.println("array elements are:");
        for (int i=0;i<n;i++){
            System.out.println(arr[i]);
        }
    }
}
