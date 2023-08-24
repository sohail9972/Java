package DSA_All;

public class SearchinRange {
    public static void main(String[] args) {
 int [] number={2,4,5,89,-7,-54,-21,-30,-78,54,21,32,65,85,1,23,96};
 int key=54;
        System.out.println(searchme(number,key,2,12));
    }

    static int searchme(int[] arr,int key,int start,int end){
        if(arr.length==0){
            return -1;
        }
        for (int index=start;index<=end;index++){
            int ele=arr[index];
            if (key==ele){
                return index;
            }
        }
        return -1;
    }
}