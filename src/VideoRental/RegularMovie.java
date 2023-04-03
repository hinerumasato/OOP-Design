package VideoRental;

public class RegularMovie extends Movie {
    public RegularMovie(String title) {
        super(title);
        setChargeWay(new RegularCharge());
        setFrequentRenterPointWay(new RegularPoints());
    }
}
