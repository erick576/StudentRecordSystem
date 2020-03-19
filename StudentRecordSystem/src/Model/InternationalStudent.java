package Model;

/* 
 * This class will extend from the Parent class "Student"
 * 
 */
public class InternationalStudent extends Student {

// Initialize the variables for the class
	double PreniumRate; // The rate that affects International Students tuition

// Constructor for International Students (For details of Constructor Refer to Student Class)
	public InternationalStudent(String name) {
		super(name);
	}

// Copy Constructor
	InternationalStudent(InternationalStudent other) {
		super(other);
	}

// Method that returns the students Premium Rate
	public double getPremiumRate() {
		return PreniumRate;
	}

// Method that changes the premium rate of the student
	public void setPreniumRate(double PreniumRate) {
		this.PreniumRate = PreniumRate;
	}

// Method that returns the Tuition of the student (Please refer to the Student Class for more details)
	@Override
	public double getTuition() {
		return PreniumRate * super.getTuition(); // Once base tuition is found from the parent class it is multiplied by the premium rate and then returned
													 
	}

}
