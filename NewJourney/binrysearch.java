package NewJourney;

public class binrysearch {
    public static void main(String[] args) {
        int[] arr= {2,3,4,5,7,10,14,56,89,90};
        int tar=89;
        int ans=binsearch(arr,tar);
        System.out.println(ans);
    }

     static int binsearch(int[] arr, int tar) {
        int start=0;
        int last=arr.length-1;

        while(start<=last){
            int mid=start+(last-start)/2;
            if (tar>arr[mid]){
                start=mid+1;
            }
            else if (tar<arr[mid]){
                last=mid-1;
            }
            else{
                return mid;
            }
        }
        return -1;
    }
}
