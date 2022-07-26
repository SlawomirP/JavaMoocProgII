package ex10_02;


import java.util.ArrayList;
import java.util.Scanner;

public class AverageOfSelectedNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<>();

        System.out.println("Input numbers, type \"end\" to stop.");
        while(true){

            String userInput = scanner.nextLine();

            if (userInput.equals("end")){
                break;
            }

            list.add(userInput);

        }

        double averageOfPositiveNumbers = list.stream()
                //ZAMIENIAM NA INTEGER BO AVERAGE() DZIALA TYLKO NA INTEGER
                .mapToInt(values -> Integer.valueOf(values))
                //FILTRUJE TYLKO DODATNIE
                .filter(values -> values >= 0)
                //WYCIAGAM ŚREDNIA
                .average()
                //SPROWADZAM WYNIK DO DOUBLE
                .getAsDouble();

        double averageOfNegativeNumbers = list.stream()
                .mapToInt(values -> Integer.valueOf(values))
                .filter(values -> values < 0)
                .average()
                .getAsDouble();

        System.out.println("Print the average of the negative numbers" +
                " or the positive numbers? (n/p)");
        String command = scanner.nextLine();

        if (command.equals("n")){
            System.out.println("Average of the negative numbers: " + averageOfNegativeNumbers);
        }
        if (command.equals("p")){
            System.out.println("Average of the positive numbers:" + averageOfPositiveNumbers);
        }
    }
}
