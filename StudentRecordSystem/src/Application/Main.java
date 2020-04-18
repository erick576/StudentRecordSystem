package Application;

import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class Main extends Application {

	private AnchorPane mainLayout;
	public static Stage primaryStage;
	private FXMLLoader loader;

	@Override
	public void start(Stage primaryStage) throws IOException {
		Main.primaryStage = primaryStage;
		VennDiagramWindowView();
		Scene scene = new Scene(this.mainLayout);
		scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
		Main.primaryStage.setScene(scene);
		Main.primaryStage.show();
		Main.primaryStage.setResizable(false);
		primaryStage.sizeToScene();
	}

	private void VennDiagramWindowView() throws IOException {

		this.loader = new FXMLLoader();
		loader.setLocation(getClass().getResource("/View/StudentDatabaseApplicationView.fxml"));
		this.mainLayout = (AnchorPane) loader.load();
	}

	public static void main(String[] args) {
		launch(args);
	}

}
