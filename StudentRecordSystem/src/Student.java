/*
 * This class is the parent class for classes (International Students and Domestic Students)
 * 1) Will have the constructor for the student(Student name) 
 * Will create an array to store courses.   
 * 2) Will have the add course method
 * 3) Will have a method to get the tuition for the student
 * 4) Will have a method to get the amount of credits and courses for the student 
 * 5) Will have a method to get the list of profs that the student has during the school year
 * 6) Will have a limit of credits that will throw an exception when over the allocated amount is reached (Limit : 12 courses Per year)
	IF THE COURSE DOSENT HAVE A GRADE FOR THE STUDENT THEN IT WILL RETURN A -1
 */

public class Student {

String name;
Course[] courses;
int noc;
double CourseGrade;
public static int id;
int personid;


Student(String name) {
this.name = name;
courses = new Course[12];	
noc = 0;
id ++;
personid = id;

}

public String getName() {
	return name;
}

public double getCourseGrade(Course c) {
	double e = -1;
	for(int i = 0; i < noc; i ++) {
	if(courses[i] == c)	{
	e = courses[i].CourseGrade;
	}
	}
	return e;
	}
	

public void setName(String name) {
	this.name = name;
}

public void setCourseGrade(Student s, double CourseGrade, String CourseName) {
for(int i = 0; i < s.noc; i ++) {
	if(CourseName.equals(courses[i].getCourseName())) {
	courses[i].CourseGrade = CourseGrade;	
	}
}
}

void addCourse(Course c) throws CourseCapacityReached {
if(noc == 12) {
	throw new CourseCapacityReached("Maximum Allowed Courses has already been reached");
}
else { 
Course cc = new Course(c.getCourseName(), c.getFee(), c.getAoc(), c.getProf());
courses[noc] = cc;
noc ++;
}
}

double getTuition() {
double tuition = 0.0;
for(int i = 0; i < noc; i ++) {
	tuition += courses[i].getFee();
}
return tuition;
}

double getGPA() {
double gpa = 0.0;
int cwg = 0;
for(int i = 0; i < noc; i ++) {
if(courses[i].CourseGrade != -1) {
gpa += courses[i].CourseGrade;
cwg ++;
}
}
return gpa / cwg;
}

public int getPersonid() {
	return personid;
}

public void setPersonid(int personid) {
	this.personid = personid;
}

}
