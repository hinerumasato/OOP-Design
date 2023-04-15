package BTOn.Tour;

public class SuperSaleTour extends TourOption {
    private double saleRate;
    
    public SuperSaleTour(double saleRate, Tour tour) {
        super(tour);
        this.saleRate = saleRate;
    }
    @Override
    public double price() {
        return tour.price() * (1 - saleRate);
    }
    @Override
    public String getDescription() {
        return tour.getDescription() + ", Sale rate: " + saleRate;
    }
}
