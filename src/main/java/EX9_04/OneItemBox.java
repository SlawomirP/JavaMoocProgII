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

    @Override
    public void add(Item item) {
        if (this.oneItemBox.isEmpty()) {
            this.oneItemBox.add(item);
        }
    }

    @Override
    public boolean isInBox(Item item) {
        if(this.oneItemBox.contains(item)){
            return true;
        }
        return false;
    }
}
