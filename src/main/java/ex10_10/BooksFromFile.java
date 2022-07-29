package ex10_10;


import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;



public class BooksFromFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // test your method here

    }

    public static List<Book> readBookS(String file) {
        //TWORZE LISTE GDZIE DODAM ZLOZONE OBIEKTY BOOK
        List<Book> books = new ArrayList<>();
        try {
            //PRZECZYTANIE LINIJEK PLIKU
            Files.lines(Paths.get(file))
                    //ROZBICIE LINIJKI NA CZESCI ODDZIELONE PRZECINKIEM
                    .map(row -> row.split(","))
                    //STWORZENIE OBIEKTU Z CZESCI
                    .map(parts -> new Book(parts[0], Integer.parseInt(parts[1]), Integer.parseInt(parts[2]), parts[3]))
                    //WRZUCENIE KAZDEGO OBIEKTU DO LISTY
                    .forEach(book -> books.add(book));
        } catch (IOException ex) {
            System.out.println("Error");
        }
        return books;
    }
}
