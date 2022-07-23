package EX9_04;

import java.util.ArrayList;

// KLASA DZIEDZICZACA PO BOX
// BEDZIE TO BOX Z OGRANICZENIEM WAGOWYM
// DODAWANIE ITEMKOW TYLKO POD WARUNKIEM NIE PRZEKROCZENIA LIMITU
public class BoxWithMaxWeight extends Box{

    private int capacity;
    private ArrayList<Item> itemsBox;

    public BoxWithMaxWeight (int capacity){
        this.capacity = capacity;
        this.itemsBox = new ArrayList<>();
    }
// TA METODA ZWRACA ILOSC ZAJETEGO JUZ MIEJSCA W BOXIE
    private int usedCapacity (){
        int usedCapacity = 0;
        for(Item item : this.itemsBox){
            usedCapacity += item.getWeight();
        }
        return usedCapacity;
    }
//NADPISUJE METODE DODAJACA ITEMEK DO BOXA
    @Override
    public void add(Item item) {
        if(item.getWeight() > this.capacity || item.getWeight() < this.capacity &&
                item.getWeight() + usedCapacity() > this.capacity){
            return;
        }
        if(item.getWeight() < this.capacity && (item.getWeight() + usedCapacity()) <= this.capacity){
            this.itemsBox.add(item);
        }
    }
// NADPISUJE METODE SPRAWDZAJACA CZY ITEMEK JEST W BOXIE
    @Override
    public boolean isInBox(Item item) {
        for(Item itemek : itemsBox){
            if(itemek.equals(item)){
                return true;
            }
        }
        return false;
    }
}
