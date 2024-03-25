package NewJourney;

public class interfacecheck {
    public static void main(String[] args) {
two t1 = new two();
t1.run();
    }
}

interface one{
    void run();
}

class two implements one{
    public void run() {
        System.out.println("Hello interface");
    }
}
