public class Linear_search {

    public static int linear(int arr[],int key){
        int n;
        n=arr.length;
        for (int i=0;i<n;i++){
            if (arr[i]==key){
                return i;
            }

        }
        return -1;
    }
    public static void main(String[] args) {
    int arr[]={5,7,6,89,9,8,90};
        int key=5;
       int res= linear(arr,key);
       if (res==key){
           System.out.println("element at :"+ res);
       }
       else {
           System.out.println(res);
       }
    }
}
