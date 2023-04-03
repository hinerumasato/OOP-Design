package StarBuzz.Lab1;

public class Expresso extends Beverage {
    @Override
    public double cost() {
        return super.cost() + 1.989;
    }
}
