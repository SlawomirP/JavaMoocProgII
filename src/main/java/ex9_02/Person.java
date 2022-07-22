package ex9_02;
//STWORZENIE OGOLNEJ KLASY PERSON
public class Person {

    private String nameAndSurname;
    private String adress;

    public Person(String nameAndSurname, String adress) {
        this.nameAndSurname = nameAndSurname;
        this.adress = adress;
    }

    //NADPISUJE METODE, TAB DODAJE PRZEZ SKRÓT \T
    @Override
    public String toString (){
        return this.nameAndSurname + "\n" + "\t" + this.adress;
    }
}
