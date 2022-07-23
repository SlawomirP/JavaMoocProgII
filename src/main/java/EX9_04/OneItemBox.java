package EX9_04;

import java.util.ArrayList;

//KLASA NA PUDELKO TYLKO Z JEDNYM PRZEDMIOTEM
//DODA PRZEDMIOT TYLKO RAZ, JEZELI COS JEST W PUDELKU
// TO NIC NIE DODAM
public class OneItemBox extends Box {

    private ArrayList<Item> oneItemBox;

    public OneItemBox (){
        this.oneItemBox = new ArrayList<>();
    }
// METODA DODA ELEMENT DO LISTY TYLKO JEZELI JEST ONA PUSTA
    @Override
    public void add(Item item) {
        if (this.oneItemBox.isEmpty()) {
            this.oneItemBox.add(item);
        }
    }
// SPRAWDZA CZY ITEMEK JEST NA LISCIE
    @Override
    public boolean isInBox(Item item) {
        if(this.oneItemBox.contains(item)){
            return true;
        }
        return false;
    }
}
