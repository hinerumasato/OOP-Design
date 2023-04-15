package BTOn.Tour;

public abstract class TourOption extends Tour {
    protected Tour tour;

    public TourOption(Tour tour) {
        this.tour = tour;
    }

    public Tour getTour() {
        return tour;
    }

    public void setTour(Tour tour) {
        this.tour = tour;
    }

    public abstract String getDescription();
    
}
