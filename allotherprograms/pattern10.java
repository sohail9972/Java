package allotherprograms;

public class pattern10 {
    public static void main(String[] args) {
        pat(5);
    }
    static void pat(int n){
        for (int row=1;row<n;row++){
            for (int col=1;col<=row;col++){
                System.out.print(row);
            }
            System.out.println();
        }
    }
}
