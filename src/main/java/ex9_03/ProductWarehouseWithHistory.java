package ex9_03;

//KLASA TRORA DZIEDZICZY PO KLASIE PRODUCTWAREHOUSE
//TA KLASA BEDZIE MAGAZYNEM PRODUKTOW ALE Z HISTORIA, BEDZIE UZYWALA
//OBIEKTU KLASY CHANGEHISTORY
// WSZEDZIE JEST AKTUALNY STAN DODAWANY DO LISTY
public class ProductWarehouseWithHistory extends ProductWarehouse {

    private double initialBalance;
    private ChangeHistory changeHistory;//REFERENCJA DO OBIEKTU

    public ProductWarehouseWithHistory(String productName, double capacity, double initialBalance) {
        super(productName, capacity); // TE POLA SA Z NADRZEDNEJ KLASY
        this.initialBalance = initialBalance; // TO POLE JEST NOWE
        this.changeHistory = new ChangeHistory(); // TUTAJ UTWORZYLEM OBIEKT
        changeHistory.add(this.initialBalance);
    }

    public String history() {
        return changeHistory.toString();
    }

    //METODA DODAJACA ILOSC DO MAGAZYNU PLUS DODAJE JA DO LISTY HISTORII
    // MUSIALEM TU PODMIENIC POLA BO BALANCE ZOSTALO ZASTAPIONE NA INITIALBALANCE
    //POLE CAPACITY WZIALEM Z KLASY NADRZEDNEJ DLATEGO SUPER
    public void addToWarehouse(double amount) {
        if (amount < 0) {
            return;
        }
        if (amount <= howMuchSpaceLeft()) {
            this.initialBalance = this.initialBalance + amount;
            changeHistory.add(this.initialBalance);
        } else {
            this.initialBalance = super.getCapacity();
            changeHistory.add(this.initialBalance);
        }
    }

    //MUSIALEM NADPISAC TA METODE BO ORYGINALNA POKAZYWALA NIE TEN BALANS
    @Override
    public double getBalance() {
        return this.initialBalance;
    }

    //NADPISALEM METODE ZASTEPUJAC POLA BALANCE NA INITIALBALANCE
    public double takeFromWarehouse(double amount) {
        if (amount < 0) {
            changeHistory.add(0.0);
            return 0.0;
        }
        if (amount > this.initialBalance) {
            double allThatWeCan = this.initialBalance;
            this.initialBalance = 0.0;
            changeHistory.add(this.initialBalance);
            return allThatWeCan;
        }

        this.initialBalance = this.initialBalance - amount;
        changeHistory.add(this.initialBalance);
        return amount;
    }

    public void printAnalysis() {
        System.out.println("Product: " + this.getName() + "\n" + "History: " + changeHistory.toString() + "\n" + "Largest amount of product: " + changeHistory.maxValue() + "\n" + "Smallest amount of product: " + changeHistory.minValue() + "\n" + "Average: " + changeHistory.average());
    }
}
