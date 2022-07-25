package ex9_12;
//TA KLASA TEZ DZIEDZICZY ANIMAL
public class Cat implements NoiseCapable{

    private String animalName;

    public Cat(String animalName) {
        this.animalName = animalName;
    }

    public Cat(){
        this.animalName = "Cat";
    }

    public void purr(){
        System.out.println(this.animalName + " purrs");
    }


//    public void eat(){
//        System.out.println(this.animalName + " eats");
//    }
//
//    public void sleep(){
//        System.out.println(this.animalName + " sleeps");
//    }

    @Override
    public void makeNoise() {
        System.out.println(this.animalName + " purrs");
    }
}
