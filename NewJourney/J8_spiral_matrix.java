package NewJourney;

public class J8_spiral_matrix {
    public static void main(String[] args) {
        int size=10;
        System.out.print("Spiral Matirx");
        spiralMatrixHungma(size);


    }

  static void spiralMatrixHungma(int size) {
        int row=0,col=0;
        int boundary = size-1;
        int sizeleft=size-1;
        int flag=1;
        char move = 'r';

        int[][] matrix=new int[size][size];
        for (int i=0;i<size*size+1;i++){
            matrix[row][col]=i;

            switch(move){
                case 'r':
                    col+=1;
                    break;
                case 'l':
                    col-=1;
                    break;
                case 'd':
                    row+=1;
                    break;
                case 'u':
                    row-=1;
                    break;
            }
            if (i==boundary){
                boundary=boundary+sizeleft;
                if (flag!=2){
                    flag=2;
                }
                else {
                    flag=1;
                    sizeleft -=1;
                }
                switch(move){
                    case 'r':
                        move='d';
                        break;
                    case 'd':
                        move='l';
                        break;
                    case 'l':
                        move='u';
                        break;
                    case 'u':
                        move='r';
                        break;
                }
            }
        }
        for (row=0;row<size;row++){
            for (col=0;col<size;col++){
                int n= matrix[row][col];
                if (n<100) {
                    System.out.println(n + " ");
                }
                else {
                    System.out.println(n + " ");
                }

            }
        }
      System.out.println();
    }
}
