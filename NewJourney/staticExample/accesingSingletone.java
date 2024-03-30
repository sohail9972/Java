package NewJourney.staticExample;

public class accesingSingletone {
    public static void main(String[] args) {
        singletoneclass obje=singletoneclass.getInstance();

        singletoneclass obje1=singletoneclass.getInstance();
        singletoneclass obje2=singletoneclass.getInstance();
//        singletoneclass obj = singletoneclass.greeting();
    }
}
