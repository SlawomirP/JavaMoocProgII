package ex9_03;

//TA KLASA BEDZIE SUBKLASA KLASY WAREHOUSE, TZN BEDZIE JA ROZSZERZALA, TZN DZIEDZICZYLA
//TAMTA KLASA BYLA OD OBSLUGI ILOSCI TA SUBKLASA BEDZIE OD OBSLUGI NAZWY
//CZYLI MAMY KLASE OGOLNA NA MAGAZY I RODZAJ TEGO MAGAZYNU-> MAGAZYN NA PRODUKTY
public class ProductWarehouse extends Warehouse {

    private String productName;

    //KONSTRUKTOR DODAJE POLE Z NAZWA PRODUKTU, POJEMNOSC BIERZEE Z KLASY NADRZEDNEJ
    // POLE BALANCE KTORE TU NIE ZOSTALO ZMIENIONE BEDZIE BRALE Z NADRZEDNEJ KLASY
    public ProductWarehouse(String productName, double capacity) {
        super(capacity);
        this.productName = productName;
    }

    //GETER DLA NAZWY
    public String getName() {
        return productName;
    }
    //SETER DLA NAZWY PRODUKTU, USTAWI NOWA NAZWE
    public void setProductName(String newName) {
        this.productName = newName;
    }
    //NADPISUJE TOSTRINGA ZEBY ZWRACAL RZADANY NAPIS
    @Override
    public String toString(){
        return getName() + ":" + super.toString();
    }
}
