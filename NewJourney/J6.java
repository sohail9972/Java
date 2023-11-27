package NewJourney;

import java.util.Arrays;

public class J6 {
    public static void main(String[] args) {
        int[][] arr={
                {1,2,3,4},
            {4,5,6,21,1},
            {7,8,9,54}
    };
        int key=6;
        int[] ans=searchin2darr(arr,key);
        System.out.println(Arrays.toString(ans));

}
static int[] searchin2darr(int[][] arr, int key){
        for (int row=0;row<arr.length;row++){
            for (int col=0;col<arr[row].length;col++){
                if(arr[row][col]==key){
                   return new int[]{row,col};
                }
            }
        }
    return new int[]{-1,-1};
}
}
