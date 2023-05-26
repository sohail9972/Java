public class String19_onemissingnumber_coll {
    public static void main(String[] args) {
        int []arr=new int[]{1,2,3,4,6,7,8,9};
        int sum=(9*10)/2;
        int actualsum=0;

        for (int i=0;i<arr.length;i++){
            actualsum=actualsum+arr[i];
        }
        System.out.println("missing number is "+ (sum-actualsum));
    }
}
