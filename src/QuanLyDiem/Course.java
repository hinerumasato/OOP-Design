package QuanLyDiem;

public class Course {
	private String name;
	private int credits;
	private Lecturer lecture;
	
	public Course(String name, int credits, Lecturer lecture) {
		this.name = name;
		this.credits = credits;
		this.lecture = lecture;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getCredits() {
		return credits;
	}

	public void setCredits(int credits) {
		this.credits = credits;
	}

	public Lecturer getLecture() {
		return lecture;
	}

	public void setLecture(Lecturer lecture) {
		this.lecture = lecture;
	}
	
}
