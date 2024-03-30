package allotherprograms;

public class pattern2 {
    public static void main(String[] args) {
        pat(5);
    }
    static void pat(int n){
        for(int row=1;row<=n;row++){
            for(int col=1;col<=n-row;col++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
