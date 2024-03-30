package allotherprograms;

public class pattern13 {
    public static void main(String[] args) {
        pat(5);
    }
    static void pat(int n){
        for(int row=1;row<=n;row++){
            for(int space=1;space<=(n-row);space++){
                System.out.print(" ");
            }
            for(int col=1;col<=2*row-1;col++){
                System.out.print("*");
            }
            for(int space2=1;space2<=row-1;space2++){
                System.out.print(" ");
            }
            for (int col2=1;col2<=n-row;col2++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
