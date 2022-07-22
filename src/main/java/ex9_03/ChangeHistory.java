package ex9_03;

import java.util.ArrayList;
import java.util.Collections;

//UTWORZONA KLASA BEDZIE ODPOWIEDZIALNA ZA ZAPAMIETANIE HISTORII ZMIAN
//ILOSCI PRODUKTU W MAGAZYNIE, WSZYSTKO BEDZIE ZAPISYWANE W LISCIE DOUBLI
//NASTAPI TU HERMETYZACJA LISTY PRZEZ UTWORZENIE TEJ KLASY
public class ChangeHistory {

    private ArrayList<Double> history;

    public ChangeHistory() {
        this.history = new ArrayList<>();
    }

    //METODA KTORA BEDZIE DODAWALA DO LISTY
    public void add(double status) {
        history.add(status);
    }

    //METODA KTORA WYCZYSCI LISTE Z HISTORIA
    public void clear() {
        this.history.clear();
    }

    //METODA KTORA ZWROCI LISTE, W TYM PRZYPADKU HISTORIA ZMIAN
    @Override
    public String toString() {
        return this.history.toString();
    }

    //METODA ZWRACAJACA NAJWIEKSZA WARTOSC Z LISTY
    //ZWROCI 0 JEZELI LISTA BEDZIE PUSTA
    public double maxValue(){
        if(this.history.isEmpty()){
            return 0.0;
        }
        return Collections.max(this.history);
    }
    //METODA ZWRACAJACA NAJMNIEJSZA WARTOSC Z LISTY
    //ZWROCI 0 JEZELI LISTA BEDZIE PUSTA
    public double minValue(){
        if (this.history.isEmpty()){
            return 0.0;
        }
        return Collections.min(this.history);
    }

    //METODA KTORA ZWROCI SREDNIA WARTOSC Z LISTY
    //DLA PUSTEJ LISTY ZWROCI 0
    public double average(){
        if (this.history.isEmpty()){
            return 0.0;
        }
        double sumValuesInList = 0;
        for(Double value : this.history){
            sumValuesInList += value;
        }
        return sumValuesInList/this.history.size();
    }

}
