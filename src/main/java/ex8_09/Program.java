package ex8_09;

import java.util.HashMap;

public class Program {

    public static void main(String[] args) {
        HashMap<String, Book> hashmap = new HashMap<>();
        hashmap.put("sense", new Book("Sense and Sensibility", 1811, "..."));
        hashmap.put("prejudice", new Book("Pride and prejudice", 1813, "...."));

        printValues(hashmap);

        System.out.println("---");
        printValueIfNameContains(hashmap, "prejud");

    }

    //WYSWIETLI WSZYSTKIE WARTOSCI Z HASZMAPY PODANEJ W PARAMETRZE
    public static void printValues (HashMap<String, Book> hashmap) {
        for(Book book : hashmap.values()){
            System.out.println(book);
        }
    }

    //WYSWIETLI WSZYSTKIE WARTOSCI HASZMAPY ZAWIERAJACE TEKST - TUTAJ TO OBIEKTY I ICH NAZWY
    public static void printValueIfNameContains (HashMap<String, Book> hashmap, String text){
        for(Book book : hashmap.values()){
            if(book.getName().contains(text)){
                System.out.println(book);
            }
        }
    }
}
