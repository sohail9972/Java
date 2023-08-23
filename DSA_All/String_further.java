package DSA_All;

import java.util.Arrays;

public class reverse_array_DSA {
    public static void main(String[] args) {
        int [] arr={4,5,8,6,7,78,12,45,95};
        revese(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void revese(int[] arr) {
        int start = 0;
        int end= arr.length-1;
        while(start<end){
            swapdo(arr,start,end);
            start++;
            end--;
        }
    }

    static void swapdo(int[] arr, int start, int end) {
        int temp=arr[start];
        arr[start]=arr[end];
        arr[end]=temp;
    }
}
