package allotherprograms;

public class OOPS2 {
    public static void main(String[] args) {
        person2 p1= new person2();
        p1.name="sohail";
        p1.age=19;
        System.out.println(p1.age + "  "+ p1.name);

        person2 p2= new person2(31,"newyork");
//        p2.name="somi";
//        p2.age=9;
        System.out.println(p2.name+"  "+ p2.age);

        p1.sleep();
        p2.walk();
        System.out.println(person2.count);

        player d1=new player(21,"virat");
        d1.batting(89);
        d1.bowling();
    }
}


class person2 {
    String name;
    int age;

    static int count;

    //constructor
    public person2() {
        count++;
        System.out.println("number of person created");
    }

    public person2(int newage, String newname) {
        name = newname;
        age = newage;

//this.name=name:
//        this.age=age;

    }

    //features of tha person
    void walk() {
        System.out.println(name + "Walking on street");
    }

    void sleep() {
        System.out.println(name + " sleeping on bed");
    }
    void batting(int Avg){
        System.out.println(Avg);
    }
    void field(){

    }
    void bowling(){
        System.out.println("cant bowl");

    }
    void Training(){

    }
}

    class player extends person2{
    public player(int age,String name){
        super(age,name);
    }

    }
    class coach extends person2{
        @Override
        void Training() {
            super.Training();

        }

        @Override
        void field() {
            System.out.println("check for coach");
        }
    }


