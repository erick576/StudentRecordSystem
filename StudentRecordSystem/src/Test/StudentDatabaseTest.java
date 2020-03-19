package Test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import Model.Course;
import Model.DomesticStudent;
import Model.InternationalStudent;
import Model.Student;
import Model.StudentManagmentDatabase;

public class StudentDatabaseTest {

	Student Eric;
	Student Chris;
	Student Alex;
	Student Angella;
	InternationalStudent Jin;
	Course EECS2030;
	Course EECS2021;
	Course MATH2015;
	Course PHYS2020;
	Course EECS2200;
	
	@Before
	public void setUpClass() throws Exception {
			Eric = new Student("Eric");
			Chris = new Student("Chris");
			Alex = new InternationalStudent("Alex");
			Angella = new DomesticStudent("Angella");
			Jin = new InternationalStudent("Jin");

		    EECS2030 = new Course("EECS2030", 1150.0, 3, "Burton Ma");
		    EECS2021 = new Course("EECS2021", 1450.0, 4, "Amir Ranmhi");
		    MATH2015 = new Course("MATH2015", 1150.0, 3, "Valeri Machine");
		    PHYS2020 = new Course("PHYS2020", 1150.0, 3, "Stanislaw Jerzak");
		    EECS2200 = new Course("EECS2200", 1450.0, 4, "Amir Kosshen");
			
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

	}
	
	@Test
	public void getGPATest() {
		assertEquals((int) 8.5, (int) Eric.getGPA());
		assertEquals((int) 7.0, (int) Chris.getGPA());
		assertEquals((int) 7.0, (int) Alex.getGPA());
		assertEquals((int) 7.0, (int) Angella.getGPA());
		assertEquals((int) 6.6, (int) Jin.getGPA());
	}
	
	@Test
	public void getTuitionTest() {
		assertEquals((int) 4900.0, (int) Eric.getTuition());
		assertEquals((int) 2600.0, (int) Chris.getTuition());
		assertEquals((int) 5625.0, (int) Alex.getTuition());
		assertEquals((int) 862.5, (int) Angella.getTuition());
		assertEquals((int) 9525.0, (int) Jin.getTuition());
	}
	
	@Test
	public void studentDatabaseTest() {
		StudentManagmentDatabase Record = new StudentManagmentDatabase();
		Record.addStudent(Eric);
		Record.addStudent(Chris);
		InternationalStudent ins = (InternationalStudent) Alex;
		Record.addInternationalStudent(ins);
		DomesticStudent dms = (DomesticStudent) Angella;
		Record.addStudent(dms);
		Record.addStudent(Jin);

		assertEquals("Chris", Record.findStudentFromKey(2));

		assertEquals("1. Eric\n2. Chris\n3. Alex\n4. Angella\n5. Jin\n", Record.getListOfStudents());
	}

}
