package VideoRental;

public class NewReleaseMovie extends Movie {
    public NewReleaseMovie(String title) {
        super(title);
        setChargeWay(new NewReleaseCharge());
        setFrequentRenterPointWay(new NewReleasePoints());
    }
}
