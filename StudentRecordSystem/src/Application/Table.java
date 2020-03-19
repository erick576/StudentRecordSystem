package Application;

import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class Table extends Application {

	private AnchorPane mainLayout;
	public static Stage primaryStage;
	private FXMLLoader loader;

	@Override
	public void start(Stage primaryStage) throws IOException {
		Table.primaryStage = primaryStage;
		TableView();
		Scene scene = new Scene(this.mainLayout);
		Table.primaryStage.setScene(scene);
		Table.primaryStage.show();
	}

	private void TableView() throws IOException {

		this.loader = new FXMLLoader();
		loader.setLocation(getClass().getResource("/View/TableView.fxml"));
		this.mainLayout = (AnchorPane) loader.load();
	}

	public static void main(String[] args) {
		launch(args);
	}

}