package OOPs5;

public class ExamplesOT {
    public static void main(String[] args) {
//        patient p1=new patient();
//        p1.age=24;
//        p1.disease="tumor";
//        System.out.println(p1.age +" " + p1.disease);
//
//        p1.scan();
//        p1.scan("knee");
patient p2 =new patient("don", 34);
    }
}

class patient{

    String name;
 int age;
 String disease;
 static int count;
// public patient(){
//     count++;
//     System.out.println("patient created again");
// }

 public patient(String name,int age){
     this.name=name;
     this.age=age;
 }

 void scan(){
     System.out.println("one scan");
 }
 void scan(String location){
     System.out.println("1st floor");
 }


}