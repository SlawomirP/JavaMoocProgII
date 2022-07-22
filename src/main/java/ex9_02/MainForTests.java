package ex9_02;

import java.util.ArrayList;

//KLASA MAIN WYKORZYSTUJACA POPRZEDNIE KLASY
public class MainForTests {
    public static void main(String[] args) {

//        ArrayList<Person> persons = new ArrayList<Person>();
//        persons.add(new Teacher("Ada Lovelace", "24 Maddox St. London W1S 2QN", 1200));
//        persons.add(new Student("Ollie", "6381 Hollywood Blvd. Los Angeles 90028"));
//
//        printPersons(persons);

//        Student test = new Student("Ollie", "6381 Hollywood Blvd. Los Angeles 90028");

        Counter counter = new Counter();
        Counter superCounter = new SuperCounter();
        int number = 3;
        number = superCounter.subtractFromNumber(number);
        number = superCounter.subtractFromNumber(number);
        number = counter.addToNumber(number);
        System.out.println(number);





    }

    //METODA KTORA wyswietli wszystkie obiekty z listy w parametrze
    public static void printPersons(ArrayList<Person> persons) {
        for (Person person : persons) {
            System.out.println(person);
        }
    }


}
