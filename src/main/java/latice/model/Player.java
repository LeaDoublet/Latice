package latice.model;

import java.util.List;

public class Player {
	int point =0;
	String name;
	Rack rack;
	PackPlayer packPlayer;
	
	public Player(int point, String name,PackPlayer packPlayer, Rack rack ) {
		this.point = point;
		this.name = name;
		this.packPlayer = packPlayer;
		this.rack = rack;
	}

	public void playOneRound() {
		
	}
	
	public void passMyTurn(Player currentPlayer) {
		
	}
	
	public void moreMouvement() {
		
	}
	public List<Tile> changeRack(List<Tile> ancienrack, List<Tile> packplayer) {
		
		//Mettre ancien rack dans pioche du joueur
		for(Tile tile : ancienrack) {
			packplayer.add(tile);
		}
		Rack rack= new Rack();
		
		
		List<Tile> res = rack.create_user_Rack(packplayer);
		return res;
	}
}
