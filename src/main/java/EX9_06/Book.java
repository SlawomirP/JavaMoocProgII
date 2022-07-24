package EX9_06;
// UTWORZONA KLASA IMPLEMENTUJE INTERFEJS
public class Book implements Packable{

    // pola w klasie ksiazki
    private String author;
    private String name;
    private double weight;

    public Book(String author, String name, double weight) {
        this.author = author;
        this.name = name;
        this.weight = weight;
    }

    @Override
    public double weight() {
        return 0;
    }
    // nadpisuje metode toString aby nie wyswietlala tylko
    //hashcodu
    @Override
    public String toString () {
        return this.author + ": " + this.name;
    }
}
