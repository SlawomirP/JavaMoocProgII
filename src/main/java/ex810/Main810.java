package ex810;

import java.util.ArrayList;

public class Main810 {
    public static void main(String[] args) {

//        without it, you'll see the difference.

        ArrayList<Books> books = new ArrayList<>();
        Books bookObject = new Books("Book Object", 2000, "...");
        books.add(bookObject);

        if (books.contains(bookObject)) {
            System.out.println("Book Object was found.");
        }

        bookObject = new Books("Book Object", 2000, "...");

        if (!books.contains(bookObject)) {
            System.out.println("Book Object was not found.");
        }
    }
}
