public class OOPS1 {
    public static void main(String[] args) {
      person p1=new person();
      p1.name="sohail";
      p1.age=19;
        System.out.println(p1.age + "  "+ p1.name);

        person p2=new person(31,"newyork");
//        p2.name="somi";
//        p2.age=9;
        System.out.println(p2.name+"  "+ p2.age);

        p1.sleep();
        p2.walk();
        System.out.println(person.count);
    }
}

class person{
    String name;
    int age;

    static int count;
    //constructor
    public person(){
        count++;
        System.out.println("number of person created");
    }
    public person(int newage,String newname){
        name=newname;
        age=newage;

    }
    //features of tha person
    void walk(){
        System.out.println(name+ "Walking on street");
    }
    void sleep(){
        System.out.println(name+" sleeping on bed");
    }

}
