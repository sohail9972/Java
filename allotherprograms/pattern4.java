package allotherprograms;

public class pattern4 {
    public static void main(String[] args) {
pat(5);
    }
    static void pat(int n){
        for(int row=0;row<2*n;row++){
            int ttcol=row>n ? 2*n-row : row;
            for (int col=0;col<ttcol;col++){
                System.out.print("* ");
            }
            System.out.println(" ");
        }
    }
}
