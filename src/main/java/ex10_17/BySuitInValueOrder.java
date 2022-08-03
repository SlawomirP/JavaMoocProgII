package ex10_17;

import java.util.Comparator;

// TA KLASA MA SORTOWAĆ PO KOLORZE UZYJE INTERFEJSU COMPARATOR
//TWORZĘ JĄ DLATEGO BO MOZE BYC TYLKO JEDNA METODA COMPARETO
//A TAMTA JEST JUZ ZAJETA NA SORTOWANIE PO WARTOŚCIACH KART
public class BySuitInValueOrder implements Comparator<Card> {

    @Override
    public int compare(Card c1, Card c2) {
        //METODA ZWROCI NAM WYNIK ODEJMOWANIA KOLORU KARTY
        //ALE JEJ KOLEJNOSCI W SZEREGU 1 -1 0
        return c1.getSuit().ordinal() - c2.getSuit().ordinal();
    }

    //TO BEDZIE W MAINIE
//    ArrayList<Card> cards = new ArrayList<>();
//
//cards.add(new Card(3, Suit.SPADE));
//cards.add(new Card(2, Suit.DIAMOND));
//cards.add(new Card(14, Suit.SPADE));
//cards.add(new Card(12, Suit.HEART));
//cards.add(new Card(2, Suit.SPADE));
//
//    SortBySuit sortBySuitSorter = new SortBySuit();
//Collections.sort(cards, sortBySuitSorter);

//    LUB DRUGA WERSJA
//    Collections.sort(cards, new SortBySuit());

//    LUB TRZECIA OPCJA
//Collections.sort(cards, (c1, c2) -> c1.getSuit().ordinal() - c2.getSuit().ordinal());

//cards.stream().forEach(c -> System.out.println(c));
}
