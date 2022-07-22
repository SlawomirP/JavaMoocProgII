package ex9_02;
//TA KLASA TEZ BEDZIE DZIEDZICZYLA PO PERSON
public class Teacher extends Person{

    private int salary;

    public Teacher (String nameSurname, String adress, int salary){
        super(nameSurname, adress);
        this.salary = salary;
    }

    //NADPISUJE TOSTRING ABY WYSWIETLAL PRAWIDLOWY KOMUNIKAT
    @Override
    public String toString (){
        return super.toString() + "\n" + "\t" + "salary " + this.salary +
        " euro/month";
    }
}
