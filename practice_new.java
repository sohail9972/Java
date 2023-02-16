import java.util.Arrays;
public class practice_new {
    public static void main(String[] args) {
        int[] arr={2,5,89,67,90};
        reverse_arr(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void reverse_arr(int []arr){
        int start;
        int end;
        start=0;
        end= arr.length-1;
        while(start<end){
            swap(arr,start,end);
            start++;
            end--;
        }


        }
    static void swap(int[]arr,int index1,int index2){
        int temp=arr[index1];
        arr[index1]=arr[index2];
        arr[index2]=temp;
    }

}
