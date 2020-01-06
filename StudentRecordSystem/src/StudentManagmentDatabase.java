import java.util.HashMap;
/*
 * This class will store all of the students into a database where a list of them can be formed and details about them can be accessed using a key that will efficiently find them
 * Students references should not be exposed in the Database
 */
public class StudentManagmentDatabase {

// Initialize the variables for the class
static int counter; // This will keep track of the total number of students in the database
int key;	// This will be used for each student to locate them within the database
HashMap<Integer, Student> StudentRecord = new HashMap<Integer, Student>();  // This will be created in each database to efficiently store the students using a hash code to avoid running through every student in the database

// Accessor Method that will return the hash code for the student based on the students PersonId
int hashCode(int personid) {	
return personid % 11; 		// This is the equation that will be used for the hash code (Ideally the most optimal hashCode should be used to implement this)
}
	
// Constructor Method that will create a new database to store students
StudentManagmentDatabase() {
StudentRecord = new HashMap<Integer, Student>(); // The hash map will store students in a certain integer key based on the hash code
}

// Mutator Method that will add the student into the database
void addStudent(Student s) {
int num = hashCode(s.getPersonid()); // Creates a variable that will store the students hash code so it can be put in the specific number key in the hash map
StudentRecord.put(num, new Student(s)); // Puts the student into the hash Map based on the hash code
counter ++; // Total Number of students in the database increases
}

//Mutator Method that will add the domestic student into the database
void addDomesticStudent(DomesticStudent dms) {
int num = hashCode(dms.getPersonid()); // Creates a variable that will store the students hash code so it can be put in the specific number key in the hash map
StudentRecord.put(num, new DomesticStudent(dms)); // Puts the student into the hash Map based on the hash code
counter ++; // Total Number of students in the database increases
}

//Mutator Method that will add the international student into the database
void addInternationalStudent(InternationalStudent ins) {
int num = hashCode(ins.getPersonid()); // Creates a variable that will store the students hash code so it can be put in the specific number key in the hash map
StudentRecord.put(num, new InternationalStudent(ins)); // Puts the student into the hash Map based on the hash code
counter ++; // Total Number of students in the database increases
}

// Accessor Method that will return the students name based on their PersonId
String findStudentFromKey(int personid) {
int i = hashCode(personid);  // Create a variable that will store the hash code of the student so it can be looked up in the hash map
return StudentRecord.get(i).getName(); // Find the student object in the hash map based on the hash code and return it's name
}

// Mutator Method that removes a student from the database
void removeStudent(Student s) {
StudentRecord.remove(s, hashCode(s.getPersonid()));	 // Uses one of the built in methods of Hash map to remove the student from their specific hash code
counter --; // One less student in the total students in the database
}

//Mutator Method that removes a Domestic student from the database
void removeDomesticStudent(DomesticStudent dms) {
StudentRecord.remove(dms, hashCode(dms.getPersonid()));	// Uses one of the built in methods of Hash map to remove the student from their specific hash code
counter --; // One less student in the total students in the database
}

//Mutator Method that removes a International student from the database
void removeInternationalStudent(InternationalStudent ins) {
StudentRecord.remove(ins, hashCode(ins.getPersonid()));	// Uses one of the built in methods of Hash map to remove the student from their specific hash code
counter --; // One less student in the total students in the database
}

// Accessor Method that returns a list of all the students in the database
String getListOfStudents() {
String list = ""; // Create a variable that will store the list
for(int i = 1; i < counter + 1; i ++) { // Run through all the students in the database 
list += i + ". " + findStudentFromKey(i) + "\n"; // Add the student corresponding to their PersonId to the String Variable
}	
return list; // Return the variable which has the list of all the students in the database
}
}
