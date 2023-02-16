import java.util.Arrays;

public class swap_number {
    public static void main(String[] args) {
        int[] arr={1,2,89,56,34};
        swap(arr,0,arr.length-1);

        System.out.println(Arrays.toString(arr));
    }
    static void swap(int[] arr,int index1,int index2){
        int temp=arr[index1];
        arr[index1]=arr[index2];
        arr[index2]=temp;
    }
}
