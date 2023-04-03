package VideoRental;

public class ChildrenMovie extends Movie {
    public ChildrenMovie(String title) {
        super(title);
        setChargeWay(new ChildrenCharge());
        setFrequentRenterPointWay(new RegularPoints());
    }
}
