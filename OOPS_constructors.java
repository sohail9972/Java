public class OOPS_constructors {
    public static void main(String[] args) {
testConstructors obj=new testConstructors();
testConstructors obj1=new testConstructors(12,"nomail@gmail.com");
obj.name="sohail";
obj1.mail="rahane@mail.com";
obj.uid=1232;
        System.out.println(obj.age);
        System.out.println(obj1.mail);
        System.out.println(obj.uid);
    }
}

class testConstructors{
    String name;
    int uid;
    int age;
    String mail;

    testConstructors(){
        System.out.println("constructors will have same name as class");
    }
    testConstructors(int age,String mail){
        this.mail=mail;
        this.age=age;
        System.out.println("adding parameterized constructors");
    }
}