package DSA_All;

public class minbetweenrange {
    public static void main(String[] args) {
        int [] number={1,23,45,74,85,96,-78,-650,-120,-4,12,32,45,0};
        System.out.println(minimumrange(number, 2, 12));
    }

    static int minimumrange(int[] num,int start,int end) {
        if (num.length==0){
            return -1;
        }
        int ans=num[start];
        for (int index=start;index<=end;index++){
            if(num[index]<ans){
                ans=num[index];
            }
        }
        return ans;
    }
}
