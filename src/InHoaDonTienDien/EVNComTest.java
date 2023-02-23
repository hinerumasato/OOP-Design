package InHoaDonTienDien;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class EVNComTest {
	
	private EVNComDivision division;
	private ResidentalCustomer r1;
	private BusinessCustomer b1;
	
	private EVNCompany company;
	
	public void init() {
		division = new EVNComDivision("TP.HCM");
		r1 = new ResidentalCustomer("01234", "Nguyen Thi Teo");
		b1 = new BusinessCustomer("00001", "Binh Thanh Nguyen", "10231223");
		division.register(r1);
		division.register(b1);
		r1.addReading(new OneReading(new GregorianCalendar(2001, Calendar.JANUARY, 15).getTime(), 4551));
		r1.addReading(new OneReading(new GregorianCalendar(2001, Calendar.FEBRUARY, 15).getTime(), 4796));
		b1.addReading(new ThreeReading(new GregorianCalendar(2001, Calendar.JANUARY, 10).getTime(), 20560, 5000, 2000));
		b1.addReading(
				new ThreeReading(new GregorianCalendar(2001, Calendar.FEBRUARY, 10).getTime(), 21796, 5236, 2150));
		
		company = new EVNCompany(division);
	}
	
	public void testAll() {
		company.printAllInvoice();
	}
	
	public void testById() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap Ma Khach Hang: ");
		String id = sc.nextLine();
		
		company.printInvoiceById(id);
		
		sc.close();
	}
	
	public EVNComTest() {
		this.init();
	}

	public static void main(String[] args) {
		EVNComTest test = new EVNComTest();
		test.testById();
	}
}
