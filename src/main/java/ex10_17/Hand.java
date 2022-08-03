package ex10_17;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//KLASA KTORA REPREZENTUJE KARTY W CZYJEJS RECE
//W KOLEJNYM KROKU TUTAJ TEZ MAM ZAIMPLEMENTOWAC
//INTERFEJS COMPARABLE NO I NADPISAC METODE COMPARETO
public class Hand implements Comparable<Hand>{

    List<Card> cards;

    public Hand (){
        this.cards = new ArrayList<>();
    }

    //dodanie karty do reki
    public void add(Card card){
        this.cards.add(card);
    }

    //wyswietlenie wszystkich kart , zrobie na strimie
    public void print(){
        cards.stream()
                .forEach(card -> System.out.println(card));
    }

    //METODA KTORA POSORTUJE KARTY na collections
    //to wykorzystuje metode compareTo dlatego ja trzeba bylo nadpisac
    //w klasie card
    public void sort (){
        Collections.sort(this.cards);
    }
//METODA MA POROWNAC SUME WARTOSCI KART W RECE
    @Override
    public int compareTo(Hand compared) {
        if (this.getSumValuesInHand() == compared.getSumValuesInHand()){
            return 0;}
        if (this.getSumValuesInHand() > compared.getSumValuesInHand()) {
            return 1;
        } else {
            return -1;
        }
    }
    //METODA ZLICZY SUME WARTOŚCI W LISCIE, ZROBIE TO NA STRIMIE
    //POTEM UZYJE TEGO W METODZIE COMPARETO
    private int getSumValuesInHand(){
        //pomocniczy int, robie na nim stream, mapuje liste kart na liste wartosci kart
        //nastepnie reducerem zliczam wartosci
        int sum = this.cards.stream().map(card -> card.getValue())
                .reduce(0,(previousSum, value)-> previousSum + value);
        return sum;
    }

    //METODA KTORA POSORTUJE KARTY W RECE
    public void sortBySuit (){
        //POSORTUJE LISTE POD WARUNKAMI
        Collections.sort(this.cards, (c1, c2) -> {
            if (c1.getSuit().ordinal() == c2.getSuit().ordinal()) {
                return c1.getValue() - c2.getValue();
            } else {
                return c1.getSuit().ordinal() - c2.getSuit().ordinal();
            }
        });
    }
}
