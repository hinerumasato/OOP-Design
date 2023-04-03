package VideoRental;

public class NewReleasePoints implements FrequentRenterPointWay {
    public int getFrequentRenterPoints(int daysRented) {
        if (daysRented > 1)
            return 2;
        else
            return 1;
    }
}
