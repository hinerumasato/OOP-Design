package BTOn.Tour;

public class TestDrive {
    public static void main(String[] args) {
        Tour tour1 = new DomesticTour("PThiet", "Phan Thiet - Mui Ne", 3, 550000);
        Tour tour2 = new DomesticTour("NTrang", "Nha Trang", 4, 900000);
        Tour tour3 = new DomesticTour("DLNT", "Da Lat - Nha Trang", 4, 1250000);
        Tour tour4 = new OverseasTour("Thai", "HCM - Bangkok - Pattaya - Koh Island", 5, 3600000, "Thailand", 500000);

        System.out.println(tour1.price());

        tour1 = new FiveStarTour(new SuperSaleTour(0.5, tour1));

        System.out.println(tour1.price());
        System.out.println(tour1.getDescription());


    }
}
