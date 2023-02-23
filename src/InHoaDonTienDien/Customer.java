package InHoaDonTienDien;

import java.util.List;

public abstract class Customer {
	protected String id;
	protected String name;
	protected final double TAX_RATE = 0.1;

	public Customer(String id, String name) {
		this.id = id;
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Reading getOldReading() {
		return getReadings().get(getReadings().size() - 2);
	}

	public Reading getNewReading() {
		return getReadings().get(getReadings().size() - 1);
	}

	public abstract void addReading(Reading reading);

	public abstract List<? extends Reading> getReadings();

	public abstract String statement();

	public abstract double charge();

}
