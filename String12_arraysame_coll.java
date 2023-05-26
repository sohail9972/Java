import java.util.Arrays;

public class String12_arraysame_coll {
    public static void main(String[] args) {
        int arr1[]={3,5,2,7};
        int arr2[]={5,7,2,3};
        if(areequalarray(arr1,arr2)){
            System.out.println("both are same");
        }else {
            System.out.println("both are not same");
        }
    }
    public static boolean areequalarray(int[]arr1,int[]arr2){
        int n=arr1.length;
        int m= arr2.length;
        if (n!=m){
            return false;
        }
        Arrays.sort(arr1);
        Arrays.sort(arr2);

        for (int i=0;i<n;i++){
            if (arr1[i]!=arr2[i]){
                return false;
            }

        }
        return true;
    }
}
