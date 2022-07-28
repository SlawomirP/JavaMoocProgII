package ex10_08;

import java.util.ArrayList;

import static java.util.Arrays.stream;

public class Suitcase {

    private int maximumWeight;
    private ArrayList<Item> items;

    public Suitcase(int maximumWeight) {
        this.items = new ArrayList<>();
        this.maximumWeight = maximumWeight;
    }

    public void addItem(Item Item) {
        if (this.totalWeight() + Item.getWeight() > this.maximumWeight) {
            return;
        }

        this.items.add(Item);
    }

    //WERSJA METODY OPARTA NA STRIMIE
    public int totalWeight() {
        int sum = items.stream().map(item -> item.getWeight())
                .reduce(0, (previousSum, items) -> previousSum + items);
        return sum;
    }

    //    public int totalWeight() {
//        int summa = 0;
//        int indeksi = 0;
//        while (indeksi < this.Items.size()) {
//            summa += this.Items.get(indeksi).getweight();
//            indeksi++;
//        }
//        return summa;
//    }
//NOWA WERSJA METODY OPARTA NA STRIMIE
    public void printItems() {
        this.items.stream().forEach(item -> System.out.println(item));
    }
//    public void printItems() {
//        int indeksi = 0;
//        while (indeksi < this.items.size()) {
//            Item t = this.items.get(indeksi);
//            System.out.println(t);
//            indeksi++;
//        }
//    }

    public Item heaviestItem() {
        if (this.items.isEmpty()) {
            return null;
        }

        // Tutustumme järjestämiseen hieman myöhemmin kurssilla
        return this.items.stream().max((t1, t2) -> t1.getWeight() - t2.getWeight()).get();
    }

    @Override
    public String toString() {
        if (this.items.isEmpty()) {
            return "no items (0 kg)";
        }

        if (this.items.size() == 1) {
            return "1 item (" + this.totalWeight() + " kg)";
        }

        return this.items.size() + " items (" + this.totalWeight() + " kg)";
    }
}
