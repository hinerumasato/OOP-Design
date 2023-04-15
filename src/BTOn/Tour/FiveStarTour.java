package BTOn.Tour;

public class FiveStarTour extends TourOption {

    public FiveStarTour(Tour tour) {
        super(tour);
    }

    @Override
    public double price() {
        return tour.price() * 1.5;
    }

    @Override
    public String getDescription() {
        return "Five Star: " + tour.getDescription();
    }
    
}
