package Controller;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileFilter;
import javax.swing.filechooser.FileNameExtensionFilter;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import Model.StudentManagmentDatabase;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

public class StudentDatabaseApplicationController implements Initializable {

	@FXML
	public Button addStudentButton, exportButton, viewStudentsButton;

	@FXML
	public ImageView image;

	public static StudentManagmentDatabase record;
	public static String fileDictName = "";

	public StudentDatabaseApplicationController() {
	}

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		Image imageHolder = new Image("/img/picture.png");
		image.setImage(imageHolder);
		image.setCache(true);
		record = new StudentManagmentDatabase();
	}

	// Add Student Button Function
	public void addStudentButton(ActionEvent event) {
		try {
			FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/View/AddTableView.fxml"));
			Parent part = (Parent) fxmlLoader.load();
			Stage stage = new Stage();
			Scene scene = new Scene(part);
			stage.setScene(scene);
			stage.show();
			stage.setResizable(false);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	// Export Student Data Function
	public void exportButton(ActionEvent event) throws InvalidFileException, FileNotFoundException {
		try {
			JFileChooser fileChooser = new JFileChooser();
			fileChooser.setDialogTitle("Save the file");
			FileFilter filter = new FileNameExtensionFilter("Files", ".xlsx");
			fileChooser.setAcceptAllFileFilterUsed(false);
			fileChooser.addChoosableFileFilter(filter);
			fileChooser.setSelectedFile(new File(fileDictName));
			fileChooser.setVisible(true);
			JFileChooser jfc = new JFileChooser();
			final JFrame frame = new JFrame();
			int res = jfc.showSaveDialog(frame);
			File file = jfc.getSelectedFile();
			if (res != JFileChooser.APPROVE_OPTION) {
				return;
			}

			if (!file.getName().subSequence(file.getName().length() - 5, file.getName().length()).equals(".xlsx")) {
				throw new InvalidFileException("");
			}

			Workbook workbook = new XSSFWorkbook();
			ArrayList<String> titles = new ArrayList<>();
			titles.add("Name");
			titles.add("GPA");
			titles.add("Tuition");
			titles.add("Credits");
			titles.add("ID");
			titles.add("Course 1");
			titles.add("Course 2");
			titles.add("Course 3");
			titles.add("Course 4");
			titles.add("Course 5");
			titles.add("Course 6");
			Sheet sheet = workbook.createSheet("Results");
			Row headerRow = sheet.createRow(0);
			for (int i = 0; i < 11; i++) {
				Cell cell = headerRow.createCell(i);
				cell.setCellValue(titles.get(i));
			}

			for (int i = 1; i <= StudentManagmentDatabase.counter; i++) {
				Row row = sheet.createRow(i);
				for (int j = 0; j < 11; j++) {
					if (j == 0) {
						row.createCell(j).setCellValue(record.getStudentRecord().get(i).getName());
					}
					if (j == 1) {
						row.createCell(j).setCellValue(Double.toString(record.getStudentRecord().get(i).getGPA()));
					}
					if (j == 2) {
						row.createCell(j).setCellValue(record.getStudentRecord().get(i).getTuition());
					}
					if (j == 3) {
						row.createCell(j).setCellValue(record.getStudentRecord().get(i).getCredits());
					}
					if (j == 4) {
						row.createCell(j).setCellValue(record.getStudentRecord().get(i).getPersonid());
					}
					if (j == 5) {
						row.createCell(j).setCellValue(record.getStudentRecord().get(i).getCourse1());
					}
					if (j == 6) {
						row.createCell(j).setCellValue(record.getStudentRecord().get(i).getCourse2());
					}
					if (j == 7) {
						row.createCell(j).setCellValue(record.getStudentRecord().get(i).getCourse3());
					}
					if (j == 8) {
						row.createCell(j).setCellValue(record.getStudentRecord().get(i).getCourse4());
					}
					if (j == 9) {
						row.createCell(j).setCellValue(record.getStudentRecord().get(i).getCourse5());
					}
					if (j == 10) {
						row.createCell(j).setCellValue(record.getStudentRecord().get(i).getCourse6());
					}
				}
			}

			FileOutputStream doc = new FileOutputStream(file.getPath());
			workbook.write(doc);
			doc.close();
			workbook.close();
			JOptionPane.showMessageDialog(null, "Saved!");

		} catch (InvalidFileException e) {
			JOptionPane.showMessageDialog(null, "Invalid File!");
		} catch (Exception e1) {
			JOptionPane.showMessageDialog(null, "No Entries!");
		}
	}

	// View Student Data Function
	public void viewStudentsButton(ActionEvent event) {
		try {
			FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/View/TableView.fxml"));
			Parent part = (Parent) fxmlLoader.load();
			Stage stage = new Stage();
			Scene scene = new Scene(part);
			stage.setScene(scene);
			stage.show();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
