package Controller;

import java.net.URL;
import java.util.ResourceBundle;

import Model.Student;
import Model.StudentManagmentDatabase;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

public class TableController implements Initializable {

	@FXML
	public TableView<Student> table;

	@FXML
	public TableColumn<Student, String> nameColumn;
	
	@FXML
	public TableColumn<Student, String> typeColumn;

	@FXML
	public TableColumn<Student, Double> gpaColumn;

	@FXML
	public TableColumn<Student, Integer> idColumn;
	
	@FXML
	public TableColumn<Student, Integer> creditsColumn;
	
	@FXML
	public TableColumn<Student, Integer> tuitionColumn;
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		nameColumn.setCellValueFactory(new PropertyValueFactory<Student, String>("Name"));
		idColumn.setCellValueFactory(new PropertyValueFactory<Student, Integer>("Personid"));
		typeColumn.setCellValueFactory(new PropertyValueFactory<Student, String>("Type"));
		gpaColumn.setCellValueFactory(new PropertyValueFactory<Student, Double>("GPA"));
		creditsColumn.setCellValueFactory(new PropertyValueFactory<Student, Integer>("Credits"));
		tuitionColumn.setCellValueFactory(new PropertyValueFactory<Student, Integer>("Tuition"));
		table.setItems(getPeople());
	}

	private ObservableList<Student> getPeople() {
		ObservableList<Student> student = FXCollections.observableArrayList();
		for (int i = 1; i <= StudentManagmentDatabase.counter; i++) {
			System.out.println(StudentDatabaseApplicationController.record.getStudentRecord().get(i).getGPA());
			student.add(new Student(StudentDatabaseApplicationController.record.getStudentRecord().get(i).getPersonid(),
					StudentDatabaseApplicationController.record.getStudentRecord().get(i).getName(),
					StudentDatabaseApplicationController.record.getStudentRecord().get(i).getType(),
					StudentDatabaseApplicationController.record.getStudentRecord().get(i).getGPA(),
					StudentDatabaseApplicationController.record.getStudentRecord().get(i).getCredits(),
					(int) StudentDatabaseApplicationController.record.getStudentRecord().get(i).getTuition()));
		}
		return student;
	}
}
