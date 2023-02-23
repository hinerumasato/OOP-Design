package InHoaDonTienDien;

import java.util.ArrayList;
import java.util.List;

public class BusinessCustomer extends Customer {
	private List<ThreeReading> readings = new ArrayList<ThreeReading>();
	private String accountNumber;

	public BusinessCustomer(String id, String name, String accountNumber) {
		super(id, name);
		this.accountNumber = accountNumber;
	}

	public List<ThreeReading> getReadings() {
		return readings;
	}

	public void setReadings(List<ThreeReading> readings) {
		this.readings = readings;
	}

	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	@Override
	public String statement() {
		ThreeReading oldReading = (ThreeReading) getOldReading();
		ThreeReading newReading = (ThreeReading) getNewReading();
		int usage = newReading.getIndex() - oldReading.getIndex();

		return "Ma Nha SX: " + getId() + "\nTen Nha SX: " + getName() + "\nSo tai khoan: " + getAccountNumber()
				+ "\nChi So Cu: " + oldReading.getIndex() + "\nChi so moi: " + newReading.getIndex()
				+ "\nDien nang tieu thu: " + usage + "\nGio binh thuong: " + getNormalUsage(oldReading, newReading)
				+ "\nGio cao diem: " + getHighUsage(oldReading, newReading) + "\nGio thap diem: "
				+ getLowUsage(oldReading, newReading) + "\nthanh tien(10%VAT): " + charge() + " VND\n\n\n\n";
	}

	private int getNormalUsage(ThreeReading oldReading, ThreeReading newReading) {
		return newReading.getIndex() - oldReading.getIndex() - getLowUsage(oldReading, newReading)
				- getHighUsage(oldReading, newReading);

	}

	private int getHighUsage(ThreeReading oldReading, ThreeReading newReading) {
		return newReading.getHighIndex() - oldReading.getHighIndex();
	}

	private int getLowUsage(ThreeReading oldReading, ThreeReading newReading) {
		return newReading.getLowIndex() - oldReading.getLowIndex();
	}

	@Override
	public double charge() {
		ThreeReading oldReading = (ThreeReading) getOldReading();
		ThreeReading newReading = (ThreeReading) getNewReading();
		double result = getNormalUsage(oldReading, newReading) * 895 + getLowUsage(oldReading, newReading) * 505
				+ getHighUsage(oldReading, newReading) * 1480;
		result += result * TAX_RATE;
		return result;
	}

	@Override
	public void addReading(Reading reading) {
		this.getReadings().add((ThreeReading) reading);
	}

}
