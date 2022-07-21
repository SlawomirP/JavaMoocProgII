package ex813;


import java.util.Objects;

public class LicensePlate {
    // don't modify existing parts of this class

    // these instance variables have been defined as final, meaning
    // that once set, their value can't be changed
    private final String liNumber;
    private final String country;

    public LicensePlate(String country, String liNumber) {
        this.liNumber = liNumber;
        this.country = country;
    }

    @Override
    public String toString() {
        return country + " " + liNumber;
    }

    @Override
    public boolean equals(Object object) {
        if (object == null || this.getClass() != object.getClass()) {
            return false;
        }
        if (this == object) {
            return true;
        }

        LicensePlate compareLicence = (LicensePlate) object;
        if (this.liNumber.equals(compareLicence.liNumber) &&
                this.country.equals(compareLicence.country)) {
            return true;
        }

        return false;
    }

    public int hashCode(){
        if(this.liNumber == null){
            return this.country.hashCode();
        }
        return Objects.hashCode(this.liNumber + this.country);
    }

}