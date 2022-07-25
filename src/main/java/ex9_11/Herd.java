package ex9_11;

import java.util.ArrayList;

//KLASA KTORA ROWNIEZ IMPLEMENTUJE MOVEABLE
//DODATKOWO GROMADZI OBIEKTY ORGANISM W LISCIE
public class Herd implements Moveable {
    //LISTA OBIEKTOW Z IMPLEMENTACJA MOVEABLE
    private ArrayList<Moveable> organisms;

    public Herd() {
        this.organisms = new ArrayList<>();
    }

    //METODA ZWORCI STRINGA ZAWIERAJACEGO REPREZENTACJE STRING
    //KAZDEGO OBIEKTU NA LISCIE, JEDEN POD DRUGIM
    public String toString() {
        String everyoneOwnPosition = "";
        for (Moveable organism : organisms) {
            everyoneOwnPosition += organism + "\n";
        }
        return everyoneOwnPosition;
    }

    //METODA KTORA DODA DO LISTY OBIEKT TYPU MOVEABLE CZYLI TAKIEGO
    //KTOREGO KLASA IMPLEMENTUJE INTERFEJS MOVEABLE
    public void addToHerd(Moveable moveable) {
        this.organisms.add(moveable);
    }

    //METODA KTORA PRZESUNIE KAZDY OBIEKT Z OSOBNA ZNAJDUJACY SIE W LISCIE
    @Override
    public void move(int dx, int dy) {
        for (Moveable organism : organisms) {
            organism.move(dx, dy);
        }
    }
}
