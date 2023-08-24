package DSA_All;

public class minimumnumberSearch {

    public static void main(String[] args) {
        int[] min = {21, 4, 75, 85, 65, 98, 65, 45, 12, 45, 3258, -1, -2, -25, -100};

        System.out.println(minNum(min));
    }
    static int minNum(int[] arr) {
    int ans=arr[0];
    for (int i=0;i<arr.length;i++){
        if(arr[i]<ans)
            ans=arr[i];
    }
        return ans;
    }

}