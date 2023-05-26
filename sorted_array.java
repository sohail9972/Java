public class sorted_array {
    public static void main(String[] args) {
       int[] arr={22,34,65,8,90};
        int n = 3;
        System.out.println(sort_array(arr,n));
    }
    static int sort_array(int arr[],int n){
        if (n==1){
            return 1;
        }
        else {
            return (arr[n-1]<arr[n-2]?0:sort_array(arr,n-1));
        }
    }
}
