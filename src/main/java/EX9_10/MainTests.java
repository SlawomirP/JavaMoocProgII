package EX9_10;

public class MainTests {
    public static void main(String[] args) {

        Warehouse warehouse = new Warehouse();
        warehouse.addProduct("milk", 3, 10);
        warehouse.addProduct("coffee", 5, 7);

        System.out.println("prices:");
        System.out.println("milk: " + warehouse.price("milk"));
        System.out.println("coffee: " + warehouse.price("coffee"));
        System.out.println("sugar: " + warehouse.price("sugar"));

    }
}
