package ex8_08;

import java.util.HashMap;

public class Program {
    public static void main(String[] args) {

        HashMap<String, String> hashmap = new HashMap<>();
        hashmap.put("f.e", "for example");
        hashmap.put("etc.", "and so on");
        hashmap.put("i.e", "more precisely");

        printKeys(hashmap);

        printKeysWhere(hashmap, "i");

        printValuesOfKeysWhere(hashmap, ".e");

    }

    // METODA KTÓRA WYPISZE WSZYSTKIE KLUCZE Z HASZMAPY PODANEJ W PARAMETRZE
    public static void printKeys(HashMap<String, String> hashmap) {
        for (String key : hashmap.keySet()) {
            System.out.println(key);
        }
    }

    // WYPISZE WSZYSTKIE KLUCZE Z HASZMAPY KTÓRE ZAWIERAJĄ TEXT PODANY W PARAMETRZE
    public static void printKeysWhere(HashMap<String, String> hashmap, String text) {
        for (String key : hashmap.keySet()) {
            if (key.contains(text)) {
                System.out.println(key);
            }
        }
    }

    // WYPISZE Z HASZMAPY WARTOSC KTOREJ KLUCZ BEDZIE ZAWIERAL OKRESLONY TEXT
    public static void printValuesOfKeysWhere(HashMap<String, String> hashmap, String text) {
        for (String key : hashmap.keySet()) {
            if (key.contains(text)) {
                System.out.println(hashmap.get(key));
            }
        }
    }
}