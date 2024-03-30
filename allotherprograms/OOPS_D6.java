package allotherprograms;

public class OOPS_D6 {
    public static void main(String[] args) {
       alphagames obj=new AB();
       obj.a();
       obj.b();
       obj.c();
       obj.d();
    }
}

interface alphagames{
    void a();
    void b();
    void c();
    void d();
}


abstract class getc implements alphagames {
    public void c(){
        System.out.println("i am c");
    }
}

class AB extends getc{
    public void a(){
        System.out.println("i am a");
    }


    public void d() {
        System.out.println("i am d");
    }

    public void b(){
        System.out.println("i am b");
    }


    public void c() {
        System.out.println("child of C");
        super.c();
    }
}