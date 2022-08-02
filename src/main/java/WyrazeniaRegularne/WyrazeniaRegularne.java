package WyrazeniaRegularne;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class WyrazeniaRegularne {
    public static void main(String[] args) {

        //SPRAWDZENIE CZY CIAG ZNAKOWY SPELNIA WYRAZENIE REGULARNE

        //dowolna ilosc znakow przed a i dowolna ilosc znakow po a
        System.out.println("abbccccdddd11112222".matches(".*a.*"));

        //czy przed a znajduje sie dowolny znak conajmniej raz
        System.out.println("abbccccdddd11112222".matches(".+a.*"));

        //czy w ciagu znajduje sie liczba
        System.out.println("abbccccdddd11112222".matches(".+\\d.*"));

        //czy liczba wystepuje okreslona ilosc razy
        System.out.println("abbccccdddd11112222".matches(".*\\d{8}.*"));

        //czy liczba wystepuje od 5 do 12 razy
        System.out.println("abbccccdddd11112222".matches(".*\\d{5,12}.*"));

        //czy jest odstep
        System.out.println("abbccccdddd11112222".matches(".*\\s.*"));

        //czy jest wszystko inne niz odstep
        System.out.println("abbccccdddd11112222".matches(".*\\S.*"));

        //czy jest dowolny ze znakow
        System.out.println("abbccccdddd11112222".matches(".*\\w.*"));

        //podstawowa klasa definujaca wzorzec to Pattern
        //tworzymy obiekt patternu zeby poslugiwac sie nim wielokrotnie
        Pattern pattern = Pattern.compile(".*\\w.*");
        //nastepnie na tym obiekcie uzywamy metody matcher gdzie podajemy ciag do analizy
        Matcher matcher = pattern.matcher("abbccccdddd11112222");
        //na obiekcie matcher uzywamy metody matches i to wyswietlamy
        System.out.println(matcher.matches());
    }
}
