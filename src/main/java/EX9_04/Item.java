package EX9_04;


import java.util.Objects;

public class Item {

    private String name; // NAZWA PRZEDMIOTU
    private int weight;// WAGA PRZEDMIOTU

    public Item(String name, int weight) {
        this.name = name;
        this.weight = weight;
    }
    // JEZELI NIE OKRESLIMY WAGI TO TEN KONSTR
    public Item(String name) {
        this(name, 0);
    }

    public String getName() {
        return name;
    }

    public int getWeight() {
        return weight;
    }
    // NADPISANIE METOD EQUALS I HASCODE, POTRZEBNE ABY OBIEKTOW
    // MOZNA BYLO UZYWAC W KOLEKCJACH DO SZUKANIA CZY POROWNYWANIA
    // WAGA NIE BEDZIE TUTAJ BRANA POD UWAGE, TYLKO NAZWA
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;// 1 WARUNEK
        if (o == null || getClass() != o.getClass()) return false;// 2 WARUNEK

        Item item = (Item) o;// 3 WARUNEK
        return Objects.equals(name, item.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name,weight);
    }
}
