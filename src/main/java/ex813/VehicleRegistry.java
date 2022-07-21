package ex813;

import java.util.ArrayList;
import java.util.HashMap;

public class VehicleRegistry {


    private HashMap<LicensePlate, String> platesOwners;

    public VehicleRegistry(){
        this.platesOwners = new HashMap<>();
    }
    //DODAJE DO HASHMAPY OBIEKT-KLUCZ I WARTOSC STRING, JEZELI STRING PUSTY TO NIE DODA
    public boolean add(LicensePlate licensePlate, String owner){
        if(platesOwners.containsKey(licensePlate) && platesOwners.containsValue(owner)){
            return false;
        }
        if(owner != null && !platesOwners.containsKey(licensePlate)){
            platesOwners.put(licensePlate, owner);
            return true;
        }
        return false;
    }
    //ZWRACA WARTOSC(string) Z POD KLUCZA KTORY JEST OBIEKTEM
    public String get (LicensePlate licensePlate){
        if (platesOwners.containsKey(licensePlate)){
            return platesOwners.get(licensePlate);
        }
        return null;
    }

    //USUWA Z HASHMAPY POLE Z PODANYM KLUCZEM O ILE ZNAJDUJE SIE W HASHMAPIE
    public boolean remove (LicensePlate licensePlate){
        if (this.platesOwners.containsKey(licensePlate)){
            this.platesOwners.remove(licensePlate);
            return true;
        }
        return false;
    }
    // WYSWIETLENIE WSZYSTKICH KLUCZY - W TYM PRZYPADKU SA TO OBIEKTY
    public void printLicensePlates (){
        for(LicensePlate plate : this.platesOwners.keySet()){
            System.out.println(plate);
        }
    }
    //WYSWIETLA WSZYSTKIE WARTOSCI Z HASHMAPY, WYSWIETLA RAZ MIMO ZE MOGA SIE POWTARZAC
    public void printOwners (){
        ArrayList<String> printedOwners = new ArrayList<>();
        for(String plate : platesOwners.values()){
            if(!printedOwners.contains(plate)){
                System.out.println(plate);
                printedOwners.add(plate);
            }
        }
    }

}
