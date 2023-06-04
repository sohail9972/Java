import org.w3c.dom.ls.LSOutput;

public class OOPS_D2 {
    public static void main(String[] args) {

        bike object=new honda();
        object.method_bike1();
    }
}

abstract class bike{


    abstract void method_bike1();

}

class honda extends bike{
    void method_bike1(){
        System.out.println("bike of honda company is smooth");
    }

}
