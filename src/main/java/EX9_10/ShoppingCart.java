package EX9_10;

import java.util.HashMap;
import java.util.Map;
//KLASA KTORA BEDZIE ZIOREM OBIEKTÓW iTEM
public class ShoppingCart {

    private Map<String, Item> cart;

    public ShoppingCart (){
        this.cart = new HashMap<>();
    }

    //TA METODA BEDZIE DODAWALA ITEM DO KOSZYKA OKRESLONEJ
    //NAZWIE I CENIE
    public void add(String product, int price){
        this.cart.put(product, new Item(product,1,price));
    }

    //METODA BEDZIE ZWRACALA KOSZT CALEGO KOSZYKA
    public int price(){
        int price = 0;
        for(Item item : cart.values()){
            price += item.price();
        }
        return price;
    }


}
