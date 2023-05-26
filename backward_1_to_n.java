public class backward_1_to_n {
    public static void main(String[] args) {
        System.out.println(rever(10));

    }
    static int rever(int n){
        if (n==0){
            return 0;

        }
        else {
            System.out.println(n);
            return rever(n-1);
        }

}
}
