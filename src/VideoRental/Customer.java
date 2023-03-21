package VideoRental;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Customer {
    private String name;
    private List<RentItem> rentals = new ArrayList<RentItem>();

    public Customer(String name) {
        this.name = name;
    };

    public String getName() {
        return name;
    };

    public List<RentItem> getRentals() {
        return rentals;
    }

    public boolean rent(Movie movie, Date startDate) {
        RentItem rental = new RentItem(movie, startDate);
        if (rentals.size() < 5) {
            rentals.add(rental);
            rental.getMovie().setAvailable(false);
            return true;
        } else
            return false;
    }

    public boolean returnMovie(String title) {
        RentItem r = null;
        for (RentItem rental : rentals) {
            if (rental.getMovie().getTitle().equals(title)) {
                r = rental;
                break;
            }
        }
        if (r != null) {
            rentals.remove(r);
            r.getMovie().setAvailable(true);
            return true;
        } else
            return false;
    }

    public String statement() {
        StringBuffer result = new StringBuffer();
        result.append("Hoa don cua " + getName() + "\n");
        for (RentItem each : rentals) {
            result.append("\t" + each.getMovie().getTitle() + "\t"
                    + each.getCharge() + "\n");
        }
        result.append("Tien tra " + getTotalCharge() + "\n");
        result.append("Diem thuong " + getTotalFrequentRenterPoints());
        return result.toString();
    }

    private double getTotalCharge() {

        double result = 0;
        for (RentItem each : rentals) {
            result += each.getCharge();
        }
        return result;
    }

    private double getTotalFrequentRenterPoints() {
        double result = 0;
        for (RentItem each : rentals) {
            result += each.getFrequentRenterPoints();
        }
        return result;
    }
}
