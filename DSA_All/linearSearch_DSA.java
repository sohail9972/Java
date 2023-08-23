package DSA_All;

public class linearSearch_DSA {

    public static void main(String[] args) {
        int []num={12,4,2,35,636,-9,-85,-32,-12,-10,120,100,4,5,2};
        int tar=4;
        int ans=linear_search(num,tar);
        System.out.println(ans);
    }
    static int linear_search(int arr[],int tar){
        if(arr.length==0){
            return -1;
        }
        for (int index=0;index< arr.length;index++){
            int element=arr[index];
            if (element==tar){
                return index;
            }
        }
        return -1;
    }
}
