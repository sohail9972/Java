package DSA_All;

public class maxvalue_array_DSA {
    public static void main(String[] args) {
        int[] arr ={4,5,8,66,29,956,7,52};
        System.out.println(maxirange(arr,2,4));
    }

    static int maxirange(int[] arr,int start,int end) {
        if(arr.length==0){
            return -1;
        }
        int maximum_val=arr[start];
//        for (int num:arr)
        for(int i=start;i<=end;i++){
//            if (num > maximum_val) {
//                maximum_val = num;
//            }
            if (arr[i]>maximum_val){
                maximum_val=arr[i];
            }
        }
        return maximum_val;
    }
}
