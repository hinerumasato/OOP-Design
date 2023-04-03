package StarBuzz.Lab1;

public class Decaf extends Beverage {
    @Override
    public double cost() {
        return super.cost() + 1.05;
    }
}
