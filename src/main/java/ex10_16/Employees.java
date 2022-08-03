package ex10_16;

import java.util.ArrayList;
import java.util.List;

public class Employees {

    List<Person> persons;

    public Employees (){
        this.persons = new ArrayList<>();
    }

    //TWORZE METODE DODAJACA DO LISTY OBIEKTY TYPU PERSON
    public void add (Person personToAdd){
        this.persons.add(personToAdd);
    }

    //METODA KTORA DODA JUZ ISTNIEJACA LISTE OBIEKTOW TYPU PERSON
    //DO NASZEJ LISTY PERSON
    public void add(List<Person> peopleToAdd){
        this.persons.addAll(peopleToAdd);
    }

    //WYSWIETLENIE CALEJ LISTY PERSON
    public void print(){
        persons.stream()
                //drukuje stream
                .forEach(person-> System.out.println(person));
    }

    //WYSWIETLI WSZYSTKICH Z TYTULEM PODANYM W PARAMETRZE
    public void print (Education education){
        persons.stream()
                //wyciaga osoby ktorych enum jest rowny temu w parametrze
                .filter(person -> person.getEducation().equals(education))
                //przelatuje przez to co zostalo w steamie i drukuje to
                .forEach(person -> System.out.println(person));
    }
}
