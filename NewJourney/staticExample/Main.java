package NewJourney.staticExample;

public class Main {
    public static void main(String[] args) {

        //reference variables
        human soahail =  new human(23,40000,false,"sohail");
        human minto =  new human(26,46000,true,"rahul");


        //while accessing the Static variables dont acess it using ht eRefence Varibales
        //instead we can do it using the Class Names which is the Actual Method
        //As that Varibles are confined to the Class
        //but not the constructors
        //here below wehave done accessing using the reference varibales

        //As when its compiling it searches the static variable population in that Constructor but
        //it cannot find it , but it cross checks whether it is static Variable which is common to all (generic)



        System.out.println(soahail.population);
        System.out.println(minto.population);

        //here its actuall Convenction
        System.out.println(human.population);
        System.out.println(human.population);


    }

    //this is not dependednt on objects
    static void joker(){
        //creation of non static object
        //we cannot access non static stuff without refrencingtheir instances in
        //a static Context

        //here i am refrencing it
        Main obj = new Main();
        obj.greeting();
        System.out.println("hellow static");
 // greeting(); this we cannot do
  //we cannot use this because it requires an instance
        //but the Function we are using it doers not depend on the instances
    }

    // this depends on the Objects
    //we know that something whihc is not static , it belongs to Object
    //for non static method creation of objects is mandatory else we cannot access those
    void greeting(){
        System.out.println("hello world");
    }
}
