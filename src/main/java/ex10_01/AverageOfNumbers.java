package ex10_01;

import java.util.ArrayList;
import java.util.Scanner;

public class AverageOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<>();


        System.out.println("Input numbers, type \"end\" to stop.");
        while (true) {

            String userInput = scanner.nextLine();

            if (userInput.equals("end")) {
                break;
            }

            list.add(userInput);
        }

        double averageNumbersaverageOfNumbers = list.stream()
                .mapToInt(values -> Integer.valueOf(values))
                .average()
                .getAsDouble();

        System.out.println(averageNumbersaverageOfNumbers);
    }
}