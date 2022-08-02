package WyrazeniaRegularne;

public class WyrazeniaRegularne {
    public static void main(String[] args) {

        //SPRAWDZENIE CZY CIAG ZNAKOWY SPELNIA WYRAZENIE REGULARNE

        //dowolna ilosc znakow przed a i dowolna ilosc znakow po a
        System.out.println("abbccccdddd11112222".matches(".*a.*"));

        //czy przed a znajduje sie dowolny znak conajmniej raz
        System.out.println("abbccccdddd11112222".matches(".+a.*"));

        //czy w ciagu znajduje sie liczba
        System.out.println("abbccccdddd11112222".matches(".+\\d.*"));

        //czy liczba wystepuje okreslona ilosc razy
        System.out.println("abbccccdddd11112222".matches(".*\\d{8}.*"));
    }
}
