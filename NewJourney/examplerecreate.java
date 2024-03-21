package NewJourney;

public class examplerecreate {
    public static void main(String[] args) {
        int[] arr={4,5,7,8,9,12,15,17,19,25,29,30,32,38,46};
        int tar=46;
        int ans=agiBs(arr,tar);
        System.out.println(ans);
    }

    static int agiBs(int[] arr, int tar) {

        int s=0;
        int l=arr.length-1;

        while (s<=l){
            int m=s+(l-s)/2;

            boolean isincreasing= arr[s] < arr[l];

            if(tar==arr[m]){
                return m;
            }
            else if (isincreasing){
                if(tar>arr[m]){
                    s=m+1;
                }
                else {
                    l=m-1;
                }
            }
            else{
                if (tar<arr[m]){
                    s=m+1;
                }
                else {
                    l=m-1;
                }
            }
        }
        return -1;
    }
}
