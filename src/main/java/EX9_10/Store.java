package EX9_10;

import java.util.Scanner;

//We now have all the parts we need for our "online store", except the store itself.
// Let's make that next. Our store has a warehouse that includes all our products.
// For each 'visit' we have a shopping cart. Every time the customer chooses a product
// its added to their cart if its available in the warehouse.
// At the same time, the stock in the warehouse is reduced by one.
public class Store {

    //OBIEKTY KLAS KTORE BEDA UZYWANE W "SKLEPIE"
    private Warehouse warehouse;
    private Scanner scanner;

    //KONSTRUKTOR GDZIE OKRESLIMY MAGAZYN I SKANERA

    public Store(Warehouse warehouse, Scanner scanner) {
        this.warehouse = warehouse;
        this.scanner = scanner;
    }

    //METODA OBSŁUGUJĄCA KLIENTA, COS JAK START(),
    //W PARAMETRZE PODAJEMY NAZWE KLIENTA
    public void shop(String customer) {
        //TWORZYMY KOSZYK DLA NOWEGO KLIENTA
        ShoppingCart cart = new ShoppingCart();
        //KOMUNIKATY POWITALNE
        System.out.println("Welcome to the store " + customer);
        System.out.println("our selection:");

        //TA PETLA PRZELATUJE PRZEZ TO CO ZWROCI METODA PRODUCTS
        //Z KLASY WAREHOUSE CZYLI:
        //ZWROCI NAM PRODUKTY KTORE ZNAJDUJA SIE W MAGAZYNIE
        //TE PRODUKTY TO KLUCZE Z HASHMAPY GDZIE ZNAJDUJA SIE
        //PRODUKTY Z CENAMI
        for (String product : this.warehouse.products()) {
            System.out.println(product);
        }

        //PETLA DO UZUPELNIANIA KOSZYKA
        while (true) {

            System.out.println("What to put in the cart (press enter to go to the register): ");

            String product = scanner.nextLine();

            //WARUNEK WYJSCIA Z PETLI
            if (product.isEmpty()) {
                break;
            }

            //METODA KTORA DODA COS DO KOSZYKA, JEZELI TO COS ZNAJDUJE
            //SIE NA MAGAZYNIE
            if (this.warehouse.stock(product) > 0) { //jezeli jest na magazynie
                this.warehouse.take(product); // wyciagnie z magazynu
                cart.add(product, this.warehouse.price(product));//doda produkt
                //o nazwie product a cene wezmie z magazynu metoda price ktora
                //pobierze cene z mapy produkt cena
            }


        }
        System.out.println("your shoppingcart contents:");
        cart.print();
        System.out.println("total: " + cart.price());


    }
}
