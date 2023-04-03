package VideoRental;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class TestVideoRental {
    public static void main(String[] args) {
        Movie m1 = new ChildrenMovie("Harry Potter");
        Movie m2 = new RegularMovie("Pretty Woman");
        Movie m3 = new NewReleaseMovie("Gai nhay");
        Movie m4 = new RegularMovie("Nguoi Ha Noi");
        Movie m5 = new NewReleaseMovie("Lo lem he pho");
        Customer teo = new Customer("Teo");
        Customer ti = new Customer("Ti");
        teo.rent(m1, new GregorianCalendar(2017, Calendar.MARCH, 2).getTime());
        teo.rent(m3, new GregorianCalendar(2017, Calendar.MARCH, 6).getTime());
        ti.rent(m2, new GregorianCalendar(2017, Calendar.MARCH, 7).getTime());
        ti.rent(m4, new GregorianCalendar(2017, Calendar.MARCH, 7).getTime());
        ti.rent(m5, new GregorianCalendar(2017, Calendar.MARCH, 10).getTime());
        System.out.println(teo.statement());
        System.out.println("-----------------");
        System.out.println(ti.statement());
        System.out.println("-----------------");
        teo.returnMovie("Gai nhay");
        System.out.println(teo.statement());
    }
}
