package allotherprograms;

public class pattern12 {
    public static void main(String[] args) {
        pat(5);
    }
    static void pat(int n){
        int row=1;
        while(row<=n){
            int value=row;
            int col=1;
            while(col<=row){
                System.out.print(value);
                value++;
                col++;
            }
            row++;
            System.out.println();
        }
    }
}
