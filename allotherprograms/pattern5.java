package allotherprograms;

public class pattern5 {
    public static void main(String[] args) {
        pat(5);
    }
    static void pat(int n){
        for(int row=0;row<n;row++){
            for(int space=0;space<=row-1;space++){
                System.out.print(" ");
            }
            for (int col=1;col<=n-row;col++){
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
