package NewJourney.ObjectorientedProgramming;

public class Drop0 {

    public static void main(String[] args) {
        Students s1 = new Students();
        Students s2 =new Students(12,"delol",true);
        System.out.println(s2.name);
        System.out.println(s1.marks);
        System.out.println(s1.name);
        s1.changeName("kolla");
s1.greeting();

Students s3 = new Students();
        System.out.println(s3.name);

    }
}
class Students{
    int roll_no;
    String name ;
    float marks;
    boolean result;

    void changeName(String newname){
        name= newname;
    }
    void greeting(){
        System.out.println("hello i am ---- "+ this.name);
    }

//    Students(){
//        this.marks=62;
//        this.name = "sohail";
//        this.result= true;
//        this.roll_no = 4253;
//    }

    Students(){
        //Calling other Constructor from default Constructor using this keyword
        //internally its simlarly to new Students();
        this(14,"sohail",true);
    }

    Students(int num,String orgname,boolean exists){
        this.name=orgname;
        this.roll_no=num;
        this.result=exists;

    }

}