package ex9_03;

//KLASA TWORZĄCA OBIEKT - TU MAGAZYN -- TO PODSTAWOWY SZABLON MAGAZYNU
public class Warehouse {

    private double capacity;
    private double balance;

    //KONSTRUKTOR METODY Z PARAMETREM POJEMNOSC, JEZELI DAM WARTOSC POWYZEJ
    // 0.0 TO UTWORZY TAKI A JEZELI PONIZEJ TO UTWORZY O POJ 0
    //BALANCE TO ILOSC ZAJMOWANEGO MIEJSCA, NA POCZATKU 0
    public Warehouse(double capacity) {
        if (capacity > 0.0) {
            this.capacity = capacity;
        } else {
            this.capacity = 0.0;
        }

        this.balance = 0.0;
    }

    public double getBalance() {
        return this.balance;
    }

    public double getCapacity() {
        return this.capacity;
    }

    // ZWRACA WARTOSC ODPOWIADAJACA MIEJSCU KTORE POZOSTALO
    public double howMuchSpaceLeft() {
        return this.capacity - this.balance;
    }

    //DODAJE DO MAGAZYNU. JEZELI WPROWADZE UJEMNA WARTOSC TO NIC NIE ZROBI
    //JEZELI DODAWANA WARTOSC JEST MNIEJSZA OD ILOSCI WOLNEGO MIEJSCA TO DODA
    // JEZELI NIE TO USTAWI NA MAX POJEMNOSC A RESZTE ODRZUCI
    public void addToWarehouse(double amount) {
        if (amount < 0) {
            return;
        }
        if (amount <= howMuchSpaceLeft()) {
            this.balance = this.balance + amount;
        } else {
            this.balance = this.capacity;
        }
    }

    // ODEJMUJE Z MAGAZYNU, JEZELI ODEJMOWANA WARTOSC JEST MNIEJSZA OD 0 TO ZWRACA 0
    //JEZELI AMOUNT JEST WIEKSZE NIZ STAN ZAJETEGO MIEJSCA TO ZWRACA BALANCE I ZMIENIA JE NA 0
    // ELSE OD BALANCE POPROSTU ODEJMUJE AMOUNT I ZWRACA POMNIEJSZONY BALANCE
    public double takeFromWarehouse(double amount) {
        if (amount < 0) {
            return 0.0;
        }
        if (amount > this.balance) {
            double allThatWeCan = this.balance;
            this.balance = 0.0;
            return allThatWeCan;
        }

        this.balance = this.balance - amount;
        return amount;
    }

    //NADPISANY TOSTRING ZWRACAJACY AKTUALNE ZAPELNIENIE I MIEJSCE KTORE POZOSTALO DO WYKORZYSTANIA
    public String toString() {
        return "balance = " + this.balance + ", space left " + howMuchSpaceLeft();
    }
}