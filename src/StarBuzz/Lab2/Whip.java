package StarBuzz.Lab2;

public class Whip extends CodimentDecorator {

    public Whip(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", Whip";
    }

    @Override
    public double cost() {
       return beverage.cost() + 0.1;
    }
    
}
