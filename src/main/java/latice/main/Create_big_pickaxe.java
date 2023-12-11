package latice.main;
import java.util.ArrayList;

import java.util.Collections;
import java.util.List;

import latice.model.Bigpackaxe;
import latice.model.Color;
import latice.model.PackPlayer;
import latice.model.Rack;
import latice.model.Symbol;
import latice.model.Tile;

public class Create_big_pickaxe {


    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Bigpackaxe bigpackaxe = new Bigpackaxe();
        List<Tile> deckToShuffle = bigpackaxe.create_list_shuffle();

        for (Tile tile : deckToShuffle) {
            System.out.println(tile.getColor()+" "+ tile.getSymbol());
        }

        PackPlayer packPlayer = new PackPlayer();
        List<Tile> firstpack = packPlayer.create_list_PackPlayer(deckToShuffle);
        List<Tile> secondpack = packPlayer.create_list_PackPlayer(deckToShuffle);




        System.out.println("------------------------------------");
        for (Tile tile : firstpack) {
                System.out.println(tile.getColor()+" "+ tile.getSymbol());
        }

        System.out.println("------------------------------------");
        for (Tile tile : secondpack) {
                System.out.println(tile.getColor()+" "+ tile.getSymbol());
        }
    }



}

