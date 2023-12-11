package testsPractice;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import latice.application.console.Constants;
import latice.application.console.GameBoardConsole;
import latice.model.Color;
import latice.model.Position;
import latice.model.Symbol;
import latice.model.Tile;
import static org.junit.jupiter.api.Assertions.*;

public class GameBoardtest {

	private static final Tile YELLOW_BIRD = new Tile(Color.yellow, Symbol.bird);
	private static final Tile MAGENTA_TURTLE = new Tile(Color.magenta, Symbol.turtle);
	
	private static final Position _2_4 = new Position(2, 4);
	private static final Position FIRST_POSITION = new Position(1, 1);
	private static final Position LAST_POSITION = new Position(Constants.ROWS, Constants.COLUMNS);
	GameBoardConsole gameBoard;
	
	@BeforeEach
	public void cleanGameBoard() {
		gameBoard = new GameBoardConsole();
	}
	
	@Test
	void returnFalseWhenPositionIsWithoutTile() {
		assertFalse(gameBoard.isTileAt(FIRST_POSITION));
		assertFalse(gameBoard.isTileAt(_2_4));
		assertFalse(gameBoard.isTileAt(LAST_POSITION));
	}
	@Test
	void the_gameBoard_is_empty_no_tile_at_the_beginning_of_game() {
		assertTrue(gameBoard.isEmpty());
	}
	@Test
	void return_true_when_a_tile_is_put_at_a_free_Position() {

		Position position = _2_4;

		assertFalse(gameBoard.isTileAt(position));
		boolean discWellPut = gameBoard.put(position, YELLOW_BIRD);
		assertTrue(discWellPut);
		assertFalse(gameBoard.isEmpty());
		assertTrue(gameBoard.isTileAt(position));

		assertFalse(gameBoard.isTileAt(position));
		
	}
	@Test
	void return_false_when_a_tile_can_not_put_because_the_position_is_occupied() {

		Position position = _2_4;

		gameBoard.put(position, YELLOW_BIRD);
		assertTrue(gameBoard.isTileAt(position));

		boolean discWellPut = gameBoard.put(position, MAGENTA_TURTLE);
		assertFalse(discWellPut);
		assertTrue(gameBoard.isTileAt(position));

	}
	@Test
	void the_gameBoard_is_empty_when_it_is_cleared() {

		gameBoard.put(_2_4, YELLOW_BIRD);
		gameBoard.put(FIRST_POSITION, MAGENTA_TURTLE);
		assertFalse(gameBoard.isEmpty());

		gameBoard.clear();
		assertTrue(gameBoard.isEmpty());

	}
	@Test
	void return_the_number_of_tiles_on_the_gameboard() {

		assertTrue(gameBoard.isEmpty());
		gameBoard.put(FIRST_POSITION, MAGENTA_TURTLE);
		gameBoard.put(_2_4, YELLOW_BIRD);
		gameBoard.put(LAST_POSITION, MAGENTA_TURTLE);
		assertFalse(gameBoard.isEmpty());

		int nbDiscs = gameBoard.howManyTilesOnBoard();
		assertEquals(3, nbDiscs);
		gameBoard.clear();
		nbDiscs = gameBoard.howManyTilesOnBoard();
		assertEquals(0, nbDiscs);

	}
	@Test
	void return_the_value_of_tile_at_position_when_the_position_has_a_tile() {

		gameBoard.put(_2_4, YELLOW_BIRD);
		assertFalse(gameBoard.isEmpty());
		Tile tile = gameBoard.tileAt(_2_4);
		assertEquals(YELLOW_BIRD, tile);
		assertFalse(gameBoard.isEmpty());

	}
	@Test
	void return_NO_as_value_of_disc_at_position_when_the_position_has_no_discs() {

		gameBoard.clear();
		assertTrue(gameBoard.isEmpty());
		Tile tile = gameBoard.tileAt(_2_4);
		assertEquals(Tile.NO, tile);

	}
	@Test
	void return_the_tile_removed_when_the_position_has_a_tile() {

		assertTrue(gameBoard.isEmpty());
		gameBoard.put(_2_4, YELLOW_BIRD);
		assertFalse(gameBoard.isEmpty());
		assertEquals(1, gameBoard.howManyTilesOnBoard());

		Tile tile = gameBoard.removeTileAt(_2_4);
		assertEquals(YELLOW_BIRD, tile);
		assertTrue(gameBoard.isEmpty());

	}
	@Test
	void return_NO_when_remove_a_position_where_no_tiles() {

		assertTrue(gameBoard.isEmpty());
		Tile tile = gameBoard.removeTileAt(_2_4);
		assertEquals(Tile.NO, tile);
		assertTrue(gameBoard.isEmpty());
	}
}
