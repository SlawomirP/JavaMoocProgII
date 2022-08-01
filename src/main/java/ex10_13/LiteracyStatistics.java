package ex10_13;
//TWORZE KLASE DLA OBIEKTOW W KTORE ZOSTANA WPISANE DANE Z CSV
public class LiteracyStatistics implements Comparable<LiteracyStatistics> {

    private String gender;
    private String country;
    private int year;
    private double amountOfPeople;

    public LiteracyStatistics(String gender, String country, int year, double amountOfPeople) {
        this.gender = gender;
        this.country = country;
        this.year = year;
        this.amountOfPeople = amountOfPeople;
    }

    public String getGender() {
        String gender = this.gender.trim();
        String [] splited = gender.split(" ");
        return splited[0];
    }

    public String getCountry() {
        return this.country.trim();
    }

    public int getYear() {
        return this.year;
    }

    public double getAmountOfPeople() {
        return this.amountOfPeople;
    }
    //NADPISUJE TA METODE ZEBY POKAZYWALA ZGODNY Z WYMAGANIAMI NAPIS
    @Override
    public String toString(){
        return getCountry() + " (" + this.year + "), " + getGender() +
                ", " + this.amountOfPeople;
    }

    //NADPISALEM METODE compareTo ABY POSORTOWALO WEDLUG MOICH WYMAGAN
    //MUSI IMPLEMENTOWAC INTERFEJSC COMPARABLE !!!!!!!!!!!!!!!!!
    @Override
    public int compareTo(LiteracyStatistics o) {
        if (this.amountOfPeople == o.getAmountOfPeople()) {
            return 0;
        } else if (this.amountOfPeople > o.getAmountOfPeople()){
            return 1;
        } else {
            return -1;
        }
    }
}
