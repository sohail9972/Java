package NewJourney.ObjectorientedProgramming;

public class Drop1 {
    public static void main(String[] args) {

        final A random0 = new A("sohail");
        random0.name = "heldi";
//        random0 = new A("joker");

//not allowed this
    }
}

class A{

    //usage of the Finale Keyword
    final int a = 10;
    String name;

    public A(String name){
        this.name= name;
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("objects are destroyed");
    }
}