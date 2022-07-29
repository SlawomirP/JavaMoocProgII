package ex10_09;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ReadingFilesPerLine {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // test the method here

    }

    public static List<String> read (String file){
        //TWORZĘ LISTE W KTORA BEDA WPISYWANE KOLEJNE WIERSZE
        List<String> listForfile = new ArrayList<>();

        try{
            //KORZYSTAM Z GOTOWEJ METODY ODCZYTU Z PLIKU A NASTEPNIE
            //FOR EACHEM DODAJE DO LISTY KAZDY WIERSZ
            Files.lines(Paths.get(file)).forEach(row -> listForfile.add(row));
        } catch (IOException ex) {
            System.out.println("Just error");
        }
        //ZWRACAM LISTE
        return listForfile;
    }

}
