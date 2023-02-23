package InHoaDonTienDien;

import java.util.Date;

public class ThreeReading extends Reading {
	private int highIndex;
	private int lowIndex;

	public ThreeReading(Date date, int index, int highIndex, int lowIndex) {
		super(date, index);
		this.highIndex = highIndex;
		this.lowIndex = lowIndex;
	}

	public int getHighIndex() {
		return highIndex;
	}

	public void setHighIndex(int highIndex) {
		this.highIndex = highIndex;
	}

	public int getLowIndex() {
		return lowIndex;
	}

	public void setLowIndex(int lowIndex) {
		this.lowIndex = lowIndex;
	}

}
