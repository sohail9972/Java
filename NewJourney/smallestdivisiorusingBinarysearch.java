package NewJourney;

import static java.lang.Math.ceil;

public class smallestdivisiorusingBinarysearch {
    public static void main(String[] args) {
        int[] nums={1,2,5,9};
        int threshold=6;
        int ans= smallestDivisorusingBS(nums,threshold);
        System.out.println(ans);
    }

        public static int sumby(int[] nums, int div){
            int sum = 0;
            int n = nums.length;
            for (int i = 0; i < n; i++) {
                sum += (double) ceil((double) nums[i] / (double) div);
            }
            return sum;
        }
        public static int smallestDivisorusingBS ( int[] nums, int threshold){
//            Arrays.sort(nums);
//            int max_ele=nums[nums.length-1];
            int start = 1;
            int last = nums[nums.length-1];
            while (start <= last) {
                int mid = start + (last - start) / 2;
                if (sumby(nums, mid) <= threshold) {
                    last = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
            return start;
        }
    }

