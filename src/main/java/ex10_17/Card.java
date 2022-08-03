package ex10_17;

//ZROBIC Z TEJ KLASY COMPARABLE I NADPISAC METODE COMPARE TO
//TAK ABY USTAWILA KARTY ROSNACO PO ICH WARTOSCI A JEZELI
//BEDA MIALY TA SAMA WARTOSC TO NAJPIERW MAJA BYC
//CLUB, DIAMOND, HEART, SPADE

import java.util.Comparator;

public class Card implements Comparable<Card>{

    private int value;
    private Suit suit;

    public Card(int value, Suit suit) {
        if (value < 2 || value > 14) {
            throw new IllegalArgumentException("Card value must be in range 2...14.");
        }

        this.value = value;
        this.suit = suit;
    }

    @Override
    public String toString() {
        String cardValue = "" + value;
        if(value == 11) {
            cardValue = "J";
        } else if (value == 12) {
            cardValue = "Q";
        } else if (value == 13) {
            cardValue = "K";
        } else if (value == 14) {
            cardValue = "A";
        }

        return suit + " " + cardValue;
    }

    public int getValue() {
        return value;
    }

    public Suit getSuit() {
        return suit;
    }

    @Override
    public int compareTo(Card compared) {
        // jezeli wartosci sa takie same to zwraca roznice w kolorach
        if (this.value == compared.getValue()){
            return this.suit.ordinal() - compared.getSuit().ordinal();
        }
        if (this.value > compared.getValue()){
            return 1;
        } else {
            return -1;
        }

    }
}
