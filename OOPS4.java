public class OOPS4 {
    public static void main(String[] args) {
        BMW b1=new BMW();
        audi a1=new audi();
    }
}
abstract class abs{
    String brand;
    int price;

   abstract void start();//abstract method

    void solo(){
        System.out.println("check on road");//concreate metrhods
    }

}

class audi extends abs{
    @Override
    void start() {
        System.out.println("key");
    }
}
class BMW extends abs{
    @Override
    void start() {
        System.out.println("voice");
    }
}
