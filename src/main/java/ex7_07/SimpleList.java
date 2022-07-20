package ex7_07;

import java.util.ArrayList;

public class SimpleList {

    private ArrayList<String> list;

    public SimpleList() {
        this.list = new ArrayList<>();
    }

    public void addToList (String string){
        this.list.add(string);
    }
    public ArrayList<String> getList (){
        return this.list;
    }

    public void printList (){
        for(String position : this.list){
            System.out.println(position);
        }
    }

    public int getListSize(){
        return this.list.size();
    }

    public String getFromIndex(int index){
        return this.list.get(index);
    }

    public int howMuchEmptyRows(){
        int counter = 0;
        for(String position : this.list){
            if(position.isBlank()){
                counter++;
            }
        }
        return counter;
    }

    public void clearList () {
        this.list.clear();
    }


}

