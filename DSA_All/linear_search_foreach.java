package DSA_All;

public class linear_search_foreach {
    public static void main(String[] args) {
        int []numbers={1,4,2,45,21,35,62,415,12,43,75,-64,-84,-12};
        int key=400;
     boolean ans=findkey(numbers,key);
        System.out.println(ans);
    }

    static boolean findkey(int[] num, int key) {
        if (num.length==0){
            return false;
        }
        for (int element:num) {
            if (element==key){
                return true;
            }
        }
        return false;
    }

}
