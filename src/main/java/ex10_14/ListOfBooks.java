package ex10_14;

import java.util.ArrayList;
import java.util.List;

public class ListOfBooks {

    private List<Book> listOfBooks;

    public ListOfBooks () {
        this.listOfBooks = new ArrayList<>();
    }

    public void add (Book book){
        this.listOfBooks.add(book);
    }

    public int listSize (){
        return this.listOfBooks.size();
    }

    public String toString(){
        return listSize() + " books in total.";
    }

    public List<Book> getList(){
        return this.listOfBooks;
    }
}
