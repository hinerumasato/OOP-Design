package QuanLyDiem;

import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.Scanner;

public class MyITCenter {
	private List<Lecturer> lecturers = new ArrayList<Lecturer>();
	private List<Student> students = new ArrayList<Student>();
	private List<Course> courses = new ArrayList<Course>();
	
	public MyITCenter() {
		this.init();
	}

	public void init() {
		Lecturer l1 = new Lecturer("Pham Van Tinh", new GregorianCalendar(1970, 11, 20).getTime(), "PhD");
		Lecturer l2 = new Lecturer("Mai Anh Tho", new GregorianCalendar(1979, 12, 24).getTime(), "MS");
		Lecturer l3 = new Lecturer("Nguyen Duc Cong Song", new GregorianCalendar(1977, 8, 14).getTime(), "MS");
		lecturers.add(l1);
		lecturers.add(l2);
		lecturers.add(l3);
		Course c1 = new Course("Lap trinh co ban", 4, l2);
		Course c2 = new Course("Lap trinh nang cao", 4, l3);
		Course c3 = new Course("Lap trinh mang", 4, l1);
		Course c4 = new Course("Mang may tinh", 4, l1);
		courses.add(c1);
		courses.add(c2);
		courses.add(c3);
		courses.add(c4);
		Student s1 = new Student("Nguyen Van Tuan", new GregorianCalendar(1988, 1, 23).getTime());
		Student s2 = new Student("Tran Van Thiet", new GregorianCalendar(1989, 11, 2).getTime());
		Student s3 = new Student("Nguyen Thi Lan", new GregorianCalendar(1988, 6, 20).getTime());
		Student s4 = new Student("Nguyen Thi Truc", new GregorianCalendar(1990, 4, 15).getTime());
		Student s5 = new Student("Vo Tan Doi", new GregorianCalendar(1988, 2, 26).getTime());
		Student s6 = new Student("Do The Sang", new GregorianCalendar(1989, 3, 12).getTime());
		students.add(s1);
		students.add(s2);
		students.add(s3);
		students.add(s4);
		students.add(s5);
		students.add(s6);
		s1.register(c1);

		s1.register(c2);
		s1.register(c3);
		s2.register(c2);
		s2.register(c3);
		s2.register(c4);
		s3.register(c1);
		s3.register(c2);
		s3.register(c3);
		s3.register(c4);
		s4.register(c1);
		s4.register(c3);
		s4.register(c4);
		s5.register(c1);
		s5.register(c2);
		s5.register(c3);
		s5.register(c4);
		s6.register(c1);
		s6.register(c2);
		s1.updateGrade(c1, 6);
		s1.updateGrade(c2, 7);
		s1.updateGrade(c3, 8);
		s2.updateGrade(c2, 8.5f);
		s2.updateGrade(c3, 5);
		s2.updateGrade(c4, 7);
		s3.updateGrade(c1, 4);
		s3.updateGrade(c2, 7.5f);
		s3.updateGrade(c3, 8);
		s3.updateGrade(c4, 10);
		s4.updateGrade(c1, 8);
		s4.updateGrade(c3, 3);
		s4.updateGrade(c4, 6);
		s5.updateGrade(c1, 5);
		s5.updateGrade(c2, 4);
		s5.updateGrade(c3, 6);
		s5.updateGrade(c4, 8);
		s6.updateGrade(c1, 5);
		s6.updateGrade(c2, 8);
	}

	public Student findStudentByName(String name) {
		for (Student student : this.students) {
			if (student.getName().equals(name))
				return student;
		}
		return null;
	}

	public List<Student> getStudentsOfCourse(Course c) {
		List<Student> result = new ArrayList<Student>();
		for (Student student : this.students) {
			for (Register register : student.getCourseRegs()) {
				if (register.getCourse().getName().equals(c.getName()))
					result.add(student);
			}
		}
		return result;
	}

	public void printStudentInfo() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Nhap ten hoc vien: ");
		String name = scanner.nextLine();
		Student findedStudent = this.findStudentByName(name);
		if (findedStudent != null) {
			System.out.println(findedStudent.average());
			System.out.println(findedStudent.rank());
			findedStudent.printGradeReport();
		} else
			System.out.println("Khong tim thay sinh vien");
		scanner.close();
	}

	public static void main(String[] args) {
		MyITCenter program = new MyITCenter();
		program.printStudentInfo();
	}
}
