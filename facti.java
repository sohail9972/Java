public class facti {
    public static void main(String[] args) {
        int n;
        System.out.println(fact(10));
    }
    static int fact(int n){
        if (n==1 || n==0){
            return 1;
        }
        else{
            return(n*fact(n-1));
        }
    }
}