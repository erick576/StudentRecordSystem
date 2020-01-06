import java.util.Scanner;

public class StudentDatabaseTester {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

// Construct Students with their types as well
		Student Eric = new Student("Eric");
		Student Chris = new Student("Chris");
		Student Alex = new InternationalStudent("Alex");
		Student Angella = new DomesticStudent("Angella");
		InternationalStudent Jin = new InternationalStudent("Jin");

// Construct Courses
		Course EECS2030 = new Course("EECS2030", 1150.0, 3, "Burton Ma");
		Course EECS2021 = new Course("EECS2021", 1450.0, 4, "Amir Ranmhi");
		Course MATH2015 = new Course("MATH2015", 1150.0, 3, "Valeri Machine");
		Course PHYS2020 = new Course("PHYS2020", 1150.0, 3, "Stanislaw Jerzak");
		Course EECS2200 = new Course("EECS2200", 1450.0, 4, "Amir Kosshen");

// Add classes to the students and grades
		try {
			Eric.addCourse(EECS2030);
			Eric.addCourse(MATH2015);
			Eric.addCourse(EECS2021);
			Eric.addCourse(PHYS2020);
			Eric.setCourseGrade(Eric, 9, "EECS2030");
			Eric.setCourseGrade(Eric, 9, "EECS2021");
			Eric.setCourseGrade(Eric, 8, "MATH2015");
			Eric.setCourseGrade(Eric, 8, "PHYS2020");

			Chris.addCourse(EECS2021);
			Chris.addCourse(EECS2030);
			Chris.setCourseGrade(Chris, 8, "EECS2030");
			Chris.setCourseGrade(Chris, 6, "EECS2021");

			InternationalStudent ins = (InternationalStudent) Alex;
			ins.addCourse(EECS2021);
			ins.addCourse(EECS2030);
			ins.addCourse(MATH2015);
			ins.setCourseGrade(ins, 8, "MATH2015");
			ins.setCourseGrade(ins, 9, "EECS2021");
			ins.setCourseGrade(ins, 4, "EECS2030");
			ins.setPreniumRate(1.5);

			DomesticStudent dms = (DomesticStudent) Angella;
			dms.addCourse(PHYS2020);
			dms.setCourseGrade(dms, 7, "PHYS2020");
			dms.setDiscountRate(0.75);

			Jin.addCourse(EECS2021);
			Jin.addCourse(EECS2030);
			Jin.addCourse(EECS2200);
			Jin.addCourse(MATH2015);
			Jin.addCourse(PHYS2020);
			Jin.setCourseGrade(Jin, 4, "EECS2021");
			Jin.setCourseGrade(Jin, 9, "EECS2030");
			Jin.setCourseGrade(Jin, 8, "EECS2200");
			Jin.setCourseGrade(Jin, 7, "MATH2015");
			Jin.setCourseGrade(Jin, 5, "PHYS2020");
			Jin.setPreniumRate(1.5);

			fail("Cant add anymore courses");
		} catch (CourseCapacityReached e) {
		}

//Get descriptions from the students from their gpa and tuition
		System.out.println("Eric's GPA is: " + Eric.getGPA());
		System.out.println("Eric's tuition is: " + Eric.getTuition());
		System.out.println("Chris's GPA is: " + Chris.getGPA());
		System.out.println("Chris's tuition is: " + Chris.getTuition());
		System.out.println("Alex's GPA is: " + Alex.getGPA());
		System.out.println("Alex's tuition is: " + Alex.getTuition());
		System.out.println("Angella's GPA is: " + Angella.getGPA());
		System.out.println("Angella's tuition is: " + Angella.getTuition());
		System.out.println("Jin's GPA is: " + Jin.getGPA());
		System.out.println("Jin's tuition is: " + Jin.getTuition());

// Create a new database to store all the students and then print a list of them	
		StudentManagmentDatabase Record = new StudentManagmentDatabase();
		Record.addStudent(Eric);
		Record.addStudent(Chris);
		InternationalStudent ins = (InternationalStudent) Alex;
		Record.addInternationalStudent(ins);
		DomesticStudent dms = (DomesticStudent) Angella;
		Record.addStudent(dms);
		Record.addStudent(Jin);

		System.out.println("Student from Key 2: " + Record.findStudentFromKey(2));

		System.out.println(Record.getListOfStudents());

		Record.removeStudent(Eric);
		System.out.println(Record.getListOfStudents());

		input.close();

	}

	private static void fail(String string) {
		// TODO Auto-generated method stub

	}

}
