package VideoRental;

public class Movie {
    private String title;
    private ChargeComputing chargeComputing;
    private FrequentRenterPointComputing frequentRenterPointComputing;
    private boolean available;

    public Movie(String title, ChargeComputing price,
            FrequentRenterPointComputing frequentRenterPoint) {
        this.title = title;
        this.chargeComputing = price;
        this.frequentRenterPointComputing = frequentRenterPoint;
        available = true;
    }

    public ChargeComputing getChargeComputing() {
        return chargeComputing;
    }

    public void setChargeComputing(ChargeComputing arg) {
        chargeComputing = arg;
    }

    public FrequentRenterPointComputing getFrequentRenterPoint() {
        return frequentRenterPointComputing;
    }

    public void setFrequentRenterPoint(FrequentRenterPointComputing frpComputing) {
        this.frequentRenterPointComputing = frpComputing;
    }

    public String getTitle() {
        return title;
    }

    public double getCharge(int daysRented) {
        return chargeComputing.getCharge(daysRented);
    }

    public int getFrequentRenterPoints(int daysRented) {
        return frequentRenterPointComputing.getPoints(daysRented);
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    public String toString() {
        return title + ", State: "
                + (available ? " available:" : " not available");
    }
}
