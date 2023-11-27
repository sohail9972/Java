package NewJourney;

public class J4 {
    public static void main(String[] args) {
        int[] num ={3,2,5,7,56,45,12,4};
        int key=56;
        int ans=inrnagesearch(num,key,2,6);
        System.out.print(ans);
    }
    static int inrnagesearch(int[] num,int key,int start, int end){
        if (num.length==0){
            return -1;
        }

        for (int i=start;i<=end;i++){
            int ele=num[i];
            if (ele==key){
                return i;
            }
        }
        return -1;
    }

}
