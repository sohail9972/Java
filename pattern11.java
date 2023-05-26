public class pattern11 {
    public static void main(String[] args) {
        pat(5);
    }
    static void pat(int n){
        int row=1; int count=1;
        while (row<=n){
            int col=1;
            while(col<=row) {
                System.out.print(count);
                count++;
                col++;
            }
            row++;
            System.out.println();
        }
    }
}
