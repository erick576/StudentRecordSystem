/*
 * This will be the parent class that the other types of students will be based off of
 */
public class Student {

// Initialize the variables for the class	
String name; // Name of the student
Course[] courses; // Array that stores the courses that the student is taking
int noc; // The number of courses for the student
double CourseGrade; // The Students Grade in the Course
public static int id; // The sum of all students constructed 
int personid; // The unique id given to each student


// Constructor for Student
Student(String name) {
this.name = name;
courses = new Course[12];	// Max courses students can add up to is 12
noc = 0;					// Student number of courses remains at 0 at the moment
id ++;  					// Total Number of students increases 
personid = id;				// Student is given unique id
}

// Accessor Method to get the name of the student
public String getName() {
	return name;
}

// Accessor Method to get the grade that the student currently has in the course
public double getCourseGrade(Course c) {
	double e = -1; 					// Initialize a variable to hold the default grade in case the student doesn't have a grade yet
	for(int i = 0; i < noc; i ++) {    // Run through all the students courses to find the course 
	if(courses[i] == c)	{
	e = courses[i].CourseGrade;      // If found assign the variable to the students grade stored
	}
	}
	return e;   			// Return the grade (IF THERE IS NO GRADE THE DEFAULT GRADE: -1 IS RETURNED)
	}


// Mutator Method that changes the name of the student
public void setName(String name) {
	this.name = name;
}

// Accessor Method to assign or change the grade of the student
public void setCourseGrade(Student s, double CourseGrade, String CourseName) {  // Need the student, grade and name of course to change the grade

	for(int i = 0; i < s.noc; i ++) { 							// Run through all the students courses to find the course to change the grade
		if(CourseName.equals(courses[i].getCourseName())) {
			courses[i].CourseGrade = CourseGrade;	               // If found the grade is then reassigned
		}
	}
}


// Mutator Method to add a course for a student
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

// Accessor Method to get the tuition of the student
double getTuition() { 
double tuition = 0.0; // Initialize a variable that will store the students tuition
for(int i = 0; i < noc; i ++) { // Runs through all of the students courses
	tuition += courses[i].getFee(); // Will add the fees of all of the students courses into the variable
}
return tuition; // Return the variable which now stores the students net tuition
}

// Accessor Method that returns the GPA of the student in a 9.0 scale
double getGPA() {
double gpa = 0.0; // Initialize a variable that will store the GPA of the student
int cwg = 0; // Initialize a variable that will store the courses the student is taking with grades
for(int i = 0; i < noc; i ++) {  // Run through all the courses that the Student has
if(courses[i].CourseGrade != -1) { // Only add to the variable when the course has a grade associated to it (-1 means it doesn't have a grade)
gpa += courses[i].CourseGrade;  // add the grade to the GPA
cwg ++; // Add to the courses with grades
}
}
return gpa / cwg; // Returns the total of the grades by the courses the student has with grades 
}

// Accesor Method that returns the PersonId of the student
public int getPersonid() {
	return personid;
}

}
