package NewJourney.inheritance;

public class BoxPrice extends Boxweight{
    double cost;

    BoxPrice(){
        super();
        this.cost=cost;
    }
    BoxPrice(BoxPrice other){
        super(other);
        this.cost=other.cost;
    }

    public BoxPrice(double side, double weight, double cost) {
        super(side, weight);
        this.cost = cost;
    }
}
