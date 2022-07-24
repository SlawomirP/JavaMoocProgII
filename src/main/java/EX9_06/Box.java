package EX9_06;

import java.util.ArrayList;

//KLASA KTORA BEDZIE TWPRZYLA PRZESTRZEN NA OBIEKTY KLAS
//KTORE IMPLEMENTUJE INTERFACE PACKABLE
// BOX DO KTOREGO WCHODZA ITEMKI MA OGRANICZENIE
// BEDE PISAL POD TO METODY
public class Box {
    // LISTA TYPU INTERFEJSU ABY WSZYSTKO CO IMPLEMETUJE
    // TEN INTERFEJS MOGLO TU ZOSTAC WPISANE
    private ArrayList<Packable> box;
    private int capacity;

    public Box (int capacity){
        this.capacity = capacity;
        this.box = new ArrayList<>();
    }
    //TWORZE METODE DODAJACA OBIEKTY TYPU PACKABLE
    //DO LISTY, MUSZE USTALIC WARUNKI PRZY KTORYCH
    //NIE ZOSTANIE PRZEKROCZONY LIMIT
    public void add (Packable packable){
        if(packable.weight() > this.capacity ||
                (packable.weight() + weight()) > this.capacity){
            return;
        }
        if(packable.weight() + weight() <= this.capacity){
            this.box.add(packable);
        }
    }

    private double weight(){
        double weight = 0;
        for(Packable item : this.box){
            weight +=item.weight();
        }
        return weight;
    }

    //NADPISUJE TOSTRING ZEBY WYSWIETLILO PRAWIDLOWY KOMUNIKAT
    public String toString (){
        return "Box: " + this.box.size() + " items, total weight " + weight()
        + " kg";
    }

}
