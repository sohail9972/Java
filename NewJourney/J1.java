package NewJourney;

public class J1 {
    public static void main(String[] args) {
        int[] arr= {1,2,5,3,48,7,45,575,754,42,12,6};
        int Key=23;
        int ans = linearJ1(arr,Key);
        System.out.println(ans);
    }

    static int linearJ1(int[] arr,int Key){
        if (arr.length==0){
            return -1;
        }

        for (int i=0;i<arr.length;i++){
            int ele=arr[i];
            if(ele==Key){
                return ele;
            }
        }
        return -1;
    }
}
