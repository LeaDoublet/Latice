package testsPractice;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import latice.application.console.GameBoardConsole;
import latice.model.Color;
import latice.model.Position;
import latice.model.Referee;
import latice.model.Symbol;
import latice.model.Tile;

public class RefereeTest {

	GameBoardConsole gameBoard = new GameBoardConsole();
	private static final Position TOP = new Position(1, 2);
	private static final Position BOTTOM = new Position(3, 2);
	private static final Position LEFT = new Position(2, 1);
	private static final Position RIGHT = new Position(2, 3);
	private static final Position CENTER = new Position(2, 2);
	
	private static final Tile YELLOW_BIRD = new Tile(Color.yellow, Symbol.bird,CENTER);
	private static final Tile MAGENTA_BIRD1 = new Tile(Color.magenta, Symbol.bird,RIGHT);
	private static final Tile YELLOW_TURTLE = new Tile(Color.yellow, Symbol.turtle,TOP);
	private static final Tile MAGENTA_BIRD = new Tile(Color.magenta, Symbol.bird,LEFT);
	private static final Tile MAGENTA_BIRD2 = new Tile(Color.magenta, Symbol.bird,BOTTOM);
	private static final Tile GREEN_DOLPHIN = new Tile(Color.green, Symbol.dolphin);
	

	
	Referee ref = new Referee(null, null, null, gameBoard);
	
	@BeforeEach
	public void cleanGameBoard() {
		gameBoard = new GameBoardConsole();
	}
	
	@Test
	void returnListOfNeightbours() {
		ref.getGameboard().put(TOP,YELLOW_TURTLE);
		ref.getGameboard().put(CENTER,YELLOW_BIRD);
		ref.getGameboard().put(RIGHT,MAGENTA_BIRD1);
		ref.getGameboard().put(LEFT,MAGENTA_BIRD);
		ref.getGameboard().put(BOTTOM,MAGENTA_BIRD2);
	
		List<Tile> tiles =ref.howManyNeightbours(YELLOW_BIRD);
		assertEquals(tiles.get(1),YELLOW_TURTLE);
		assertEquals(tiles.get(2),MAGENTA_BIRD1);
	}

	@Test
	void returnTrueWhenNeightboursAreCompatible() {
		//TODO
	}
	
	@Test
	void returnFalseWhenNeightboursAreNotCompatible() {
		//TODO
	}

}
