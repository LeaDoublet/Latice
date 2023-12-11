package latice.model;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class PackPlayer extends Bigpackaxe {



    public PackPlayer() {

    }
    public static List<Tile> create_list_PackPlayer(List<Tile> list) {
        List<Tile> onePack = new ArrayList<>();

        int j=0;

        for(int i = 0; i<30;i++) {
            onePack.add(list.get(j));
            Tile lien = list.get(j);
            list.remove(lien);
            }

        return onePack;

    }

}