package ex10_11;


public class Human implements Comparable<Human> {

    private int wage;
    private String name;

    public Human(String name, int wage) {
        this.name = name;
        this.wage = wage;
    }

    public String getName() {
        return name;
    }

    public int getWage() {
        return wage;
    }


    @Override
    public String toString() {
        return name + " " + wage;
    }

    //NADPISANIE COMPARABLE WEDLUG WZORU, porownuje 2 obiekty
    //tej samej klasy
    @Override
    public int compareTo(Human compared) {
        // 1 porownanie adresów
        if (this.wage == compared.wage) {
            return 0;
        }
        // 2 sprawdzenie czy this jest wieksze od compared
        else if (this.wage > compared.wage) {
            return -1;
        }
        // 3 jezeli tis mniejsze od compared to da -1
        else {
            return 1;
        }
    }
}
