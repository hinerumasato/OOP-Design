package InHoaDonTienDien;

public class EVNCompany {

	private EVNComDivision division;

	public EVNCompany(EVNComDivision division) {
		this.division = division;
	}

	public EVNComDivision getDivision() {
		return division;
	}

	public void setDivision(EVNComDivision division) {
		this.division = division;
	}

	public void printAllInvoice() {
		System.out.println(division.allInvoice());
	}

	public void printInvoiceById(String id) {
		System.out.println(division.invoice(id));
	}
}
