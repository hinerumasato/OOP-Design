package VideoRental;

public class RegularCharge implements ChargeWay {
    public double getCharge(int daysRented) {
        double result = 3000;
        if (daysRented > 2)
            result += (daysRented - 2) * 1000;
        return result;
    }
}
