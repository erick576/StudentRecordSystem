import java.util.HashMap;
/*
 * This class will store all the student records using a hierarchical system based on grades as the first 
 * comparison then the number of credits and so forth
 * 
 * It will implement a hashmap in which the students data will be stored in  
 */
public class StudentManagmentDatabase {

static int counter;
int key;	
HashMap<Integer, Student> StudentRecord = new HashMap<Integer, Student>();

int hashCode(int personid) {
	
	return personid % 11;
}
	
StudentManagmentDatabase() {
StudentRecord = new HashMap<Integer, Student>();
}

void addStudent(Student s) {
int num = hashCode(s.getPersonid());
StudentRecord.put(num, s);
counter ++;
}

void addDomesticStudent(DomesticStudent dms) {
int num = hashCode(dms.getPersonid());
StudentRecord.put(num, dms);
counter ++;
}

void addInternationalStudent(InternationalStudent ins) {
int num = hashCode(ins.getPersonid());
StudentRecord.put(num, ins);
counter ++;
}

String findStudentFromKey(int personid) {
int i = hashCode(personid);
return StudentRecord.get(i).getName();

}

void removeStudent(Student s) {
StudentRecord.remove(s, hashCode(s.getPersonid()));	
counter --;
}

void removeDomesticStudent(DomesticStudent dms) {
StudentRecord.remove(dms, hashCode(dms.getPersonid()));		
counter --;
}

void removeInternationalStudent(InternationalStudent ins) {
StudentRecord.remove(ins, hashCode(ins.getPersonid()));	
counter --;
}

String getListOfStudents() {
String list = ""; 
for(int i = 1; i < counter + 1; i ++) {
list += i + ". " + findStudentFromKey(i) + "\n";
}	
return list;
}

}
