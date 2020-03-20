package Model;

/*
 * This will be the class where courses will be created
 */
public class Course {

	String CourseName; // The name for the course
	int fee; // The fee for the course
	int aoc; // The amount of credits the course is worth
	String prof; // The name of the professor
	int CourseGrade; // The Defaulted Course Grade for whenever a student adds the course without a grade
					
// Course Constructor #1
	public Course(String CourseName, int fee, int aoc, String prof) {
		this.CourseName = CourseName;
		this.fee = fee;
		this.aoc = aoc;
		this.prof = prof;
		CourseGrade = -1;
	}

// Course Constructor #2
	public Course(String CourseName, int fee, int aoc) {
		this.CourseName = CourseName;
		this.aoc = aoc;
		this.fee = fee;
		this.prof = "";
		CourseGrade = -1;
	}

//Course Constructor #3
	Course(String CourseName, int aoc) {
		this.CourseName = CourseName;
		this.aoc = aoc;
		this.prof = "";
		CourseGrade = -1;
	}

//Copy Constructor
	public Course(Course other) {
		this.CourseName = other.CourseName;
		this.fee = other.fee;
		this.aoc = other.aoc;
		this.prof = other.prof;
		this.CourseGrade = other.CourseGrade;
	}

//  Method that gives back the Course Name
	public String getCourseName() {
		return CourseName;
	}

// Method that gives back the fee of the course
	public int getFee() {
		return fee;
	}

// Method that gives back the amount of credits of the course 
	public int getAoc() {
		return aoc;
	}

// Method that gives back the name of the professor 
	public String getProf() {
		return prof;
	}

// Method that changes the course name of a course
	public void setCourseName(String courseName) {
		CourseName = courseName;
	}

// Method that changes the fee of the course
	public void setFee(int fee) {
		this.fee = fee;
	}

// Method that changes the amount of credits of the course
	public void setAoc(int aoc) {
		this.aoc = aoc;
	}

// Method that changes the name of the professor of the course
	public void setProf(String prof) {
		this.prof = prof;
	}

// Set the students Course Grade
	public void setCourseGrade(int grade) {
		this.CourseGrade = grade;
	}

// Get the students course Grade
	public int getCourseGrade() {
		return this.CourseGrade;
	}
}
