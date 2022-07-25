package ex9_11;

//KLASA IMPLEMENTUJE INTERFEJS MOVEABLE
public class Organism implements Moveable {

    //POLA NA OKRESLENIE POZYCJI
    private int x;
    private int y;

    public Organism(int x, int y) {
        this.x = x;
        this.y = y;
    }

    //MODYFIKACJA METODY TOSTRING
    public String toString() {
        return "x: " + this.x + "; y: " + this.y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    //METODA SLUZACA DO PRZESUWANIA PUNKTU
    @Override
    public void move(int dx, int dy) {
        this.x += dx;
        this.y += dy;
    }
}
