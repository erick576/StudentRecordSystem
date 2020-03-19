package Model;

import java.util.HashMap;

/*
 * This class will store all of the students into a database where a list of them can be formed and details about them can be accessed using a key that will efficiently find them
 * Students references should not be exposed in the Database
 */
public class StudentManagmentDatabase {

// Initialize the variables for the class
	static int counter; // This will keep track of the total number of students in the database
	int key; // This will be used for each student to locate them within the database
	HashMap<Integer, Student> StudentRecord = new HashMap<Integer, Student>(); // Store Students Within A hashMap

// Method that will return the hash code for the student based on the students PersonId
	int hashCode(int personid) {
		return personid % 11;
	}

// Constructor Method that will create a new database to store students
	public StudentManagmentDatabase() {
		StudentRecord = new HashMap<Integer, Student>();
	}

// Method that will add the student into the database
	public void addStudent(Student s) {
		int num = hashCode(s.getPersonid());
		StudentRecord.put(num, new Student(s));
		counter++;
	}

// Method that will add the domestic student into the database
	void addDomesticStudent(DomesticStudent dms) {
		int num = hashCode(dms.getPersonid());
		StudentRecord.put(num, new DomesticStudent(dms));
		counter++;
	}

// Method that will add the international student into the database
	public void addInternationalStudent(InternationalStudent ins) {
		int num = hashCode(ins.getPersonid());
		StudentRecord.put(num, new InternationalStudent(ins));
		counter++;
	}

// Method that will return the students name based on their PersonId
	public String findStudentFromKey(int personid) {
		int i = hashCode(personid);
		return StudentRecord.get(i).getName();
	}

// Method that removes a student from the database
	public void removeStudent(Student s) {
		StudentRecord.remove(s, hashCode(s.getPersonid()));
		counter--;
	}

// Method that removes a Domestic student from the database
	void removeDomesticStudent(DomesticStudent dms) {
		StudentRecord.remove(dms, hashCode(dms.getPersonid()));
		counter--;
	}

// Method that removes a International student from the database
	void removeInternationalStudent(InternationalStudent ins) {
		StudentRecord.remove(ins, hashCode(ins.getPersonid()));
		counter--;
	}

// Method that returns a list of all the students in the database
	public String getListOfStudents() {
		String list = "";
		for (int i = 1; i < counter + 1; i++) {
			list += i + ". " + findStudentFromKey(i) + "\n";
		}
		return list;
	}
}
