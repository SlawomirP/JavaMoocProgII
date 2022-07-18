package ex803;
import java.util.Scanner;

public class LiquidContainers {

    private Container first;
    private Container second;
    Scanner scanner;

    public LiquidContainers() {
        this.first = new Container();
        this.second = new Container();
        this.scanner = new Scanner(System.in);
    }

    public void start() {

        while (true) {
            System.out.println("First: " + first + "\n"
                    + "Second: " + second);

            String userText = scanner.nextLine();

            String [] temp = userText.split(" ");
            String command = temp[0];
            int value = Integer.parseInt(temp[1]);

            if(command.equals("add")){
                first.add(value);
            }

            if(command.equals("move")){
                first.remove(value);
                if(value >= first.getCapacity()){
                    second.add(first.getCapacity());
                }
                if (value < first.getCapacity()){
                    second.add(value);
                }
            }

            if (command.equals("remove")){
                second.remove(value);
            }


        }
    }
}
