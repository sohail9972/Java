package allotherprograms;

public class exampleencapsulation {
    public static void main(String[] args) {
doctors d1=new doctors();
d1.setName("dee");

    }
//    public void doc(){
//        System.out.println("all the Doctors ");
    }

class doctors{
    int limit;
    private String name;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
