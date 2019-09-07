/* This Child class will have the following
 * 1) Will extend from the parent Class with all the methods
 * 2) Domestic Students will have a discounted rate at which the courses are charged
 */
public class DomesticStudent extends Student {

double discountRate;

DomesticStudent(String name) {
		super(name);
	}

public String getName() {
	return name;
}

public double getCourseGrade(Course c) {
	return super.getCourseGrade(c);
}

public void setName(String name) {
	this.name = name;
}

public void setCourseGrade(double CourseGrade, Course c) {
	 c.CourseGrade = CourseGrade;
}



public double getDiscountRate() {
	return discountRate;
}

public void setDiscountRate(double discountRate) {
	this.discountRate = discountRate;
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
 return discountRate * super.getTuition();
}

double getGPA() {
return super.getGPA();
}

public int getPersonid() {
	return personid;
}

public void setPersonid(int personid) {
	this.personid = personid;
}

}
	

