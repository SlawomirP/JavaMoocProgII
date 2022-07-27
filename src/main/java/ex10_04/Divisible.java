package ex10_04;

import java.util.ArrayList;
import java.util.stream.Collectors;

public class Divisible {
    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(3);
        numbers.add(2);
        numbers.add(-17);
        numbers.add(-5);
        numbers.add(7);

        //TA LISTA DEVISIBLE TO LISTA NUMBERS POTRAKTOWANA
        //METODA STATYCZNA divisible KTORA Z PODANEJ W PARAMETRZE LISTY
        //WYCIAGA TYLKO TE KTORE SA PODZIELNE PRZEZ 2 LUB 3 LUB 5
        ArrayList<Integer> divisible = divisible(numbers);

        //NASTEPNIE STREAMUJEMY TA NOWA LISTE I WYSWIETLAMY ELEMENTY
        //KTORE W NIEJ ZOSTALY
        divisible.stream()
                .forEach(value -> System.out.println(value));
    }

    public static ArrayList<Integer> divisible (ArrayList<Integer> numbers){
        //ZWROCI LISTE PO PRZEFILTROWANIU WARTOSCI
        return (ArrayList<Integer>) numbers.stream()
                //WARUNKI FILTOWANIA
                .filter(value -> value % 2 == 0 || value % 3 == 0 || value % 5 == 0)
                //ZAPIS DO LISTY
                .collect(Collectors.toList());
    }
}
