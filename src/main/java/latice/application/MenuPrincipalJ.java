package latice.application;

import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundImage;
import javafx.scene.layout.BackgroundPosition;
import javafx.scene.layout.BackgroundRepeat;
import javafx.scene.layout.BackgroundSize;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public  class MenuPrincipalJ extends Application{
		@Override
		public void start(Stage primaryStage) throws Exception {
			
			Button btnJouer = new Button();
			
			Parent root = FXMLLoader.load(getClass().getResource("MenuPrincipal.fxml"));
			//root.addEventFilter(MouseEvent.MOUSE_PRESSED, new ButtonController(btnJouer));
			Scene scene = new Scene(root);
			
			primaryStage.setTitle("Latice");
			primaryStage.setScene(scene);
			primaryStage.show();
				
			}
		public static void main(String[] args) {
			 launch(args);
		}
}
