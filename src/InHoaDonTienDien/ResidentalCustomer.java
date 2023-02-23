package InHoaDonTienDien;

import java.util.ArrayList;
import java.util.List;

public class ResidentalCustomer extends Customer {
	private List<OneReading> readings = new ArrayList<OneReading>();

	public ResidentalCustomer(String id, String name) {
		super(id, name);
	}

	public List<OneReading> getReadings() {
		return readings;
	}

	public void setReadings(List<OneReading> readings) {
		this.readings = readings;
	}

	@Override
	public String statement() {
		Reading oldReading = getOldReading();
		Reading newReading = getNewReading();
		int usage = newReading.getIndex() - oldReading.getIndex();
		return "Ma Khach: " + getId() + "\nTen: " + getName() + "\nChi so cu: "

				+ oldReading.getIndex() + "\nChi so moi: " + newReading.getIndex() + "\ndien nang tieu thu: " + usage
				+ "\nthanh tien (10% VAT): " + charge() + " VND\n\n\n\n";
	}

	@Override
	public double charge() {
		int oldIndex = getOldReading().getIndex();
		int newIndex = getNewReading().getIndex();
		int usage = newIndex - oldIndex;

		int u1 = (usage <= 100 ? usage : 100);

		int u2 = (usage <= 150 ? (usage - u1) : 50);

		int u3 = (usage <= 200 ? (usage - u1 - u2) : 50);

		int u4 = (usage <= 300 ? (usage - u1 - u2 - u3) : 100);

		int u5 = (usage - u1 - u2 - u3 - u4);
		double result = u1 * 550 + u2 * 900 + u3 * 1210 + u4 * 1340 + u5 * 1400;

		result += result * TAX_RATE;
		return result;
	}

	@Override
	public void addReading(Reading reading) {
		this.getReadings().add((OneReading) reading);
	}

}
