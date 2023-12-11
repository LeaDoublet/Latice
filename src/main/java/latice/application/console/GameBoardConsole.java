package latice.application.console;

import java.util.ArrayList;
import java.util.List;

import latice.model.Position;
import latice.model.Tile;

public  class GameBoardConsole implements IGameBoard {

	Tile[][] tiles;

	public GameBoardConsole() {
		this.tiles = new Tile[Constants.ROWS][Constants.COLUMNS];
	}

	public Tile[][] tiles() {
		return tiles;
	}

	@Override
	public boolean isTileAt(Position position) {
		return (this.tiles[position.row()-1][position.column()-1] != Tile.NO);
	
	}

	@Override
	public boolean isEmpty() {
		 for (int i = 0; i< Constants.ROWS; i++)
	        {
	            for (int j = 0; j < Constants.COLUMNS; j++) {
	                if (tiles[i][j] != null) {
	                    return false;
	                }
	            }
	        }
	        return true;
	}

	@Override
	public boolean put(Position position, Tile tile) {
		if (!isTileAt(position)) {
			tiles[position.row()-1][position.column()-1] = tile;
			return true;
		}else {
			return false;
		}
	}

	@Override
	public void clear() {
		tiles = new Tile[Constants.ROWS][Constants.COLUMNS];
	}
	@Override
	public int howManyTilesOnBoard() {
		int nb = 0;
		for (int i = 0; i< Constants.ROWS; i++)
        {
            for (int j = 0; j < Constants.COLUMNS; j++) {
                if (tiles[i][j] != null) {
                    nb++;
                }
            }
        }
        return nb;
	}

	@Override
	public Tile tileAt(Position position) {
		if (isTileAt(position)){
			return tiles[position.row()-1][position.column()-1];
		} else {
			return null;
		}
	}

	@Override
	public Tile removeTileAt(Position position) {
		Tile tile;
		if (isTileAt(position)){
			tile = tiles[position.row()-1][position.column()-1];
			tiles[position.row()-1][position.column()-1] = Tile.NO;
			return tile;
		} else {
			return Tile.NO;
		}
	}

	@Override
	public String toAscii() {
		String asciitable = "";
		for (int i = 0; i< Constants.ROWS; i++){
            for (int j = 0; j < Constants.COLUMNS; j++) {
            	if ( tiles[i][j] !=null){
            		asciitable = asciitable + tiles[i][j].ascii();
            	}else {
            		asciitable = asciitable + " ";
            	}
            }
            asciitable = asciitable + "\n";
        }
		return asciitable;
	}

	@Override
	public Object tile() {
		return this.tile();
	}
	

}
	


