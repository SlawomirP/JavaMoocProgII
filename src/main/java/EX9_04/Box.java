package EX9_04;

import java.util.ArrayList;

public abstract class Box {

    public abstract void add(Item item);
    // METODA PRZESKAKUJACA PO LISCIE PRZEDMIOTOW
    // I DODAJACA JE DO BOX
    public void add(ArrayList<Item> items) {
        for (Item item : items) {
            Box.this.add(item);
        }
    }


    public abstract boolean isInBox(Item item);
}

