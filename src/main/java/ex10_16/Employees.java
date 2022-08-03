package ex10_16;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Employees {

    List<Person> persons;

    public Employees() {
        this.persons = new ArrayList<>();
    }

    //TWORZE METODE DODAJACA DO LISTY OBIEKTY TYPU PERSON
    public void add(Person personToAdd) {
        this.persons.add(personToAdd);
    }

    //METODA KTORA DODA JUZ ISTNIEJACA LISTE OBIEKTOW TYPU PERSON
    //DO NASZEJ LISTY PERSON
    public void add(List<Person> peopleToAdd) {
        this.persons.addAll(peopleToAdd);
    }

    //WYSWIETLENIE CALEJ LISTY PERSON
    public void print() {
//        persons.stream()
//                //drukuje stream
//                .forEach(person-> System.out.println(person));
        //na iteratorze
        Iterator<Person> iterator = this.persons.iterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
    //WYSWIETLI WSZYSTKICH Z TYTULEM PODANYM W PARAMETRZE
    public void print(Education education) {
//        persons.stream()
//                //wyciaga osoby ktorych enum jest rowny temu w parametrze
//                .filter(person -> person.getEducation().equals(education))
//                //przelatuje przez to co zostalo w steamie i drukuje to
//                .forEach(person -> System.out.println(person));
        //na iteratorze,, ITERATOR NA KLASIE PERSON ITERUJE LISTE
        //PERSONS
        Iterator<Person> iterator = this.persons.iterator();
        // DOPOKI MA NASTEPNA LINIE
        while (iterator.hasNext()) {
            //POD WARUNKIEM ZE LINIJKA ZAWIERA TAKI SAM TYTUL JAK
            //TEN W PARAMETRZE TO JA WYPISZ
            // musze stworzyc obiekt person i przypisac pod niego odczytana linie
            // inaczej wychodzi osoba z innym tytulem i blad
            Person person = iterator.next();
            if (person.getEducation() == education) {
                System.out.println(person);
            }
        }
    }
    //METODA KTORA USUNIE OBIEKTY Z LISTY KTORYCH TYTULY BEDA ZGADZAC
    //SIE Z TYMI Z PARAMETRU, tez na iteratorze, nie mozna na strimie
    // bo w stimie nie mozna zrobic modyfikacji listy
    public void fire(Education education) {
        Iterator<Person> iterator = this.persons.iterator();

        while (iterator.hasNext()) {
            if (iterator.next().getEducation() == education) {
                //linijka zostaje usunieta jezeli warunek jest true
                iterator.remove();
            }
        }
    }
}
