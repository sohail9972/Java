package NewJourney;

import java.util.Arrays;

public class smallestdivisor {
    public static void main(String[] args) {
        int[] nums={1,2,5,9};
        int threshold=6;
        int ans= smallestDivisor(nums,threshold);
        System.out.println(ans);
    }

    public static int smallestDivisor(int[] nums, int threshold) {
        Arrays.sort(nums);
        int max=nums[nums.length-1];
        for(int d=1;d<=max;d++){
            int sum=0;
            for(int i=0;i<(nums.length);i++){
                sum +=(double) Math.ceil((double) nums[i]/(double) d);
            }
            if(sum<threshold){
                return d;
            }

        }
        return -1;
    }
}
