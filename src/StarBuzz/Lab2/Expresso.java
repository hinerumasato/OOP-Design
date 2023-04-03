package StarBuzz.Lab2;

public class Expresso extends Beverage {

    public Expresso() {
        this.description = "Expresso";
    }
    
    @Override
    public double cost() {
        return 1.989;
    }
}
