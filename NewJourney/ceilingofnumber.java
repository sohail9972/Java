package NewJourney;

public class ceilingofnumber {
    public static void main(String[] args) {
        int[] arr={2,4,6,7,10,13,16,18,20};
        int tar=19;
        int ans= cielingbyBS(arr,tar);
        System.out.println(ans);
    }

    static int cielingbyBS(int[] arr, int tar) {
        int s=0;
        int l=arr.length-1;

        while(s<=l){
            int mid=s+(l-s)/2;
            if (arr[mid]==tar){
                return mid;
            } else if (tar>arr[mid]) {
                s=mid+1;
            }
            else {
                l=mid-1;
            }
        }
        return l;
    }
}
