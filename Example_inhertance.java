public class Example_inhertance {
    public static void main(String[] args) {
        patient P1=new patient("assd",22);
        doctor d1=new doctor("suma",21);
P1.health();
        d1.health();
d1.step(6);

//exampleencapsulation obj=new exampleencapsulation();
//obj.

    }
}

class patient{
String name;
int age;
public patient(String name,int age){
    this.age=age;
    this.name=name;
}
void health(){
    System.out.println(name+"health status");
}
void step(int walk){
    System.out.println(walk+"these many steps");
}
}

class doctor extends patient{

    public doctor(String name, int age) {
        super(name, age);
    }

    @Override
    void step(int walk) {
        System.out.println(walk);
    }
}

