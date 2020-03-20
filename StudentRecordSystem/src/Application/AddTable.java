package Application;

import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class AddTable extends Application {

	private AnchorPane mainLayout;
	public static Stage primaryStage;
	private FXMLLoader loader;

	@Override
	public void start(Stage primaryStage) throws IOException {
		AddTable.primaryStage = primaryStage;
		AddTableView();
		Scene scene = new Scene(this.mainLayout);
		AddTable.primaryStage.setScene(scene);
		AddTable.primaryStage.show();
	}

	private void AddTableView() throws IOException {

		this.loader = new FXMLLoader();
		loader.setLocation(getClass().getResource("/View/AddTableView.fxml"));
		this.mainLayout = (AnchorPane) loader.load();
	}

	public static void main(String[] args) {
		launch(args);
	}

}