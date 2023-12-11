package latice.application;

import java.nio.file.Paths;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class MenuPrincipal extends Application {
	
	@Override
	public void start(Stage primaryStage) throws Exception{
		Parent page = FXMLLoader.load(Paths.get("src/main/java/latice/application/MenuPrincipal.fxml").toUri().toURL());
		Scene scene = new Scene(page);
		primaryStage.setScene(scene);
		primaryStage.show();

	}

	public static void main(String[] args) {
		 launch(args);
	}
}
