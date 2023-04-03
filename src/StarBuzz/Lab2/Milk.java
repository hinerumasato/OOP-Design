package StarBuzz.Lab2;

public class Milk extends CodimentDecorator {

    public Milk(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", Milk";
    }

    @Override
    public double cost() {
        return beverage.cost() + 0.1;
    }
    
}
