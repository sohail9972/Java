public class pattern7 {
    public static void main(String[] args) {
        pat(5);
    }
    static void pat(int n){
        for (int row=1;row<=n+1;row++){
            for(int col=1;col<=n-row+1;col++){
                System.out.print(col);
            }
            System.out.println();
        }
    }
}
