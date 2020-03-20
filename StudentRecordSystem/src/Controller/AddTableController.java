package Controller;

import java.net.URL;
import java.util.ResourceBundle;

import javax.swing.JOptionPane;

import Model.Course;
import Model.DomesticStudent;
import Model.InternationalStudent;
import Model.Student;
import Model.StudentManagmentDatabase;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.MenuButton;
import javafx.scene.control.TextField;

public class AddTableController implements Initializable {

	private static Course[] courses;

	@FXML
	public TextField name, courseName, grade, credits, prof, cost;

	@FXML
	public MenuButton menu, typeMenu;

	@FXML
	public Button saveButton, cancelButton;

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		courses = new Course[6];
	}

	// Students Course 1 Fields
	public void Course1(ActionEvent event) {
		try {
			String creditsHolder = credits.getText().replaceAll("[^0-9]", "");
			String gradeHolder = grade.getText().replaceAll("[^0-9]", "");
			String costHolder = cost.getText().replaceAll("[^0-9]", "");
			if (menu.getText().contentEquals("Course 1")) {
				if (!courseName.equals("") && !creditsHolder.equals("") && !prof.equals("") && !costHolder.equals("")
						&& !gradeHolder.equals("")) {
					courses[0] = new Course(courseName.getText(), Integer.parseInt(costHolder),
							Integer.parseInt(creditsHolder), prof.getText());
					courses[0].setCourseGrade(Integer.parseInt(gradeHolder));
				} else if (!courseName.equals("") && !creditsHolder.equals("") && !prof.equals("")
						&& !costHolder.equals("") && gradeHolder.equals("")) {
					courses[0] = new Course(courseName.getText(), Integer.parseInt(costHolder),
							Integer.parseInt(creditsHolder), prof.getText());
				}
			} else if (menu.getText().contentEquals("Course 2")) {
				if (!courseName.equals("") && !creditsHolder.equals("") && !prof.equals("") && !costHolder.equals("")
						&& !gradeHolder.equals("")) {
					courses[1] = new Course(courseName.getText(), Integer.parseInt(costHolder),
							Integer.parseInt(creditsHolder), prof.getText());
					courses[1].setCourseGrade(Integer.parseInt(gradeHolder));
				} else if (!courseName.equals("") && !creditsHolder.equals("") && !prof.equals("")
						&& !costHolder.equals("") && gradeHolder.equals("")) {
					courses[1] = new Course(courseName.getText(), Integer.parseInt(costHolder),
							Integer.parseInt(creditsHolder), prof.getText());
				}

			} else if (menu.getText().contentEquals("Course 3")) {
				if (!courseName.equals("") && !creditsHolder.equals("") && !prof.equals("") && !costHolder.equals("")
						&& !gradeHolder.equals("")) {
					courses[2] = new Course(courseName.getText(), Integer.parseInt(costHolder),
							Integer.parseInt(creditsHolder), prof.getText());
					courses[2].setCourseGrade(Integer.parseInt(gradeHolder));
				} else if (!courseName.equals("") && !creditsHolder.equals("") && !prof.equals("")
						&& !costHolder.equals("") && gradeHolder.equals("")) {
					courses[2] = new Course(courseName.getText(), Integer.parseInt(costHolder),
							Integer.parseInt(creditsHolder), prof.getText());
				}

			} else if (menu.getText().contentEquals("Course 4")) {
				if (!courseName.equals("") && !creditsHolder.equals("") && !prof.equals("") && !costHolder.equals("")
						&& !gradeHolder.equals("")) {
					courses[3] = new Course(courseName.getText(), Integer.parseInt(costHolder),
							Integer.parseInt(creditsHolder), prof.getText());
					courses[3].setCourseGrade(Integer.parseInt(gradeHolder));
				} else if (!courseName.equals("") && !creditsHolder.equals("") && !prof.equals("")
						&& !costHolder.equals("") && gradeHolder.equals("")) {
					courses[3] = new Course(courseName.getText(), Integer.parseInt(costHolder),
							Integer.parseInt(creditsHolder), prof.getText());
				}

			} else if (menu.getText().contentEquals("Course 5")) {
				if (!courseName.equals("") && !creditsHolder.equals("") && !prof.equals("") && !costHolder.equals("")
						&& !gradeHolder.equals("")) {
					courses[4] = new Course(courseName.getText(), Integer.parseInt(costHolder),
							Integer.parseInt(creditsHolder), prof.getText());
					courses[4].setCourseGrade(Integer.parseInt(gradeHolder));
				} else if (!courseName.equals("") && !creditsHolder.equals("") && !prof.equals("")
						&& !costHolder.equals("") && gradeHolder.equals("")) {
					courses[4] = new Course(courseName.getText(), Integer.parseInt(costHolder),
							Integer.parseInt(creditsHolder), prof.getText());
				}

			} else if (menu.getText().contentEquals("Course 6")) {
				if (!courseName.equals("") && !creditsHolder.equals("") && !prof.equals("") && !costHolder.equals("")
						&& !gradeHolder.equals("")) {
					courses[5] = new Course(courseName.getText(), Integer.parseInt(costHolder),
							Integer.parseInt(creditsHolder), prof.getText());
					courses[5].setCourseGrade(Integer.parseInt(gradeHolder));
				} else if (!courseName.equals("") && !creditsHolder.equals("") && !prof.equals("")
						&& !costHolder.equals("") && gradeHolder.equals("")) {
					courses[5] = new Course(courseName.getText(), Integer.parseInt(costHolder),
							Integer.parseInt(creditsHolder), prof.getText());
				}

			}
			menu.setText("Course 1");
			courseName.setText("");
			grade.setText("");
			credits.setText("");
			prof.setText("");
			cost.setText("");

			if (courses[0] != null) {
				courseName.setText(courses[0].getCourseName());
				grade.setText(courses[0].getCourseGrade() + "");
				credits.setText(courses[0].getAoc() + "");
				prof.setText(courses[0].getProf());
				cost.setText(courses[0].getFee() + "");
			}

		} catch (Exception e) {

		}
	}

	// Students Course 2 Fields
	public void Course2(ActionEvent event) {
		try {

			String creditsHolder = credits.getText().replaceAll("[^0-9]", "");
			String gradeHolder = grade.getText().replaceAll("[^0-9]", "");
			String costHolder = cost.getText().replaceAll("[^0-9]", "");

			if (menu.getText().contentEquals("Course 1")) {
				if (!courseName.equals("") && !creditsHolder.equals("") && !prof.equals("") && !costHolder.equals("")
						&& !gradeHolder.equals("")) {
					courses[0] = new Course(courseName.getText(), Integer.parseInt(costHolder),
							Integer.parseInt(creditsHolder), prof.getText());
					courses[0].setCourseGrade(Integer.parseInt(gradeHolder));
				} else if (!courseName.equals("") && !creditsHolder.equals("") && !prof.equals("")
						&& !costHolder.equals("") && gradeHolder.equals("")) {
					courses[0] = new Course(courseName.getText(), Integer.parseInt(costHolder),
							Integer.parseInt(creditsHolder), prof.getText());
				}
			} else if (menu.getText().contentEquals("Course 2")) {
				if (!courseName.equals("") && !creditsHolder.equals("") && !prof.equals("") && !costHolder.equals("")
						&& !gradeHolder.equals("")) {
					courses[1] = new Course(courseName.getText(), Integer.parseInt(costHolder),
							Integer.parseInt(creditsHolder), prof.getText());
					courses[1].setCourseGrade(Integer.parseInt(gradeHolder));
				} else if (!courseName.equals("") && !creditsHolder.equals("") && !prof.equals("")
						&& !costHolder.equals("") && gradeHolder.equals("")) {
					courses[1] = new Course(courseName.getText(), Integer.parseInt(costHolder),
							Integer.parseInt(creditsHolder), prof.getText());
				}

			} else if (menu.getText().contentEquals("Course 3")) {
				if (!courseName.equals("") && !creditsHolder.equals("") && !prof.equals("") && !costHolder.equals("")
						&& !gradeHolder.equals("")) {
					courses[2] = new Course(courseName.getText(), Integer.parseInt(costHolder),
							Integer.parseInt(creditsHolder), prof.getText());
					courses[2].setCourseGrade(Integer.parseInt(gradeHolder));
				} else if (!courseName.equals("") && !creditsHolder.equals("") && !prof.equals("")
						&& !costHolder.equals("") && gradeHolder.equals("")) {
					courses[2] = new Course(courseName.getText(), Integer.parseInt(costHolder),
							Integer.parseInt(creditsHolder), prof.getText());
				}

			} else if (menu.getText().contentEquals("Course 4")) {
				if (!courseName.equals("") && !creditsHolder.equals("") && !prof.equals("") && !costHolder.equals("")
						&& !gradeHolder.equals("")) {
					courses[3] = new Course(courseName.getText(), Integer.parseInt(costHolder),
							Integer.parseInt(creditsHolder), prof.getText());
					courses[3].setCourseGrade(Integer.parseInt(gradeHolder));
				} else if (!courseName.equals("") && !creditsHolder.equals("") && !prof.equals("")
						&& !costHolder.equals("") && gradeHolder.equals("")) {
					courses[3] = new Course(courseName.getText(), Integer.parseInt(costHolder),
							Integer.parseInt(creditsHolder), prof.getText());
				}

			} else if (menu.getText().contentEquals("Course 5")) {
				if (!courseName.equals("") && !creditsHolder.equals("") && !prof.equals("") && !costHolder.equals("")
						&& !gradeHolder.equals("")) {
					courses[4] = new Course(courseName.getText(), Integer.parseInt(costHolder),
							Integer.parseInt(creditsHolder), prof.getText());
					courses[4].setCourseGrade(Integer.parseInt(gradeHolder));
				} else if (!courseName.equals("") && !creditsHolder.equals("") && !prof.equals("")
						&& !costHolder.equals("") && gradeHolder.equals("")) {
					courses[4] = new Course(courseName.getText(), Integer.parseInt(costHolder),
							Integer.parseInt(creditsHolder), prof.getText());
				}

			} else if (menu.getText().contentEquals("Course 6")) {
				if (!courseName.equals("") && !creditsHolder.equals("") && !prof.equals("") && !costHolder.equals("")
						&& !gradeHolder.equals("")) {
					courses[5] = new Course(courseName.getText(), Integer.parseInt(costHolder),
							Integer.parseInt(creditsHolder), prof.getText());
					courses[5].setCourseGrade(Integer.parseInt(gradeHolder));
				} else if (!courseName.equals("") && !creditsHolder.equals("") && !prof.equals("")
						&& !costHolder.equals("") && gradeHolder.equals("")) {
					courses[5] = new Course(courseName.getText(), Integer.parseInt(costHolder),
							Integer.parseInt(creditsHolder), prof.getText());
				}

			}

			menu.setText("Course 2");
			courseName.setText("");
			grade.setText("");
			credits.setText("");
			prof.setText("");
			cost.setText("");

			if (courses[1] != null) {
				courseName.setText(courses[1].getCourseName());
				grade.setText(courses[1].getCourseGrade() + "");
				credits.setText(courses[1].getAoc() + "");
				prof.setText(courses[1].getProf());
				cost.setText(courses[1].getFee() + "");
			}

		} catch (Exception e) {

		}
	}

	// Students Course 3 Fields
	public void Course3(ActionEvent event) {
		try {
			String creditsHolder = credits.getText().replaceAll("[^0-9]", "");
			String gradeHolder = grade.getText().replaceAll("[^0-9]", "");
			String costHolder = cost.getText().replaceAll("[^0-9]", "");
			if (menu.getText().contentEquals("Course 1")) {
				if (!courseName.equals("") && !creditsHolder.equals("") && !prof.equals("") && !costHolder.equals("")
						&& !gradeHolder.equals("")) {
					courses[0] = new Course(courseName.getText(), Integer.parseInt(costHolder),
							Integer.parseInt(creditsHolder), prof.getText());
					courses[0].setCourseGrade(Integer.parseInt(gradeHolder));
				} else if (!courseName.equals("") && !creditsHolder.equals("") && !prof.equals("")
						&& !costHolder.equals("") && gradeHolder.equals("")) {
					courses[0] = new Course(courseName.getText(), Integer.parseInt(costHolder),
							Integer.parseInt(creditsHolder), prof.getText());
				}
			} else if (menu.getText().contentEquals("Course 2")) {
				if (!courseName.equals("") && !creditsHolder.equals("") && !prof.equals("") && !costHolder.equals("")
						&& !gradeHolder.equals("")) {
					courses[1] = new Course(courseName.getText(), Integer.parseInt(costHolder),
							Integer.parseInt(creditsHolder), prof.getText());
					courses[1].setCourseGrade(Integer.parseInt(gradeHolder));
				} else if (!courseName.equals("") && !creditsHolder.equals("") && !prof.equals("")
						&& !costHolder.equals("") && gradeHolder.equals("")) {
					courses[1] = new Course(courseName.getText(), Integer.parseInt(costHolder),
							Integer.parseInt(creditsHolder), prof.getText());
				}

			} else if (menu.getText().contentEquals("Course 3")) {
				if (!courseName.equals("") && !creditsHolder.equals("") && !prof.equals("") && !costHolder.equals("")
						&& !gradeHolder.equals("")) {
					courses[2] = new Course(courseName.getText(), Integer.parseInt(costHolder),
							Integer.parseInt(creditsHolder), prof.getText());
					courses[2].setCourseGrade(Integer.parseInt(gradeHolder));
				} else if (!courseName.equals("") && !creditsHolder.equals("") && !prof.equals("")
						&& !costHolder.equals("") && gradeHolder.equals("")) {
					courses[2] = new Course(courseName.getText(), Integer.parseInt(costHolder),
							Integer.parseInt(creditsHolder), prof.getText());
				}

			} else if (menu.getText().contentEquals("Course 4")) {
				if (!courseName.equals("") && !creditsHolder.equals("") && !prof.equals("") && !costHolder.equals("")
						&& !gradeHolder.equals("")) {
					courses[3] = new Course(courseName.getText(), Integer.parseInt(costHolder),
							Integer.parseInt(creditsHolder), prof.getText());
					courses[3].setCourseGrade(Integer.parseInt(gradeHolder));
				} else if (!courseName.equals("") && !creditsHolder.equals("") && !prof.equals("")
						&& !costHolder.equals("") && gradeHolder.equals("")) {
					courses[3] = new Course(courseName.getText(), Integer.parseInt(costHolder),
							Integer.parseInt(creditsHolder), prof.getText());
				}

			} else if (menu.getText().contentEquals("Course 5")) {
				if (!courseName.equals("") && !creditsHolder.equals("") && !prof.equals("") && !costHolder.equals("")
						&& !gradeHolder.equals("")) {
					courses[4] = new Course(courseName.getText(), Integer.parseInt(costHolder),
							Integer.parseInt(creditsHolder), prof.getText());
					courses[4].setCourseGrade(Integer.parseInt(gradeHolder));
				} else if (!courseName.equals("") && !creditsHolder.equals("") && !prof.equals("")
						&& !costHolder.equals("") && gradeHolder.equals("")) {
					courses[4] = new Course(courseName.getText(), Integer.parseInt(costHolder),
							Integer.parseInt(creditsHolder), prof.getText());
				}

			} else if (menu.getText().contentEquals("Course 6")) {
				if (!courseName.equals("") && !creditsHolder.equals("") && !prof.equals("") && !costHolder.equals("")
						&& !gradeHolder.equals("")) {
					courses[5] = new Course(courseName.getText(), Integer.parseInt(costHolder),
							Integer.parseInt(creditsHolder), prof.getText());
					courses[5].setCourseGrade(Integer.parseInt(gradeHolder));
				} else if (!courseName.equals("") && !creditsHolder.equals("") && !prof.equals("")
						&& !costHolder.equals("") && gradeHolder.equals("")) {
					courses[5] = new Course(courseName.getText(), Integer.parseInt(costHolder),
							Integer.parseInt(creditsHolder), prof.getText());
				}

			}
			menu.setText("Course 3");
			courseName.setText("");
			grade.setText("");
			credits.setText("");
			prof.setText("");
			cost.setText("");

			if (courses[2] != null) {
				courseName.setText(courses[2].getCourseName());
				grade.setText(courses[2].getCourseGrade() + "");
				credits.setText(courses[2].getAoc() + "");
				prof.setText(courses[2].getProf());
				cost.setText(courses[2].getFee() + "");
			}

		} catch (Exception e) {

		}
	}

	// Students Course 4 Fields
	public void Course4(ActionEvent event) {
		try {
			String creditsHolder = credits.getText().replaceAll("[^0-9]", "");
			String gradeHolder = grade.getText().replaceAll("[^0-9]", "");
			String costHolder = cost.getText().replaceAll("[^0-9]", "");
			if (menu.getText().contentEquals("Course 1")) {
				if (!courseName.equals("") && !creditsHolder.equals("") && !prof.equals("") && !costHolder.equals("")
						&& !gradeHolder.equals("")) {
					courses[0] = new Course(courseName.getText(), Integer.parseInt(costHolder),
							Integer.parseInt(creditsHolder), prof.getText());
					courses[0].setCourseGrade(Integer.parseInt(gradeHolder));
				} else if (!courseName.equals("") && !creditsHolder.equals("") && !prof.equals("")
						&& !costHolder.equals("") && gradeHolder.equals("")) {
					courses[0] = new Course(courseName.getText(), Integer.parseInt(costHolder),
							Integer.parseInt(creditsHolder), prof.getText());
				}
			} else if (menu.getText().contentEquals("Course 2")) {
				if (!courseName.equals("") && !creditsHolder.equals("") && !prof.equals("") && !costHolder.equals("")
						&& !gradeHolder.equals("")) {
					courses[1] = new Course(courseName.getText(), Integer.parseInt(costHolder),
							Integer.parseInt(creditsHolder), prof.getText());
					courses[1].setCourseGrade(Integer.parseInt(gradeHolder));
				} else if (!courseName.equals("") && !creditsHolder.equals("") && !prof.equals("")
						&& !costHolder.equals("") && gradeHolder.equals("")) {
					courses[1] = new Course(courseName.getText(), Integer.parseInt(costHolder),
							Integer.parseInt(creditsHolder), prof.getText());
				}

			} else if (menu.getText().contentEquals("Course 3")) {
				if (!courseName.equals("") && !creditsHolder.equals("") && !prof.equals("") && !costHolder.equals("")
						&& !gradeHolder.equals("")) {
					courses[2] = new Course(courseName.getText(), Integer.parseInt(costHolder),
							Integer.parseInt(creditsHolder), prof.getText());
					courses[2].setCourseGrade(Integer.parseInt(gradeHolder));
				} else if (!courseName.equals("") && !creditsHolder.equals("") && !prof.equals("")
						&& !costHolder.equals("") && gradeHolder.equals("")) {
					courses[2] = new Course(courseName.getText(), Integer.parseInt(costHolder),
							Integer.parseInt(creditsHolder), prof.getText());
				}

			} else if (menu.getText().contentEquals("Course 4")) {
				if (!courseName.equals("") && !creditsHolder.equals("") && !prof.equals("") && !costHolder.equals("")
						&& !gradeHolder.equals("")) {
					courses[3] = new Course(courseName.getText(), Integer.parseInt(costHolder),
							Integer.parseInt(creditsHolder), prof.getText());
					courses[3].setCourseGrade(Integer.parseInt(gradeHolder));
				} else if (!courseName.equals("") && !creditsHolder.equals("") && !prof.equals("")
						&& !costHolder.equals("") && gradeHolder.equals("")) {
					courses[3] = new Course(courseName.getText(), Integer.parseInt(costHolder),
							Integer.parseInt(creditsHolder), prof.getText());
				}

			} else if (menu.getText().contentEquals("Course 5")) {
				if (!courseName.equals("") && !creditsHolder.equals("") && !prof.equals("") && !costHolder.equals("")
						&& !gradeHolder.equals("")) {
					courses[4] = new Course(courseName.getText(), Integer.parseInt(costHolder),
							Integer.parseInt(creditsHolder), prof.getText());
					courses[4].setCourseGrade(Integer.parseInt(gradeHolder));
				} else if (!courseName.equals("") && !creditsHolder.equals("") && !prof.equals("")
						&& !costHolder.equals("") && gradeHolder.equals("")) {
					courses[4] = new Course(courseName.getText(), Integer.parseInt(costHolder),
							Integer.parseInt(creditsHolder), prof.getText());
				}

			} else if (menu.getText().contentEquals("Course 6")) {
				if (!courseName.equals("") && !creditsHolder.equals("") && !prof.equals("") && !costHolder.equals("")
						&& !gradeHolder.equals("")) {
					courses[5] = new Course(courseName.getText(), Integer.parseInt(costHolder),
							Integer.parseInt(creditsHolder), prof.getText());
					courses[5].setCourseGrade(Integer.parseInt(gradeHolder));
				} else if (!courseName.equals("") && !creditsHolder.equals("") && !prof.equals("")
						&& !costHolder.equals("") && gradeHolder.equals("")) {
					courses[5] = new Course(courseName.getText(), Integer.parseInt(costHolder),
							Integer.parseInt(creditsHolder), prof.getText());
				}

			}
			menu.setText("Course 4");
			courseName.setText("");
			grade.setText("");
			credits.setText("");
			prof.setText("");
			cost.setText("");

			if (courses[3] != null) {
				courseName.setText(courses[3].getCourseName());
				grade.setText(courses[3].getCourseGrade() + "");
				credits.setText(courses[3].getAoc() + "");
				prof.setText(courses[3].getProf());
				cost.setText(courses[3].getFee() + "");
			}

		} catch (Exception e) {

		}
	}

	// Students Course 5 Fields
	public void Course5(ActionEvent event) {
		try {
			String creditsHolder = credits.getText().replaceAll("[^0-9]", "");
			String gradeHolder = grade.getText().replaceAll("[^0-9]", "");
			String costHolder = cost.getText().replaceAll("[^0-9]", "");
			if (menu.getText().contentEquals("Course 1")) {
				if (!courseName.equals("") && !creditsHolder.equals("") && !prof.equals("") && !costHolder.equals("")
						&& !gradeHolder.equals("")) {
					courses[0] = new Course(courseName.getText(), Integer.parseInt(costHolder),
							Integer.parseInt(creditsHolder), prof.getText());
					courses[0].setCourseGrade(Integer.parseInt(gradeHolder));
				} else if (!courseName.equals("") && !creditsHolder.equals("") && !prof.equals("")
						&& !costHolder.equals("") && gradeHolder.equals("")) {
					courses[0] = new Course(courseName.getText(), Integer.parseInt(costHolder),
							Integer.parseInt(creditsHolder), prof.getText());
				}
			} else if (menu.getText().contentEquals("Course 2")) {
				if (!courseName.equals("") && !creditsHolder.equals("") && !prof.equals("") && !costHolder.equals("")
						&& !gradeHolder.equals("")) {
					courses[1] = new Course(courseName.getText(), Integer.parseInt(costHolder),
							Integer.parseInt(creditsHolder), prof.getText());
					courses[1].setCourseGrade(Integer.parseInt(gradeHolder));
				} else if (!courseName.equals("") && !creditsHolder.equals("") && !prof.equals("")
						&& !costHolder.equals("") && gradeHolder.equals("")) {
					courses[1] = new Course(courseName.getText(), Integer.parseInt(costHolder),
							Integer.parseInt(creditsHolder), prof.getText());
				}

			} else if (menu.getText().contentEquals("Course 3")) {
				if (!courseName.equals("") && !creditsHolder.equals("") && !prof.equals("") && !costHolder.equals("")
						&& !gradeHolder.equals("")) {
					courses[2] = new Course(courseName.getText(), Integer.parseInt(costHolder),
							Integer.parseInt(creditsHolder), prof.getText());
					courses[2].setCourseGrade(Integer.parseInt(gradeHolder));
				} else if (!courseName.equals("") && !creditsHolder.equals("") && !prof.equals("")
						&& !costHolder.equals("") && gradeHolder.equals("")) {
					courses[2] = new Course(courseName.getText(), Integer.parseInt(costHolder),
							Integer.parseInt(creditsHolder), prof.getText());
				}

			} else if (menu.getText().contentEquals("Course 4")) {
				if (!courseName.equals("") && !creditsHolder.equals("") && !prof.equals("") && !costHolder.equals("")
						&& !gradeHolder.equals("")) {
					courses[3] = new Course(courseName.getText(), Integer.parseInt(costHolder),
							Integer.parseInt(creditsHolder), prof.getText());
					courses[3].setCourseGrade(Integer.parseInt(gradeHolder));
				} else if (!courseName.equals("") && !creditsHolder.equals("") && !prof.equals("")
						&& !costHolder.equals("") && gradeHolder.equals("")) {
					courses[3] = new Course(courseName.getText(), Integer.parseInt(costHolder),
							Integer.parseInt(creditsHolder), prof.getText());
				}

			} else if (menu.getText().contentEquals("Course 5")) {
				if (!courseName.equals("") && !creditsHolder.equals("") && !prof.equals("") && !costHolder.equals("")
						&& !gradeHolder.equals("")) {
					courses[4] = new Course(courseName.getText(), Integer.parseInt(costHolder),
							Integer.parseInt(creditsHolder), prof.getText());
					courses[4].setCourseGrade(Integer.parseInt(gradeHolder));
				} else if (!courseName.equals("") && !creditsHolder.equals("") && !prof.equals("")
						&& !costHolder.equals("") && gradeHolder.equals("")) {
					courses[4] = new Course(courseName.getText(), Integer.parseInt(costHolder),
							Integer.parseInt(creditsHolder), prof.getText());
				}

			} else if (menu.getText().contentEquals("Course 6")) {
				if (!courseName.equals("") && !creditsHolder.equals("") && !prof.equals("") && !costHolder.equals("")
						&& !gradeHolder.equals("")) {
					courses[5] = new Course(courseName.getText(), Integer.parseInt(costHolder),
							Integer.parseInt(creditsHolder), prof.getText());
					courses[5].setCourseGrade(Integer.parseInt(gradeHolder));
				} else if (!courseName.equals("") && !creditsHolder.equals("") && !prof.equals("")
						&& !costHolder.equals("") && gradeHolder.equals("")) {
					courses[5] = new Course(courseName.getText(), Integer.parseInt(costHolder),
							Integer.parseInt(creditsHolder), prof.getText());
				}

			}
			menu.setText("Course 5");
			courseName.setText("");
			grade.setText("");
			credits.setText("");
			prof.setText("");
			cost.setText("");

			if (courses[4] != null) {
				courseName.setText(courses[4].getCourseName());
				grade.setText(courses[4].getCourseGrade() + "");
				credits.setText(courses[4].getAoc() + "");
				prof.setText(courses[4].getProf());
				cost.setText(courses[4].getFee() + "");
			}

		} catch (Exception e) {

		}
	}

	// Students Course 6 Fields
	public void Course6(ActionEvent event) {
		try {
			String creditsHolder = credits.getText().replaceAll("[^0-9]", "");
			String gradeHolder = grade.getText().replaceAll("[^0-9]", "");
			String costHolder = cost.getText().replaceAll("[^0-9]", "");
			if (menu.getText().contentEquals("Course 1")) {
				if (!courseName.equals("") && !creditsHolder.equals("") && !prof.equals("") && !costHolder.equals("")
						&& !gradeHolder.equals("")) {
					courses[0] = new Course(courseName.getText(), Integer.parseInt(costHolder),
							Integer.parseInt(creditsHolder), prof.getText());
					courses[0].setCourseGrade(Integer.parseInt(gradeHolder));
				} else if (!courseName.equals("") && !creditsHolder.equals("") && !prof.equals("")
						&& !costHolder.equals("") && gradeHolder.equals("")) {
					courses[0] = new Course(courseName.getText(), Integer.parseInt(costHolder),
							Integer.parseInt(creditsHolder), prof.getText());
				}
			} else if (menu.getText().contentEquals("Course 2")) {
				if (!courseName.equals("") && !creditsHolder.equals("") && !prof.equals("") && !costHolder.equals("")
						&& !gradeHolder.equals("")) {
					courses[1] = new Course(courseName.getText(), Integer.parseInt(costHolder),
							Integer.parseInt(creditsHolder), prof.getText());
					courses[1].setCourseGrade(Integer.parseInt(gradeHolder));
				} else if (!courseName.equals("") && !creditsHolder.equals("") && !prof.equals("")
						&& !costHolder.equals("") && gradeHolder.equals("")) {
					courses[1] = new Course(courseName.getText(), Integer.parseInt(costHolder),
							Integer.parseInt(creditsHolder), prof.getText());
				}

			} else if (menu.getText().contentEquals("Course 3")) {
				if (!courseName.equals("") && !creditsHolder.equals("") && !prof.equals("") && !costHolder.equals("")
						&& !gradeHolder.equals("")) {
					courses[2] = new Course(courseName.getText(), Integer.parseInt(costHolder),
							Integer.parseInt(creditsHolder), prof.getText());
					courses[2].setCourseGrade(Integer.parseInt(gradeHolder));
				} else if (!courseName.equals("") && !creditsHolder.equals("") && !prof.equals("")
						&& !costHolder.equals("") && gradeHolder.equals("")) {
					courses[2] = new Course(courseName.getText(), Integer.parseInt(costHolder),
							Integer.parseInt(creditsHolder), prof.getText());
				}

			} else if (menu.getText().contentEquals("Course 4")) {
				if (!courseName.equals("") && !creditsHolder.equals("") && !prof.equals("") && !costHolder.equals("")
						&& !gradeHolder.equals("")) {
					courses[3] = new Course(courseName.getText(), Integer.parseInt(costHolder),
							Integer.parseInt(creditsHolder), prof.getText());
					courses[3].setCourseGrade(Integer.parseInt(gradeHolder));
				} else if (!courseName.equals("") && !creditsHolder.equals("") && !prof.equals("")
						&& !costHolder.equals("") && gradeHolder.equals("")) {
					courses[3] = new Course(courseName.getText(), Integer.parseInt(costHolder),
							Integer.parseInt(creditsHolder), prof.getText());
				}

			} else if (menu.getText().contentEquals("Course 5")) {
				if (!courseName.equals("") && !creditsHolder.equals("") && !prof.equals("") && !costHolder.equals("")
						&& !gradeHolder.equals("")) {
					courses[4] = new Course(courseName.getText(), Integer.parseInt(costHolder),
							Integer.parseInt(creditsHolder), prof.getText());
					courses[4].setCourseGrade(Integer.parseInt(gradeHolder));
				} else if (!courseName.equals("") && !creditsHolder.equals("") && !prof.equals("")
						&& !costHolder.equals("") && gradeHolder.equals("")) {
					courses[4] = new Course(courseName.getText(), Integer.parseInt(costHolder),
							Integer.parseInt(creditsHolder), prof.getText());
				}

			} else if (menu.getText().contentEquals("Course 6")) {
				if (!courseName.equals("") && !creditsHolder.equals("") && !prof.equals("") && !costHolder.equals("")
						&& !gradeHolder.equals("")) {
					courses[5] = new Course(courseName.getText(), Integer.parseInt(costHolder),
							Integer.parseInt(creditsHolder), prof.getText());
					courses[5].setCourseGrade(Integer.parseInt(gradeHolder));
				} else if (!courseName.equals("") && !creditsHolder.equals("") && !prof.equals("")
						&& !costHolder.equals("") && gradeHolder.equals("")) {
					courses[5] = new Course(courseName.getText(), Integer.parseInt(costHolder),
							Integer.parseInt(creditsHolder), prof.getText());
				}

			}
			menu.setText("Course 6");
			courseName.setText("");
			grade.setText("");
			credits.setText("");
			prof.setText("");
			cost.setText("");

			if (courses[5] != null) {
				courseName.setText(courses[5].getCourseName());
				grade.setText(courses[5].getCourseGrade() + "");
				credits.setText(courses[5].getAoc() + "");
				prof.setText(courses[5].getProf());
				cost.setText(courses[5].getFee() + "");
			}

		} catch (Exception e) {

		}
	}

	// Student Type Change
	public void domStudent(ActionEvent event) {
		typeMenu.setText("Domestic Student");
	}

	// Student Type Change
	public void intStudent(ActionEvent event) {
		typeMenu.setText("International Student");
	}

	// Save Student Entry Into Database
	public void saveButton(ActionEvent event) {
		try {

			String creditsHolder = credits.getText().replaceAll("[^0-9]", "");
			String gradeHolder = grade.getText().replaceAll("[^0-9]", "");
			String costHolder = cost.getText().replaceAll("[^0-9]", "");
			if (menu.getText().contentEquals("Course 1")) {
				if (!courseName.equals("") && !creditsHolder.equals("") && !prof.equals("") && !costHolder.equals("")
						&& !gradeHolder.equals("")) {
					courses[0] = new Course(courseName.getText(), Integer.parseInt(costHolder),
							Integer.parseInt(creditsHolder), prof.getText());
					courses[0].setCourseGrade(Integer.parseInt(gradeHolder));
				} else if (!courseName.equals("") && !creditsHolder.equals("") && !prof.equals("")
						&& !costHolder.equals("") && gradeHolder.equals("")) {
					courses[0] = new Course(courseName.getText(), Integer.parseInt(costHolder),
							Integer.parseInt(creditsHolder), prof.getText());
				}
			} else if (menu.getText().contentEquals("Course 2")) {
				if (!courseName.equals("") && !creditsHolder.equals("") && !prof.equals("") && !costHolder.equals("")
						&& !gradeHolder.equals("")) {
					courses[1] = new Course(courseName.getText(), Integer.parseInt(costHolder),
							Integer.parseInt(creditsHolder), prof.getText());
					courses[1].setCourseGrade(Integer.parseInt(gradeHolder));
				} else if (!courseName.equals("") && !creditsHolder.equals("") && !prof.equals("")
						&& !costHolder.equals("") && gradeHolder.equals("")) {
					courses[1] = new Course(courseName.getText(), Integer.parseInt(costHolder),
							Integer.parseInt(creditsHolder), prof.getText());
				}

			} else if (menu.getText().contentEquals("Course 3")) {
				if (!courseName.equals("") && !creditsHolder.equals("") && !prof.equals("") && !costHolder.equals("")
						&& !gradeHolder.equals("")) {
					courses[2] = new Course(courseName.getText(), Integer.parseInt(costHolder),
							Integer.parseInt(creditsHolder), prof.getText());
					courses[2].setCourseGrade(Integer.parseInt(gradeHolder));
				} else if (!courseName.equals("") && !creditsHolder.equals("") && !prof.equals("")
						&& !costHolder.equals("") && gradeHolder.equals("")) {
					courses[2] = new Course(courseName.getText(), Integer.parseInt(costHolder),
							Integer.parseInt(creditsHolder), prof.getText());
				}

			} else if (menu.getText().contentEquals("Course 4")) {
				if (!courseName.equals("") && !creditsHolder.equals("") && !prof.equals("") && !costHolder.equals("")
						&& !gradeHolder.equals("")) {
					courses[3] = new Course(courseName.getText(), Integer.parseInt(costHolder),
							Integer.parseInt(creditsHolder), prof.getText());
					courses[3].setCourseGrade(Integer.parseInt(gradeHolder));
				} else if (!courseName.equals("") && !creditsHolder.equals("") && !prof.equals("")
						&& !costHolder.equals("") && gradeHolder.equals("")) {
					courses[3] = new Course(courseName.getText(), Integer.parseInt(costHolder),
							Integer.parseInt(creditsHolder), prof.getText());
				}

			} else if (menu.getText().contentEquals("Course 5")) {
				if (!courseName.equals("") && !creditsHolder.equals("") && !prof.equals("") && !costHolder.equals("")
						&& !gradeHolder.equals("")) {
					courses[4] = new Course(courseName.getText(), Integer.parseInt(costHolder),
							Integer.parseInt(creditsHolder), prof.getText());
					courses[4].setCourseGrade(Integer.parseInt(gradeHolder));
				} else if (!courseName.equals("") && !creditsHolder.equals("") && !prof.equals("")
						&& !costHolder.equals("") && gradeHolder.equals("")) {
					courses[4] = new Course(courseName.getText(), Integer.parseInt(costHolder),
							Integer.parseInt(creditsHolder), prof.getText());
				}

			} else if (menu.getText().contentEquals("Course 6")) {
				if (!courseName.equals("") && !creditsHolder.equals("") && !prof.equals("") && !costHolder.equals("")
						&& !gradeHolder.equals("")) {
					courses[5] = new Course(courseName.getText(), Integer.parseInt(costHolder),
							Integer.parseInt(creditsHolder), prof.getText());
					courses[5].setCourseGrade(Integer.parseInt(gradeHolder));
				} else if (!courseName.equals("") && !creditsHolder.equals("") && !prof.equals("")
						&& !costHolder.equals("") && gradeHolder.equals("")) {
					courses[5] = new Course(courseName.getText(), Integer.parseInt(costHolder),
							Integer.parseInt(creditsHolder), prof.getText());
				}

			}

			if (name.getText().contentEquals("") || typeMenu.getText().contentEquals("Type Of Student")) {
				throw new Exception();
			}
			if (typeMenu.getText().equals("International Student")) {
				Student s = new InternationalStudent(name.getText());
				StudentDatabaseApplicationController.record.addStudent(new Student(s));
				StudentDatabaseApplicationController.record.getStudentRecord()
						.get(StudentManagmentDatabase.counter % 11).setType("International");
				for (int i = 0; i < courses.length; i++) {
					if (courses[i] != null) {
						StudentDatabaseApplicationController.record.getStudentRecord()
								.get(StudentManagmentDatabase.counter % 11).addCourse(courses[i]);
						Course[] holder = StudentDatabaseApplicationController.record.getStudentRecord()
								.get(StudentManagmentDatabase.counter % 11).getCourses();
						holder[StudentDatabaseApplicationController.record.getStudentRecord()
								.get(StudentManagmentDatabase.counter % 11).getNoc() - 1].setAoc(courses[i].getAoc());
						holder[StudentDatabaseApplicationController.record.getStudentRecord()
								.get(StudentManagmentDatabase.counter % 11).getNoc() - 1].setFee(courses[i].getFee());
						holder[StudentDatabaseApplicationController.record.getStudentRecord()
								.get(StudentManagmentDatabase.counter % 11).getNoc() - 1]
										.setCourseGrade(courses[i].getCourseGrade());
						holder[StudentDatabaseApplicationController.record.getStudentRecord()
								.get(StudentManagmentDatabase.counter % 11).getNoc() - 1].setProf(courses[i].getProf());
					}
				}
			} else if (typeMenu.getText().equals("Domestic Student")) {
				Student s = new DomesticStudent(name.getText());
				StudentDatabaseApplicationController.record.addStudent(new Student(s));
				StudentDatabaseApplicationController.record.getStudentRecord()
						.get(StudentManagmentDatabase.counter % 11).setType("Domestic");
				for (int i = 0; i < courses.length; i++) {
					if (courses[i] != null) {
						StudentDatabaseApplicationController.record.getStudentRecord()
								.get(StudentManagmentDatabase.counter % 11).addCourse(courses[i]);
						Course[] holder = StudentDatabaseApplicationController.record.getStudentRecord()
								.get(StudentManagmentDatabase.counter % 11).getCourses();
						holder[StudentDatabaseApplicationController.record.getStudentRecord()
								.get(StudentManagmentDatabase.counter % 11).getNoc() - 1].setAoc(courses[i].getAoc());
						holder[StudentDatabaseApplicationController.record.getStudentRecord()
								.get(StudentManagmentDatabase.counter % 11).getNoc() - 1].setFee(courses[i].getFee());
						holder[StudentDatabaseApplicationController.record.getStudentRecord()
								.get(StudentManagmentDatabase.counter % 11).getNoc() - 1]
										.setCourseGrade(courses[i].getCourseGrade());
						holder[StudentDatabaseApplicationController.record.getStudentRecord()
								.get(StudentManagmentDatabase.counter % 11).getNoc() - 1].setProf(courses[i].getProf());
					}
				}
			}
			JOptionPane.showMessageDialog(null, "Student Added!");
			((Node) event.getSource()).getScene().getWindow().hide();

		} catch (Exception e) {
			Alert alert = new Alert(AlertType.INFORMATION);
			alert.setContentText("Invalid Entry");
			alert.showAndWait();
		}
	}

	// Cancel Student Entry
	public void cancelButton(ActionEvent event) {
		((Node) event.getSource()).getScene().getWindow().hide();
	}

}
