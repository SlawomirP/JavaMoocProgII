package ex10_13;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LiteracyComparison {

    public static void main(String[] args) {

        //Każdy wiersz w pliku literacy.csv ma następującą postać:
        // „temat, grupa wiekowa, płeć, kraj, rok, procent umiejętności czytania i pisania.
        //Stworzyc program ktory to odczyta, a nastpenie wydrukuje w kolejnosci od najwyzszego
        // w rankingu do najnizszego.
        //STWORZE SOBIE NAJPIERW KLASE NA OBIEKTY
        //TWORZE LISTE OBIEKTOW

        List<LiteracyStatistics> statistics = new ArrayList<>();

        //WCZTANIE Z PLIKU LINIJEK

        try {
            //WCZYTYWANIE PO LINIJCE
            Files.lines(Paths.get("src/main/java/ex10_13/literacy.csv"))
                    //PODZIELENIE WCZYTANEGO WIERSZA
                    .map(row -> row.split(","))
                    //UTWORZENIE OBIEKTU Z PODZIELONEGO WIERSZA
                    //    [0]                       [1]             [2]     [3]     [4]    [5]
                    //Adult literacy rate, population 15+ years, male (%),Croatia,2015,99.65564
                    .map(rowParts -> new LiteracyStatistics(rowParts[2], rowParts[3], Integer.valueOf(rowParts[4]), Double.valueOf(rowParts[5])))
                    //UTWORZONE OBIEKTY LADUJA W LISCIE
                    .forEach(object -> statistics.add(object));
        } catch (IOException e) {
            System.out.println("Read error.");
        }

        //ZEBY METODA SORT ZADZIALALA MUSIALEM NADPISAC  toString
        Collections.sort(statistics);
        //POPROSTU WYSWIETLILEM POSORTOWANA LISTE
        statistics.stream().forEach(o -> System.out.println(o));

    }
}