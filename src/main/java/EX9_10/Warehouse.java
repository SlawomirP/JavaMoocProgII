package EX9_10;

import java.util.HashMap;
import java.util.Map;
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
}
