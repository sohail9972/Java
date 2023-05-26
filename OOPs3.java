public class OOPs3 {
    public static void main(String[] args) {
        Laptop li=new Laptop();
        li.setprice(38988);
        System.out.println(li.getPrice());
    }
}
class Laptop{
    int ram;
    private int price;

    public void setprice(int price){
        boolean isAdmin=true;
        if(!isAdmin){
            System.out.println("you cannot set the Price");
        }
        this.price=price;
    }

    public int getPrice() {
        return price;
    }
}
