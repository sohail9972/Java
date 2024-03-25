package NewJourney;
abstract class vehicle{
    abstract void coll();
}

class bike extends vehicle{
    void coll() {
        System.out.println("Bike check");
    }
}
public class abstractclsnmethod {
    public static void main(String[] args) {
bike b1 =new bike();
b1.coll();
    }
}
