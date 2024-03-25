package NewJourney;

public class OPcheck {

    public static void main(String[] args) {
        child c = new child();
        grand g =new grand();
//        System.out.println(c.classs);
//        System.out.println(c.name);
        c.main2();
        c.main1();
        g.main3();

    }
}

class person{
//    String name ="xyz";
    void main1(){
        System.out.println("hello world person");
    }

}

class child extends person{
//    String classs= "abc";
    void main2(){
        System.out.println("hello world Child");
    }
}

class grand extends child{
    void main3(){
        System.out.println("hello world grand ");
    }
}
