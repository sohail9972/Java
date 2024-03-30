package NewJourney.staticExample;

public class human {

    //instance variables
    int age;
    int salry;
    boolean married;
    String name;

    //this is static variable
    static long population;

    static void message(){
        System.out.println("static method");
    }
//Short to create Constructor alt + insert button
    public human(int age, int salry, boolean married, String name) {
        this.age = age;
        this.salry = salry;
        this.married = married;
        this.name = name;
        human.population += 1;
        //this.message(); // this generally gives warining
        human.message();
    }
}
