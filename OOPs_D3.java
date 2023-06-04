public class OOPs_D3 {
    public static void main(String[] args) {
        draw object=new rectangle();
        object.method_draw();

        draw obj=new circle();
        obj.method_draw();

        rectangle object1=new double_circle();
        object1.method_rec();
    }
}

abstract class draw{
    abstract void method_draw();
}

class rectangle extends draw{
    void method_draw(){
        System.out.println("rectangle is drawn");
    }

    void method_rec() {
        System.out.println("draw circle inside rectangle");
    }
}

class circle extends draw{
    void method_draw(){
        System.out.println("draw a circle");
    }
}

class double_circle extends rectangle{
    void method_rec(){
        System.out.println("inside its done");
    }
}