public class ExampleAbstraction {
    public static void main(String[] args) {

     audi2 a1=new audi2();
     a1.start();
    }
}
class audi2 extends car_12{


    @Override
    void start() {
        System.out.println("new chek");
    }
}

abstract class car_12{
    int price;
    abstract void start();
    void breaks(){
        System.out.println("cocreate method");
    }

}