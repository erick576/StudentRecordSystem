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
import javafx.scene.control.TableColumn.CellEditEvent;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.control.cell.TextFieldTableCell;
import javafx.util.converter.DoubleStringConverter;
import javafx.util.converter.IntegerStringConverter;

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
	public TableColumn<Student, Double> tuitionColumn;

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		nameColumn.setCellValueFactory(new PropertyValueFactory<Student, String>("Name"));
		idColumn.setCellValueFactory(new PropertyValueFactory<Student, Integer>("Personid"));
		typeColumn.setCellValueFactory(new PropertyValueFactory<Student, String>("Type"));
		gpaColumn.setCellValueFactory(new PropertyValueFactory<Student, Double>("Gpa"));
		creditsColumn.setCellValueFactory(new PropertyValueFactory<Student, Integer>("Credit"));
		tuitionColumn.setCellValueFactory(new PropertyValueFactory<Student, Double>("Tuitions"));
		table.setItems(getPeople());
		table.setEditable(true);
		nameColumn.setCellFactory(TextFieldTableCell.forTableColumn());
		typeColumn.setCellFactory(TextFieldTableCell.forTableColumn());
		creditsColumn.setCellFactory(TextFieldTableCell.forTableColumn(new IntegerStringConverter()));
		gpaColumn.setCellFactory(TextFieldTableCell.forTableColumn(new DoubleStringConverter()));
		tuitionColumn.setCellFactory(TextFieldTableCell.forTableColumn(new DoubleStringConverter()));

	}

	private ObservableList<Student> getPeople() {
		ObservableList<Student> student = FXCollections.observableArrayList();
		for (int i = 1; i <= StudentManagmentDatabase.counter; i++) {
			student.add(new Student(StudentDatabaseApplicationController.record.getStudentRecord().get(i).getPersonid(),
					StudentDatabaseApplicationController.record.getStudentRecord().get(i % 11).getName(),
					StudentDatabaseApplicationController.record.getStudentRecord().get(i % 11).getType(),
					StudentDatabaseApplicationController.record.getStudentRecord().get(i % 11).getGPA(),
					StudentDatabaseApplicationController.record.getStudentRecord().get(i % 11).getCredits(),
					(int) StudentDatabaseApplicationController.record.getStudentRecord().get(i % 11).getTuition()));
		}
		return student;
	}

	public void changeNameColumnCellEvent(CellEditEvent<Student, String> editedCell) {
		Student studentSelected = table.getSelectionModel().getSelectedItem();
		studentSelected.setName(editedCell.getNewValue().toString());
		StudentDatabaseApplicationController.record.getStudentRecord().get(studentSelected.getPersonid())
				.setName(editedCell.getNewValue().toString());
		System.out.println(editedCell.getNewValue().toString());
	}

	public void changeTypeColumnCellEvent(CellEditEvent<Student, String> editedCell) {
		Student studentSelected = table.getSelectionModel().getSelectedItem();
		if (editedCell.getNewValue().toString().contentEquals("International")
				|| editedCell.getNewValue().toString().contentEquals("Domestic")) {
			studentSelected.setType(editedCell.getNewValue().toString());
			StudentDatabaseApplicationController.record.getStudentRecord().get(studentSelected.getPersonid())
					.setType(editedCell.getNewValue().toString());
		}
	}

	public void changeGpaColumnCellEvent(CellEditEvent<Student, Double> editedCell) {
		Student studentSelected = table.getSelectionModel().getSelectedItem();
		String s = editedCell.getNewValue().toString().replaceAll("[^0-9]", "");
		studentSelected.gpa = (Double.parseDouble(s));
		StudentDatabaseApplicationController.record.getStudentRecord().get(studentSelected.getPersonid()).gpa = (Double
				.parseDouble(s));
	}

	public void changeCreditsColumnCellEvent(CellEditEvent<Student, Integer> editedCell) {
		Student studentSelected = table.getSelectionModel().getSelectedItem();
		studentSelected.credits = Integer.parseInt(editedCell.getNewValue().toString());
		StudentDatabaseApplicationController.record.getStudentRecord()
				.get(studentSelected.getPersonid()).credits = Integer.parseInt(editedCell.getNewValue().toString());
	}

	public void changeTuitionColumnCellEvent(CellEditEvent<Student, Double> editedCell) {
		Student studentSelected = table.getSelectionModel().getSelectedItem();
		studentSelected.tuition = Double.parseDouble(editedCell.getNewValue().toString());
		StudentDatabaseApplicationController.record.getStudentRecord()
				.get(studentSelected.getPersonid()).tuition = Double.parseDouble(editedCell.getNewValue().toString());
	}
}
