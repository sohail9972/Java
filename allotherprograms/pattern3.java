package allotherprograms;

public class pattern3 {
    public static void main(String[] args) {
        pat(5);
    }
    static void pat(int n){
        for (int row=0;row<n;row++){
            for (int space=1;space<n-row;space++){
                System.out.print(" ");
            }
            for (int col=0;col<=row;col++){
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
