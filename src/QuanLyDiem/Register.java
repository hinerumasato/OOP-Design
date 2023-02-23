package QuanLyDiem;

public class Register {
	private Course course;
	private float grade;
	public Register(Course course, float grade) {
		this.course = course;
		this.grade = grade;
	}
	
	public Register(Course course) {
		this.course = course;
	}

	public Course getCourse() {
		return course;
	}
	
	public void setCourse(Course course) {
		this.course = course;
	}
	
	public float getGrade() {
		return grade;
	}
	
	public void setGrade(float grade) {
		this.grade = grade;
	}
	
}
