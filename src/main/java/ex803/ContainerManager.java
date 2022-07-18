package ex803;

import java.util.Scanner;

public class ContainerManager {

    private Container first;
    private Container second;
    Scanner scanner;

    public ContainerManager() {
        this.first = new Container();
        this.second = new Container();
        this.scanner = new Scanner(System.in);
    }

    public void start() {

        while (true) {
            System.out.println("First: " + first + "\n"
                    + "Second: " + second);

            String userText = scanner.nextLine();
            if(userText.equals("quit")){
                break;
            }

            String [] temp = userText.split(" ");
            String command = temp[0];
            int value = Integer.parseInt(temp[1]);

            if(command.equals("add")){
                first.add(value);
            }

            if(command.equals("move")){
                if(value > first.getCapacity() && first.getCapacity() != 0){
                    second.add(first.getCapacity());
                }
                if (value <= first.getCapacity() && first.getCapacity() != 0){
                    second.add(value);
                }
                first.remove(value);

            }

            if (command.equals("remove")){
                second.remove(value);
            }


        }
    }
}
