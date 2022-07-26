package ex10_14;

import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class User {

    private ListOfBooks list;
    private Scanner scanner;

    public User() {
        this.list = new ListOfBooks();
        this.scanner = new Scanner(System.in);
    }

    //METODA STARTUJACA
    public void start() {
        while (true) {
            //ZEBRANIE DANYCH I WPISANIE NA LISTE
            System.out.println("Input the name of the book, empty stops: ");
            String name = scanner.nextLine();

            if (name.isEmpty()) {
                break;
            }
            System.out.println("Input the age recommendation:");
            int recommendationAge = Integer.parseInt(scanner.nextLine());

            list.add(new Book(name, recommendationAge));
        }

        System.out.println(list.toString());

        System.out.println();

        System.out.println("Books:");

        for (Book book : list.getList()) {
            System.out.println(book.toString());
        }
        System.out.println("------------------------------------------");

        //POSORTOWANIE LISTY WEDLUG ZALEZANEGO WIEKU
        //UZYCIE COMPARATORA, NIE TRZEBA PISAC COMPARETO I IMPLEMENTOWAC INTERF
        Comparator<Book> comparator = Comparator
                .comparing(Book::getRecommendedAge);
        //POSORTOWANIE
        Collections.sort(list.getList(), comparator);
        //KOLEJNE WYSWIETLENIE
        for (Book book : list.getList()) {
            System.out.println(book.toString());
        }

        System.out.println("+++++++++++++++++");

        //POSORTOWANIE LISTY WEDLUG ZALEZANEGO WIEKU I ALFABETYCZNIE
        Comparator<Book> comparator2 = Comparator
                .comparing(Book::getRecommendedAge)
                .thenComparing(Book::getName);

        //POSORTOWANIE
        Collections.sort(list.getList(), comparator2);
        //KOLEJNE WYSWIETLENIE
        list.getList().stream()
                .forEach(book -> System.out.println(book));
    }
}
