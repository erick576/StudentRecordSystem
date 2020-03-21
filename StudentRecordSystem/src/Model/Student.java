package Model;

/*
 * This will be the parent class that the other types of students will be based off of
 */
public class Student {

// Initialize the variables for the class	
	String name; // Name of the student
	Course[] courses; // Array that stores the courses that the student is taking
	int noc; // The number of courses for the student
	int CourseGrade; // The Students Grade in the Course
	public static int id; // The sum of all students constructed
	public int personid; // The unique id given to each student

// Constructor for Student
	public Student(String name) {
		this.name = name;
		courses = new Course[6];
		noc = 0;
		id++;
		personid = id;
	}

// Copy Constructor
	public Student(Student other) {
		this.name = other.name;
		this.courses = new Course[other.courses.length];
		for (int i = 0; i < other.noc; i++) {
			this.courses[i] = new Course(other.courses[i]);
		}
		this.noc = other.noc;
		this.personid = other.personid;
	}

// Method to get the name of the student
	public String getName() {
		return name;
	}

// Method to get the grade that the student currently has in the course
	public double getCourseGrade(Course c) {
		double e = -1;
		for (int i = 0; i < noc; i++) {
			if (courses[i] == c) {
				e = courses[i].CourseGrade;
			}
		}
		return e;
	}

// Method that changes the name of the student
	public void setName(String name) {
		this.name = name;
	}

// Method to assign or change the grade of the student
	public void setCourseGrade(Student s, int CourseGrade, String CourseName) {
		for (int i = 0; i < s.noc; i++) {
			if (CourseName.equals(courses[i].getCourseName())) {
				courses[i].CourseGrade = CourseGrade;
			}
		}
	}

// Mutator Method to add a course for a student
	public void addCourse(Course c) throws CourseCapacityReached {
		if (noc == 6) {
			throw new CourseCapacityReached("Maximum Allowed Courses has already been reached");
		} else {
			Course cc = new Course(c.getCourseName(), c.getFee(), c.getAoc(), c.getProf());
			courses[noc] = cc;
			noc++;
		}
	}

// Method to get the tuition of the student
	public double getTuition() {
		double tuition = 0.0;
		for (int i = 0; i < noc; i++) {
			tuition += courses[i].getFee();
		}
		return tuition;
	}

// Method that returns the GPA of the student in a 9.0 scale
	public double getGPA() {
		double gpa = 0.0;
		int cwg = 0;
		for (int i = 0; i < noc; i++) {
			if (this.courses[i].getCourseGrade() != -1) {
				gpa += courses[i].CourseGrade;
				cwg++;
			}
		}
		return gpa / cwg;
	}

// Method that returns the PersonId of the student
	public int getPersonid() {
		return personid;
	}

// Get total Number of credits
	public int getCredits() {
		int total = 0;
		for (int i = 0; i < noc; i++) {
			total += courses[i].getAoc();
		}
		return total;
	}

	// Get Number Of Courses
	public int getNoc() {
		return noc;
	}

	// Set Number Of Courses
	public void setNoc(int noc) {
		this.noc = noc;
	}

	/*
	 * Extra Fields And Methods Used to Retrieve Data For Table
	 */

	public String type;
	public double gpa;
	public int credits;
	public double tuition;

	// Constructor for Student In TableView
	public Student(int id, String name, String type, double gpa, int credits, double tuition) {
		this.personid = id;
		this.name = name;
		this.type = type;
		this.gpa = gpa;
		this.credits = credits;
		this.tuition = tuition;
	}

	// Get GPA field for Table
	public double getGpa() {
		return gpa;
	}

	// Get Credit Field for Table
	public int getCredit() {
		return this.credits;
	}

	// Get Tuition Field for Table
	public double getTuitions() {
		return this.tuition;
	}

	// Get Type
	public String getType() {
		return this.type;
	}

	// Set Type
	public void setType(String type) {
		this.type = type;
	}

	// Return array of Courses
	public Course[] getCourses() {
		return this.courses;
	}

	// Get Course 1
	public String getCourse1() {
		if (courses[0] != null) {
			return courses[0].getCourseName();
		} else {
			return "";
		}
	}

	// Get Course 2
	public String getCourse2() {
		if (courses[1] != null) {
			return courses[1].getCourseName();
		} else {
			return "";
		}
	}

	// Get Course 3
	public String getCourse3() {
		if (courses[2] != null) {
			return courses[2].getCourseName();
		} else {
			return "";
		}
	}

	// Get Course 4
	public String getCourse4() {
		if (courses[3] != null) {
			return courses[3].getCourseName();
		} else {
			return "";
		}
	}

	// Get Course 5
	public String getCourse5() {
		if (courses[4] != null) {
			return courses[4].getCourseName();
		} else {
			return "";
		}
	}

	// Get Course 6
	public String getCourse6() {
		if (courses[5] != null) {
			return courses[5].getCourseName();
		} else {
			return "";
		}
	}

	// Set GPA
	public void setGpa(double gpa) {
		this.gpa = gpa;
	}

	// Set Credits
	public void setCredits(int credits) {
		this.credits = credits;
	}

	// Set Tuition
	public void setTuition(double tuition) {
		this.tuition = tuition;
	}

}