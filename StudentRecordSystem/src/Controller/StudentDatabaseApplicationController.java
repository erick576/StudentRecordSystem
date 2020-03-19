package Controller;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class StudentDatabaseApplicationController implements Initializable {

	@FXML
	public Button addStudentButton, exportButton, viewStudentsButton;

	@FXML
	public ImageView image;

	public StudentDatabaseApplicationController() {
	}

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		Image imageHolder = new Image("/img/picture.png");
		image.setImage(imageHolder);
		image.setCache(true);
	}

	public void addStudentButton(ActionEvent event) {
	}

	public void exportButton(ActionEvent event) {

	}

	public void viewStudentsButton(ActionEvent event) {

	}
}
