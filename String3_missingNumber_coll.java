import java.util.HashSet;

public class String3_missingNumber_coll {
    public static void main(String[] args) {
        Integer a[]={7,5,2,9,1,6};
        missingnumber(a);


    }

    private static void missingnumber(Integer a[]) {
        HashSet<Integer>set=new HashSet<>();

        for (int num:a) {
            set.add(num);
        }
        int n=a.length+1;
        for (int i=0;i<=n;i++){
            if(!set.contains(i)){
                System.out.println(i);
            }
        }
    }
}
