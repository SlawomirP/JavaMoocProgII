package ex10_17;

import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        ArrayList<Card> cards = new ArrayList<>();

        cards.add(new Card(3, Suit.SPADE));
        cards.add(new Card(2, Suit.DIAMOND));
        cards.add(new Card(14, Suit.SPADE));
        cards.add(new Card(12, Suit.HEART));
        cards.add(new Card(2, Suit.SPADE));

        BySuitInValueOrder sortBySuitSorter = new BySuitInValueOrder();
      Collections.sort(cards, sortBySuitSorter);
        Collections.sort(cards, new BySuitInValueOrder());

        cards.stream().forEach(c -> System.out.println(c));
    }
}
