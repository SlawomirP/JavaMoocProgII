package ex9_12;
//TA KLASA BEDZIE DZIEDZICZYLA PO KLASIE ANIMAL
public class Dog implements NoiseCapable {

    private String animalName;

    public Dog(String animalName) {
        this.animalName = animalName;
    }

    public Dog() {
        this.animalName = "Dog";
    }

//    public String getName(){
//        return this.animalName;
//    }

    public void bark(){
        System.out.println(this.animalName + " barks");
    }
    //NADPISANE METODY EAT AND SLEEP

//    public void eat(){
//        System.out.println(this.animalName + " eats");
//    }
//
//    public void sleep(){
//        System.out.println(this.animalName + " sleeps");
//    }

    @Override
    public void makeNoise() {
        System.out.println(this.animalName + " barks");
    }
}
