/* 
 * This class will extend from the Parent class "Student"
 * 
 */
public class InternationalStudent extends Student {

// Initialize the variables for the class
double PreniumRate; // The rate that affects International Students tuition

// Constructor for International Students (For details of Constructor Refer to Student Class)
InternationalStudent(String name) {
		super(name);
	}

// Accessor Method that returns the name of the student
public String getName() {
	return name;
}

// Accessor Method to return the students grade in the course (For details of how grade is found refer to Student Class)
public double getCourseGrade(Course c) {
	return super.getCourseGrade(c);
}

// Mutator Method to change the name of the Student
public void setName(String name) {
	this.name = name;
}

// Mutator Method to change the course grade of the student
public void setCourseGrade(double CourseGrade, Course c) {
	 c.CourseGrade = CourseGrade;
}

// Accessor Method that returns the students Premium Rate
public double getPremiumRate() {
	return PreniumRate;
}

// Mutator Method that changes the premium rate of the student
public void setPreniumRate(double PreniumRate) {
	this.PreniumRate = PreniumRate;
}

//Mutator Method to add a course for a student
void addCourse(Course c) throws CourseCapacityReached { // In case of a student trying to add over the course limit, an exception will be thrown that wont allow the student to do so
if(noc == 12) {											// The limit is 12
	throw new CourseCapacityReached("Maximum Allowed Courses has already been reached"); // Student will receive this message
}
else { 
Course cc = new Course(c.getCourseName(), c.getFee(), c.getAoc(), c.getProf());  // If allowed to add course the course from the system will be duplicated so that the students grades can be unique
courses[noc] = cc;		// The course will then be stored into the student's array of courses
noc ++;					// Students Number of courses will increase
}
}

// Accessor Method that returns the Tuition of the student (Please refer to the Student Class for more details)
double getTuition() {
 return PreniumRate * super.getTuition(); // Once base tuition is found from the parent class it is multiplied by the premium rate and then returned
}

//Accessor Method that returns the GPA of the student ( Please refer to the Student Class for more details)
double getGPA() {
return super.getGPA();
}

// Accessor Method that returns the Students PersonId
public int getPersonid() {
	return personid;
}


}
	

