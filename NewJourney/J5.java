package NewJourney;

public class J5 {
    public static void main(String[] args) {
        int[] arr={12,2,5,4,8,9,3,63,52,41,74,1};
        System.out.println(minimumnumberfind(arr));
    }
    static int minimumnumberfind(int[] arr){
        int ans=arr[0];
        for (int i=0;i< arr.length;i++){
            if(arr[i]<ans){
                ans=arr[i];

            }
        }
        return ans;
    }
}
