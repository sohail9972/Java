public class OOPs_D5 {
    public static void main(String[] args) {
        drawing object=new circle1();
        object.method_inteface();

        drawing obj=new rectangle1();
        obj.method_inteface();
    }
}


interface drawing{
    void method_inteface();
}

class circle1 implements drawing{
    public  void method_inteface(){
        System.out.println("circle drawn");
    }

}

class rectangle1 implements drawing{
    public void method_inteface(){
        System.out.println("rectangled area");
    }
}