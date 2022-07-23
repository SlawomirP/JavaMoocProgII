package ex9_05;

public class TripleTacoBox implements TacoBox{

    //TWORZE ZMIENNA OBIEKTOWA KTORA W MOMENCIE WYWOLANIA
    //KONSTRUKTORA USTAWI SIE NA 3
    private int tacos;

    public TripleTacoBox(){
        this.tacos = 3;
    }

    @Override
    public int tacosRemaining() {
        return this.tacos;
    }

    @Override
    public void eat() {
        if(this.tacos > 0){
            this.tacos --;
        }
    }
}
