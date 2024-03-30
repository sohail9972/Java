package NewJourney.staticExample;

public class staticBlock {
    static  int a =4;
    static int b;


    //runs only when the first object is created
    //when the Class is loaded
    static {
        System.out.println("i am static block");
        b=a*5;
    }

    public static void main(String[] args) {
        staticBlock obj = new staticBlock();
        System.out.println(staticBlock.a + " " + staticBlock.b);

        staticBlock.b +=5;

        System.out.println(staticBlock.a + " "+ staticBlock.b);
    }
}
