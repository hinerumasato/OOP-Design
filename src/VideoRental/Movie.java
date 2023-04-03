package VideoRental;

public class Movie {
    private String title;
    private ChargeWay chargeWay;
    private FrequentRenterPointWay frequentRenterPointWay;
    private boolean available;

    public Movie(String title, ChargeWay price,
            FrequentRenterPointWay frequentRenterPoint) {
        this.title = title;
        this.chargeWay = price;
        this.frequentRenterPointWay = frequentRenterPoint;
        available = true;
    }

    public Movie(String title) {
        this.title = title;
    }

    public ChargeWay getChargeWay() {
        return chargeWay;
    }

    public void setChargeWay(ChargeWay arg) {
        chargeWay = arg;
    }

    public FrequentRenterPointWay getFrequentRenterPoint() {
        return frequentRenterPointWay;
    }

    public void setFrequentRenterPointWay(FrequentRenterPointWay frpComputing) {
        this.frequentRenterPointWay = frpComputing;
    }

    public String getTitle() {
        return title;
    }

    public double getCharge(int daysRented) {
        return chargeWay.getCharge(daysRented);
    }

    public int getFrequentRenterPoints(int daysRented) {
        return frequentRenterPointWay.getFrequentRenterPoints(daysRented);
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
