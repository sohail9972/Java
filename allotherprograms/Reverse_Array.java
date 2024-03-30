package allotherprograms;

import java.util.Arrays;
public class Reverse_Array {
    public static void main(String[] args) {
        int[] arr={1,2,65,89,7};
//        swap(arr,0,6);
        reverse_no(arr);
        System.out.println(Arrays.toString(arr));

    }
    static void reverse_no(int[] arr){
        int start=0;
        int end= arr.length-1;
        while (start<end){
            swap(arr,start,end);
            start++;
            end--;
        }

    }
    static void swap(int[] arr,int index1,int index2){
        int temp=arr[index1];
        arr[index1]=arr[index2];
        arr[index2]=temp;
    }
}
