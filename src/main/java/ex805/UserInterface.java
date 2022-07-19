package ex805;

import java.util.ArrayList;
import java.util.Scanner;

public class UserInterface {

    private TodoList list;
    private Scanner sc;

    public UserInterface() {
        this.list = new TodoList();
        this.sc = new Scanner(System.in);
    }

    public void start(){
        while(true){

            System.out.println("Command:");
            String command = sc.nextLine();

            if(command.equals("stop")){
                break;
            }

            if(command.equals("add")){
                System.out.println("To add:");
                String toAdd = sc.nextLine();
                list.addToList(toAdd);
            }

            if(command.equals("list")){
                list.print();
            }

            if(command.equals("remove")){
                System.out.println("Which one is removed?");
                int whichNr = Integer.parseInt(sc.nextLine());
                list.remove(whichNr);
            }


        }
    }
}
