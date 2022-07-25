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
    //NAZWIE I CENIE W ILOSCI 1 SZT

    public void add(String product, int price){
        //JEZELI PRODUKT BEDZIE ZNAJDOWAL SIE JUZ W KOSZYKU TO NIE DODA NOWEGO
        //TYLKO ZWIEKSZY JEGO ILOSC O 1
        if(this.cart.containsKey(product)){
            this.cart.get(product).increaseQuantity();
        }
        //JEZELI PRODUKT ZNAJDUJE SIE W KOSZYKU TO NIC NIE ZROBI
        this.cart.putIfAbsent(product, new Item(product,1,price));

    }

    //METODA BEDZIE ZWRACALA KOSZT CALEGO KOSZYKA
    public int price(){
        int price = 0;
        //PETLA LECI PO WARTOSCIACH PRZYPISANYCH POD KLUCZE
        for(Item item : this.cart.values()){
            price += item.price();
        }
        return price;
    }

    //METODA KTORA WYSWIETLI WSZYSTKIE OBIEKTY/ITEMKI W CART
    //ZOSTANIE TU UZYTE TOSTRING Z KLASY ITEM
    public void print(){
        for(Item item : this.cart.values()){
            System.out.println(item);
        }
    }


}
