package EX9_04;

import java.util.ArrayList;

public class MisplacingBox extends Box{

    private ArrayList<Item> misplacingBox;

    public MisplacingBox () {
        this.misplacingBox = new ArrayList<>();
    }


    @Override
    public void add(Item item) {
        this.misplacingBox.add(item);
    }

    @Override
    public boolean isInBox(Item item) {
        return false;
    }
}
