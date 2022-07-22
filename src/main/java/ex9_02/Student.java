package ex9_02;
// TA KLASA BEDZIE DZIEDZICZYLA PO KLASIE PERSON
public class Student extends Person {

    private int credit;

    //TWORZE KONSTRUKTOR KTORY WYWOLUJE KOSTRUKTOR Z KLASY NADRZEDNEJ I
    // DODAJE SWOJE POLE
    public Student(String nameAndSurname, String adress) {
        super(nameAndSurname, adress);
        this.credit = 0;
    }

    //METODA KTORA ZWROCI AKTUALNY STAN POLA CREDIT
    public int credits (){
        return this.credit;
    }
    //METODA KTORA ODBIJE CREDIT O 1
    public void study(){
        this.credit++;
    }

    //NADPISZE toSTRING DO INNEGO WYSWIETLANIA NIZ W SUPERCLASS
    @Override
    public String toString(){
        return super.toString() + "\n" +
                "Study credits " + credits();
    }
}
