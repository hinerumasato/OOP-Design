package StarBuzz.Lab1;

public class DarkRoast extends Beverage {
    @Override
    public double cost() {
        return super.cost() + 0.99;
    }
}
