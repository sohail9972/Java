package NewJourney.inheritance;

public class Main {
    public static void main(String[] args) {
//        Box box = new Box(4,22.2,45.4);


//        System.out.println(box.h + " " + box.w + " " + box.l);


//        Boxweight box2 = new Boxweight();
//        System.out.println(box2.h + " " + box2.weight + " " + box2.w);
//
//        //creating refrence from Parent Classs and We create object type of the Child Class
//        //it is the type of the refrence Varibale which determine the The Type of the object can be accessed
//        Box box3 = new Boxweight(2,1,5,4);
//        System.out.println(box3);

        //We cannot do this as the Parent Class Do not have the Child Created variable within it
//        Boxweight box34 = new Box(2,1,5);
//        System.out.println(box3);


        BoxPrice box21 = new BoxPrice(5,20,65);
        System.out.println(box21);
    }
}
