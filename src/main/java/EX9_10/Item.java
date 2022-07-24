package EX9_10;

public class Item {

    private String product;
    private int qty;
    private int unitPrice;

    public Item(String product, int qty, int unitPrice) {
        this.product = product;
        this.qty = qty;
        this.unitPrice = unitPrice;
    }
    //ZWRACA CENE PRODUKTU, CENA TO ILOSC PRODUKTU RAZY CENA
    public int price(){
        return this.qty * this.unitPrice;
    }

    //METODA KTORA ZWIEKSZA ILOSC O 1
    public void increaseQuantity(){
        this.qty++;
    }

    //NADPISANIE METODY toString
    @Override
    public String toString(){
        return this.product + ": " + this.qty;
    }

}
