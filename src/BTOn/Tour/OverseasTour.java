package BTOn.Tour;

public class OverseasTour extends Tour {

    private String country;
    private double visaSurtax;

    public OverseasTour(String name, String description, int days, double basePrice, String country,
            double visaSurtax) {
        this.name = name;
        this.description = description;
        this.days = days;
        this.basePrice = basePrice;
        this.country = country;
        this.visaSurtax = visaSurtax;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public double getVisaSurtax() {
        return visaSurtax;
    }

    public void setVisaSurtax(double visaSurtax) {
        this.visaSurtax = visaSurtax;
    }

    @Override
    public double price() {
        return basePrice + visaSurtax;
    }

}
