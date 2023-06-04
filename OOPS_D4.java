public class OOPS_D4 {
    public static void main(String[] args) {
     motor_bike bjt1=new hondashine();
     bjt1.motor_xl();
     bjt1.motor_plus();
    }
}


abstract class motor_bike{
    abstract void motor_plus();
    void motor_xl(){
        System.out.println("xl is world wide");
    }
    void gear_bike(){
        System.out.println("smooth with gears");
    }
}

class hondashine extends motor_bike{
    void motor_plus(){
        System.out.println("black");
    }
}