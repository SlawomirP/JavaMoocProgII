package lbmd;

public class Main {
    public static void main(String[] args) {

        Cat myCat = new Cat();

//        myCat.print();

        printThing(myCat);
    }

    static void printThing (Printable thing){
        thing.print();
    }
}
