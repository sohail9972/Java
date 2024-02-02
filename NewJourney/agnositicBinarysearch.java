package NewJourney;

public class agnositicBinarysearch {
    public static void main(String[] args) {
        int[] arr={57,54,52,50,12,10,8,7,6,4,3,0};

        int tar=0;
        int ans=agbinarysearch(arr,tar);
        System.out.println(ans);
    }

    static int agbinarysearch(int[] arr, int tar) {
        int start=0;
        int last=arr.length-1;

        boolean isAsc=arr[start]<arr[last];

        while(start<=last){
            int mid = start+(last-start)/2;
            if(arr[mid]==tar){
                return mid;
            }

            if (isAsc){
                if (tar<arr[mid]){
                    last=mid-1;
                }
                else{
                    start=mid+1;
                }
            }
            else {
                if (tar>arr[mid]){
                    last=mid-1;
                }
                else{
                    start=mid+1;
                }
            }
        }
        return -1;
    }
}
