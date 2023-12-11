package latice.model;

import java.util.ArrayList;
import java.util.List;

import latice.application.*;
import latice.application.console.GameBoardConsole;
import latice.model.*;
public class Referee {
	Player player_1;
	Player player_2;
	Player current_player;
	GameBoardConsole gameboard;
	public Referee(Player player_1, Player player_2, Player current_player, GameBoardConsole gameboard ) {
		this.player_1 = player_1;
		this.player_2 = player_2;
		this.current_player = current_player;
		this.gameboard=gameboard;
		
	}
	public void gamestart() {
		distributeEquipment(player_1, player_2);
		randomPlayerChoice(player_1, player_2);
		
	}
	
	public void distributeEquipment(Player player1, Player player2) {
		Bigpackaxe grosPack= new Bigpackaxe();
		PackPlayer packplayer1 = new PackPlayer();
		PackPlayer packplayer2 = new PackPlayer();
		player1.packPlayer=packplayer1;
		player2.packPlayer=packplayer2;
		player1.name="Pompom";
		player2.name="PanPan";
	}
	
	public Player randomPlayerChoice(Player player1, Player player2) {
		//L'idee cest de choisir un nombre aléatoirement soit un soit deux et en fonction du nombre joueur1 ou 2 commence la partie
		  double doubleRandomNumber = Math.random() * 3;
	        int randomNumber = (int)doubleRandomNumber;
	        if(randomNumber ==1)
	        	return player1;
	        else
	        	return player2;
	}
	
	public List<Tile> howManyNeightbours(final Tile tile) {
		List<Tile> tiles = new ArrayList<Tile>();
		
		Position top = new Position(tile.getPosition().row()+1,tile.getPosition().column());
		Position bottom = new Position(tile.getPosition().row()-1,tile.getPosition().column());
		Position left = new Position(tile.getPosition().row(),tile.getPosition().column()-1);
		Position right = new Position(tile.getPosition().row(),tile.getPosition().column()+1);
		
		if(gameboard.isTileAt(top)) {
			tiles.add(gameboard.tileAt(top));
		}
		if(gameboard.isTileAt(bottom)) {
			tiles.add(gameboard.tileAt(bottom));
		}
		if(gameboard.isTileAt(left)) {
			tiles.add(gameboard.tileAt(left));
		}
		if(gameboard.isTileAt(right)) {
			tiles.add(gameboard.tileAt(right));
		}
		return tiles;
	}
	public boolean compatibilityNeightbours(Tile tile,ArrayList neightbours ) {
		boolean res = false;
		for(int i=0; i<neightbours.size();i++) {
			if(tile.getSymbol()==((Tile) neightbours.get(i)).getSymbol()||tile.getColor()==((Tile)neightbours.get(i)).getColor())
				res= true;
			else res= false;
		}
		return res;
			
	}
	public GameBoardConsole getGameboard() {
		return this.gameboard;
	}
	}
	