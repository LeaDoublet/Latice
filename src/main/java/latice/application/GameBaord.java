package latice.application;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class GameBaord extends Application{
	
	@Override
	public void start(Stage primaryStage) throws Exception{
		Parent page = FXMLLoader.load(getClass().getResource("GameBaord.fxml"));
		Scene scene = new Scene(page);
		primaryStage.setScene(scene);
		primaryStage.show();

	}
	public Boolean caseIsEmpty(){
		return true;
	}
	
	public static void main(String[] args) {
		 launch(args);
	}

}
