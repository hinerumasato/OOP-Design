package QuanLyDiem;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Student {
	private String name;
	private Date dateOfBirth;
	private Lecturer assistant;
	private List<Register> courseRegs = new ArrayList<Register>();

	public Student(String name, Date dateOfBirth, Lecturer assistant, List<Register> courseRegs) {
		this.name = name;
		this.dateOfBirth = dateOfBirth;
		this.assistant = assistant;
		this.courseRegs = courseRegs;
	}

	public Student(String name, Date dateOfBirth) {
		this.name = name;
		this.dateOfBirth = dateOfBirth;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public Lecturer getAssistant() {
		return assistant;
	}

	public void setAssistant(Lecturer assistant) {
		this.assistant = assistant;
	}

	public List<Register> getCourseRegs() {
		return courseRegs;
	}

	public void setCourseRegs(List<Register> courseRegs) {
		this.courseRegs = courseRegs;
	}

	public void register(Course c) {
		courseRegs.add(new Register(c));
	}

	public void updateGrade(Course c, float grade) {
		for (Register r : courseRegs) {
			if (r.getCourse().getName().equals(c.getName())) {
				r.setGrade(grade);
				break;
			}
		}
	}

	public float average() {
		float sumAllGrade = 0;
		int sumAllCredits = 0;
		for (Register register : this.courseRegs) {
			sumAllGrade += register.getGrade() * register.getCourse().getCredits();
			sumAllCredits += register.getCourse().getCredits();
		}
		return sumAllGrade / sumAllCredits;
	}

	public String rank() {
		float average = average();
		if (average >= 9)
			return "XUAT SAC";
		else if (average >= 8)
			return "GIOI";
		else if (average >= 7)
			return "KHA";
		else if (average >= 6)
			return "TRUNG BINH KHA";
		else if (average >= 7)
			return "TRUNG BINH";
		else
			return "ROT";
	}

	public void printGradeReport() {
		System.out.println("Name: " + getName());
		System.out.println("Date of birth: " + getDateOfBirth());
		System.out.println("STT\tMon\tDiem");
		for (int i = 0; i < courseRegs.size(); i++) {
			System.out
					.println(i + "\t" + courseRegs.get(i).getCourse().getName() + "\t" + courseRegs.get(i).getGrade());
		}
		System.out.println("Average of grade: " + average());
		System.out.println("Rank: " + rank());
		System.out.println("----------------------------------------");
	}

}
