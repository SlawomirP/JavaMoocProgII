package EX9_10;

public class MainTests {
    public static void main(String[] args) {

        Item item = new Item("milk", 4, 2);
        System.out.println("an item that contains 4 milks has the total price of " + item.price());
        System.out.println(item);
        item.increaseQuantity();
        System.out.println(item);

    }
}
