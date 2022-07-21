package ex813;

import java.util.ArrayList;
import java.util.HashMap;

public class MainLicence {
    public static void main(String[] args) {
        // the following is the same sample program shown in ex 8.13 description
// TWORZYMY OBIEKTY KLASY LICENCEPLATE

        LicensePlate li1 = new LicensePlate("FI", "ABC-123");
        LicensePlate li2 = new LicensePlate("FI", "UXE-465");
        LicensePlate li3 = new LicensePlate("D", "B WQ-431");
//TWORZYMY LISTE I DODAJEMY 2 PIERWSZE OBIEKTY

        ArrayList<LicensePlate> finnishPlates = new ArrayList<>();
        finnishPlates.add(li1);
        finnishPlates.add(li2);

//TWORZYMY KOLEJNY OBIEKT KLASY LECENCEPLATE Z DANYMI KTORE POWTARZAJA SIE W INNYM OBIEKCIE
        LicensePlate newLi = new LicensePlate("FI", "ABC-123");

        //TEN WARUNEK POWINIEN SPRAWDZIC CZY OBIEKT NIE JEST TAKI SAM JAK W LISCIE
        //ALE NALEZY NAPISAC MU JAK MA QYGLADAC EQUALS I ROZSZERZYC HASHCODE
        if (!finnishPlates.contains(newLi)) {
            finnishPlates.add(newLi);
        }
        System.out.println("finnish: " + finnishPlates);

        // if the equals-method hasn't been overwritten, the same license number will be added to the list againg
// WSTAWIAMY OBIEKT JAKO KLUCZ DO HASHMAPY
        HashMap<LicensePlate, String> owners = new HashMap<>();
        owners.put(li1, "Arto");
        owners.put(li3, "Jürgen");

        System.out.println("omistajat:");
        System.out.println(owners.get(new LicensePlate("FI", "ABC-123")));
        System.out.println(owners.get(new LicensePlate("D", "B WQ-431")));
        // if the hasCode-method hasn't been overwritten, the owners won't be found
    }
}
