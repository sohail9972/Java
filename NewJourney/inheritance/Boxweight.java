package NewJourney.inheritance;

public class Boxweight extends Box{
    double weight;

    public Boxweight(){
        this.weight=-1;
    }

    public Boxweight(double h, double l, double w, double weight) {
        super(h, l, w); //call the Parent Class

        //used to initialize the values present int he Parent class
        this.weight = weight;
    }
    Boxweight(Boxweight other){
        super(other);
        weight= other.weight;
        System.out.println(weight);
    }

    Boxweight(double side,double weight){
        super(side);
        this.weight=weight;
    }
}
