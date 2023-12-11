package latice.application.console;

import latice.model.Position;
import latice.model.Tile;

public interface IGameBoard {

	boolean isTileAt(Position position);
	public boolean isEmpty();
	public boolean put(Position position, Tile tile);
	public void clear();
	public int howManyTilesOnBoard();
	public Tile tileAt(Position position);
	public Tile removeTileAt(Position position);
	public String toAscii();	
	
	public Object tile();

}
