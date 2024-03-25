package NewJourney;

public class methodoverloading {
    public static void main(String[] args) {
        System.out.println(p1.add(2,5));
        System.out.println(p1.add(3,5,6));
        System.out.println(P2.adding(4,8));
        System.out.println(P2.adding(5,7,9));
    }
    //by the different Parameters
    class p1{
        static int add(int a, int b){return a+b;}
        static int add(int a,int b,int c){return a+b+c;}
    }
    //by changing the number of Arguments
    class P2{
        static int adding(int a, int b){return a+b;}
        static double adding(double a, double b ,double c){return a+b+c;}
    }
}
