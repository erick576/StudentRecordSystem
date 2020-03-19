package Model;
/* 
 * This class will extend from the Parent class "Student"
 * 
 */
public class DomesticStudent extends Student {

// Initialize the variables for the class
	double discountRate; // The rate that affects Domestic Students tuition

//Constructor for Domestic Students (For details of Constructor Refer to Student Class)
	public DomesticStudent(String name) {
		super(name);
	}

// Copy Constructor
	DomesticStudent(DomesticStudent other) {
		super(other);
	}

// Method that returns the students Discount Rate
	public double getDiscountRate() {
		return discountRate;
	}

// Method that changes the discount rate of the student
	public void setDiscountRate(double discountRate) {
		this.discountRate = discountRate;
	}

// Method that returns the Tuition of the student (Please refer to the Student Class for more details)
	@Override
	public double getTuition() {
		return discountRate * super.getTuition(); // Once base tuition is found from the parent class it is multiplied by the discount rate and then returned
													
	}


}
