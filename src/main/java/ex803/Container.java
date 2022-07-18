package ex803;

public class Container {

    private int capacity;

    public Container (){
        this.capacity = 0;
    }

    public int getCapacity() {
        return capacity;
    }

    public void add (int amount){
        if(amount > 0){
            if (amount + this.capacity > 100){
                this.capacity = 100;
            }
            if (amount + this.capacity <= 100){
                this.capacity += amount;
            }
        }
    }

    public void remove (int amount) {
        if (amount > 0){
            if (this.capacity - amount < 0){
                this.capacity = 0;
            }
            if (this.capacity - amount >= 0){
                this.capacity -= amount;
            }
        }
    }

    public String toString(){
        return this.capacity + "/100";
    }
}
