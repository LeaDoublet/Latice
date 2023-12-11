package latice.model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Bigpackaxe{

	public static List<Tile> create_list_shuffle() {
		List<Tile> deckToShuffle = new ArrayList<>();
		deckToShuffle.add(new Tile(Color.magenta,Symbol.bird));
		deckToShuffle.add(new Tile(Color.magenta,Symbol.bird));
		deckToShuffle.add(new Tile(Color.red,Symbol.bird));
		deckToShuffle.add(new Tile(Color.red,Symbol.bird));
		deckToShuffle.add(new Tile(Color.blue,Symbol.bird));
		deckToShuffle.add(new Tile(Color.blue,Symbol.bird));
		deckToShuffle.add(new Tile(Color.cian,Symbol.bird));
		deckToShuffle.add(new Tile(Color.cian,Symbol.bird));
		deckToShuffle.add(new Tile(Color.yellow,Symbol.bird));
		deckToShuffle.add(new Tile(Color.yellow,Symbol.bird));
		deckToShuffle.add(new Tile(Color.green,Symbol.bird));
		deckToShuffle.add(new Tile(Color.green,Symbol.bird));
		deckToShuffle.add(new Tile(Color.magenta,Symbol.turtle));
		deckToShuffle.add(new Tile(Color.magenta,Symbol.turtle));
		deckToShuffle.add(new Tile(Color.red,Symbol.turtle));
		deckToShuffle.add(new Tile(Color.red,Symbol.turtle));
		deckToShuffle.add(new Tile(Color.blue,Symbol.turtle));
		deckToShuffle.add(new Tile(Color.blue,Symbol.turtle));
		deckToShuffle.add(new Tile(Color.cian,Symbol.turtle));
		deckToShuffle.add(new Tile(Color.cian,Symbol.turtle));
		deckToShuffle.add(new Tile(Color.yellow,Symbol.turtle));
		deckToShuffle.add(new Tile(Color.yellow,Symbol.turtle));
		deckToShuffle.add(new Tile(Color.green,Symbol.turtle));
		deckToShuffle.add(new Tile(Color.green,Symbol.turtle));
		deckToShuffle.add(new Tile(Color.magenta,Symbol.dolphin));
		deckToShuffle.add(new Tile(Color.magenta,Symbol.dolphin));
		deckToShuffle.add(new Tile(Color.red,Symbol.dolphin));
		deckToShuffle.add(new Tile(Color.red,Symbol.dolphin));
		deckToShuffle.add(new Tile(Color.blue,Symbol.dolphin));
		deckToShuffle.add(new Tile(Color.blue,Symbol.dolphin));
		deckToShuffle.add(new Tile(Color.cian,Symbol.dolphin));
		deckToShuffle.add(new Tile(Color.cian,Symbol.dolphin));
		deckToShuffle.add(new Tile(Color.yellow,Symbol.dolphin));
		deckToShuffle.add(new Tile(Color.yellow,Symbol.dolphin));
		deckToShuffle.add(new Tile(Color.green,Symbol.dolphin));
		deckToShuffle.add(new Tile(Color.green,Symbol.dolphin));
		deckToShuffle.add(new Tile(Color.magenta,Symbol.lizard));
		deckToShuffle.add(new Tile(Color.magenta,Symbol.lizard));
		deckToShuffle.add(new Tile(Color.red,Symbol.lizard));
		deckToShuffle.add(new Tile(Color.red,Symbol.lizard));
		deckToShuffle.add(new Tile(Color.blue,Symbol.lizard));
		deckToShuffle.add(new Tile(Color.blue,Symbol.lizard));
		deckToShuffle.add(new Tile(Color.cian,Symbol.lizard));
		deckToShuffle.add(new Tile(Color.cian,Symbol.lizard));
		deckToShuffle.add(new Tile(Color.yellow,Symbol.lizard));
		deckToShuffle.add(new Tile(Color.yellow,Symbol.lizard));
		deckToShuffle.add(new Tile(Color.green,Symbol.lizard));
		deckToShuffle.add(new Tile(Color.green,Symbol.lizard));
		deckToShuffle.add(new Tile(Color.magenta,Symbol.flower));
		deckToShuffle.add(new Tile(Color.magenta,Symbol.flower));
		deckToShuffle.add(new Tile(Color.red,Symbol.flower));
		deckToShuffle.add(new Tile(Color.red,Symbol.flower));
		deckToShuffle.add(new Tile(Color.blue,Symbol.flower));
		deckToShuffle.add(new Tile(Color.blue,Symbol.flower));
		deckToShuffle.add(new Tile(Color.cian,Symbol.flower));
		deckToShuffle.add(new Tile(Color.cian,Symbol.flower));
		deckToShuffle.add(new Tile(Color.yellow,Symbol.flower));
		deckToShuffle.add(new Tile(Color.yellow,Symbol.flower));
		deckToShuffle.add(new Tile(Color.green,Symbol.flower));
		deckToShuffle.add(new Tile(Color.green,Symbol.flower));
		
		Collections.shuffle(deckToShuffle);
		return deckToShuffle;
	}
}