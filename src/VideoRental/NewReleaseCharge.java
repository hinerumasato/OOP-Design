package VideoRental;

public class NewReleaseCharge implements ChargeWay {
    public double getCharge(int daysRented) {
        return daysRented * 4000;
    }
}
