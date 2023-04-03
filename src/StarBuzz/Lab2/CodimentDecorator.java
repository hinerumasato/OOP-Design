package StarBuzz.Lab2;

public abstract class CodimentDecorator extends Beverage {
    protected Beverage beverage;

    @Override
    public String getDescription() {
        return beverage.getDescription();
    }
}
