package EX9_10;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

//TA KLASA TWORZY MAGAZYN RODZIELAJAC PRODUKT NA 2 OBIEKTY
//WRZUCANE W HASHMAPY
public class Warehouse {

    private Map<String, Integer> productWithPrice;
    private Map<String, Integer> productWithStockBalance;

    //KONSTRUKTOR TWORZACY ODRAZU 2 HASHMAPY
    public Warehouse() {
        this.productWithPrice = new HashMap<>();
        this.productWithStockBalance = new HashMap<>();
    }

    //DODAJE METODE KTORA DODA PRODUKT W 2 HASHMAPY ZALEZNIE OD PARAMETROW
    public void addProduct(String product, int price, int stock) {
        this.productWithPrice.put(product, price);
        this.productWithStockBalance.put(product, stock);
    }

    //METODA KTORA ZWROCI CENE PRODUKTU PODANEGO W JEJ PARAMETRZE
    //JEZELI PRODUKTU NIE MA W MAPIE TO ZWROCI -99
    public int price(String product) {
        if (this.productWithPrice.containsKey(product)) {
            return this.productWithPrice.get(product);
        }
        return -99;
    }

    //METODA KTORA BEDZIE ZWRACALA AKTUALNY STAN PRODUKTU NA MAGAZYNIE
    //JEZELI PRODUKTU NIE MA W MAGAZYNIE TO ZWROCI 0
    public int stock(String product) {
        if (this.productWithStockBalance.containsKey(product)) {
            return this.productWithStockBalance.get(product);
        }
        return 0;
    }

    //METODA KTORA ZMNIEJSZY STAN PRODUKTU KTORY OTRZYMA W PARAMETRZE O 1
    //STAN NIE MOZE BYC MNIEJSZY NIZ 0,A POTEM ZWROCI TRUE
    //JEZELI NIE BEDZIE PRODUKTU TO ZWROCI FALSE
    public boolean take(String product) {
        //SPRAWDZAM CZY JEST PRODUKT
        if (this.productWithStockBalance.containsKey(product)) {
            //JEZELI JEST TO ZAPISUJE WARTOSC POD NIEGO PRZYPISANA DO
            //POMOCNICZEJ ZMIENNEJ
            int smallerStock = this.productWithStockBalance.get(product);
            //JEZELI TA ZMIENNA JEST WIEKSZA OD 0 TO ODEJMUJE 1
            if (smallerStock > 0) {
                smallerStock -= 1;
                //NASTEPNIE DODAJE KLUCZ Z NOWA WARTOSCIA ZASTEPUJACY STARY
                this.productWithStockBalance.replace(product, smallerStock);
                return true;
            }
        }
        return false;
    }

    //METODA KTORA ZWROCI NAM SET KTORY BEDZIE ZAWIERAL
    //NAZWY PRODUKTOW ZNAJDUJACE SIE W MAGAZYNIE
    public Set<String> products() {
        Set<String> products = new HashSet<>();
        products = this.productWithPrice.keySet();
        return products;
    }
}
