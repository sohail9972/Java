public class largestelement {
    public static int islarge(){
        int arr[] = {5, 6, 7, 8, 9, 10, 3, 4, 2, 54};
        int max=arr[0];
        for (int i=0;i<arr.length;i++){
            if (arr[i]>max){
                max=arr[i];
            }
        }
        return max;
    }
    public static void main(String[] args) {

        int res= islarge();
        System.out.println(res);

    }
}
