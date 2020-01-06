/*
 * This will be the class where courses will be created
 */
public class Course {

// Initialize the Variables for the class
	String CourseName; // The name for the course
	double fee; // The fee for the course
	int aoc; // The amount of credits the course is worth
	String prof; // The name of the professor
	double CourseGrade; // The Defaulted Course Grade for whenever a student adds the course without a
						// grade

// Course Constructor #1
	Course(String CourseName, double fee, int aoc, String prof) {
		this(CourseName, fee, aoc);
		this.prof = prof;
		CourseGrade = -1;
	}

// Course Constructor #2
	Course(String CourseName, double fee, int aoc) {
		this(CourseName, aoc);
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
	Course(Course other) {
		this(other.CourseName, other.fee, other.aoc, other.prof);
	}

// Accessor Method that gives back the Course Name
	public String getCourseName() {
		return CourseName;
	}

// Accessor Method that gives back the fee of the course
	public double getFee() {
		return fee;
	}

// Accessor Method that gives back the amount of credits of the course 
	public int getAoc() {
		return aoc;
	}

// Accessor Method that gives back the name of the professor 
	public String getProf() {
		return prof;
	}

// Mutator Method that changes the course name of a course
	public void setCourseName(String courseName) {
		CourseName = courseName;
	}

// Mutator Method that changes the fee of the course
	public void setFee(double fee) {
		this.fee = fee;
	}

// Mutator Method that changes the amount of credits of the course
	public void setAoc(int aoc) {
		this.aoc = aoc;
	}

// Mutator Method that changes the name of the professor of the course
	public void setProf(String prof) {
		this.prof = prof;
	}

}
