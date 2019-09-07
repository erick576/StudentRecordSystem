/*This Class will have 
 * 1) A constructor for the courses (Course Name, Course Fee, Amount of credits, prof name)
 * 2) Each course will have a certain capacity where the students information will also be stored in it
 * 
 * 
 */

public class Course {
String CourseName;
double fee;
int aoc;
String prof;
double CourseGrade; 	
int nos;

Course(String CourseName, double fee, int aoc, String prof)	{
	this.CourseName = CourseName;
	this.fee = fee;
	this.aoc = aoc;
	this.prof = prof;
	CourseGrade = -1;
 	
}

Course(String CourseName, double fee, int aoc)	{
	this.CourseName = CourseName;
	this.fee = fee;
	this.aoc = aoc;
	CourseGrade = -1;
}

Course(String CourseName, int aoc)	{
	this.CourseName = CourseName;
	this.aoc = aoc;
	CourseGrade = -1;
}

public String getCourseName() {
	return CourseName;
}

public double getFee() {
	return fee;
}

public int getAoc() {
	return aoc;
}

public String getProf() {
	return prof;
}

public void setCourseName(String courseName) {
	CourseName = courseName;
}

public void setFee(double fee) {
	this.fee = fee;
}

public void setAoc(int aoc) {
	this.aoc = aoc;
}

public void setProf(String prof) {
	this.prof = prof;
}


}
