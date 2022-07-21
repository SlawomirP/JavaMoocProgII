package ex8_15;

import java.util.ArrayList;
import java.util.HashMap;

public class StorageFacility {

    //TWORZE HASHMAPE DO TRZYMANIA KLUCZA- STRING I WARTOSCI - LISTY
    private HashMap <String, ArrayList<String>> storage;

    public StorageFacility (){
        this.storage = new HashMap<>();
    }

    //TWORZE METODE DODAJACA DO HASHMAPY KLUCZ I WARTOSC DO LISTY, NIE MOZNA NADPISYWAC
    public void add (String unit, String item){
        this.storage.putIfAbsent(unit, new ArrayList<>());
        this.storage.get(unit).add(item);
    }

    //ZWRACA LISTE Z POD KLUCZA, JEZELI TA LISTA JEST PUSTA TO ZWROCI PUSTA
    public ArrayList<String> contents (String storageUnit){
        if(this.storage.containsKey(storageUnit)){
            return this.storage.get(storageUnit);
        }
        return new ArrayList<>();
    }
    // METODA USUNIE ELEMENT Z LISTY POD KONKRETNYM KLUCZEM, JEZELI LISTA BEDZIE PUSTA
    //TO USUNIE TEZ KLUCZ
    public void remove (String storageUnit, String item){
        if(this.storage.containsKey(storageUnit)){//jezeli jest taki klucz
            this.storage.get(storageUnit).remove(item);//usun z listy pod tym kluczem
        }
        if(this.storage.get(storageUnit).isEmpty()){//jezeli lista pod tym kluczem pusta
            this.storage.remove(storageUnit);// usun ten klucz
        }
    }

    //ZWRÓCI LISTĘ KLUCZY ALE TYLKO TYCH KTÓRE ZAWIEJAJA JAKAS LISTE
    public ArrayList<String> storageUnits(){
        ArrayList<String> listNoEmptyKeys = new ArrayList<>();//tworze tymczasowa liste
        for(String key : this.storage.keySet()){// przelatuje przez liste kluczy
            if(!this.storage.get(key).isEmpty()){//jezeli nie jest pusty
                listNoEmptyKeys.add(key);//dodaje do tymczasowej listy
            }
        }
        return listNoEmptyKeys;// zwracam ta liste
    }
}
