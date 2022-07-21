package EX814;

import java.util.ArrayList;
import java.util.HashMap;

public class DictionaryOfManyTranslations {

    private HashMap<String, ArrayList<String>> dictionary;

    public DictionaryOfManyTranslations() {
        this.dictionary = new HashMap<>();
    }

    //TWORZE METODE KTORA BEDZIE DODAWAC DO LISTY BEDACEJ WARTOSCIA DLA KULCZA
    public void add(String word, String translation) {
        this.dictionary.putIfAbsent(word, new ArrayList<>());// nie nadpisze, zachowa stare
        this.dictionary.get(word).add(translation); // do listy pod kluczem doda
    }

    //ZWROCI LISTE WARTOSCI DLA PODANEGO KLUCZA
    public ArrayList<String> translate(String word){
        //SPRAWDZAM CZY TAKI KLUCZ ISTNIEJE W MAPIE
            if(this.dictionary.containsKey(word)){
                return this.dictionary.get(word);
            }
            //JEZELI NIE MA TAKIEGO KLUCZA TO ZWRACAM PUSTA LISTE
        return new ArrayList<>();
    }
    // USUNIECIE Z MAPY KLUCZA I ZWIAZANYCH Z NIM WARTOSCI
    public void remove (String word){
        if(this.dictionary.containsKey(word)){
            this.dictionary.remove(word);
        }
    }
}
