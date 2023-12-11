package latice.model;

import java.util.ArrayList;
import java.util.List;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.ListView;

public class Rack extends Bigpackaxe{
    
	public static List<Tile> create_user_Rack(List<Tile> list) {
		List<Tile> userRack = new ArrayList<>();
		//genere un nombre aleatoire entre 0 et 30 pour tirer au sort une tuile dans la pioche comme demandé
		// Math.random() generates random number from 0.0 to 0.999
        // Hence, Math.random()*5 will be from 0.0 to 4.999
        double doubleRandomNumber = Math.random() * 31;
        // cast the double to whole number
        int randomNumber = (int)doubleRandomNumber;
	
        int j=0;
		for(int i=0;i<5;i++) {
			
			userRack.add(list.get(randomNumber));
			Tile lien = list.get(randomNumber);
			list.remove(lien);
		
		}
		return userRack;
	}
	public static void show_Rack(List<Tile> list){
		ObservableList<Tile> observelist = FXCollections.observableList(list);
		final ListView<Tile> liste = new ListView<Tile>();
		liste.setItems(observelist);
	}
	
}