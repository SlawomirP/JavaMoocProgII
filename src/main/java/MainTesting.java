import ex810.IOU;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class MainTesting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> inputs = new ArrayList<>();

// reading inputs
        while (true) {
            String row = scanner.nextLine();
            if (row.equals("end")) {
                break;
            }

            inputs.add(row);
        }

// counting the number of values divisible by three
        long numbersDivisibleByThree = inputs.stream()
                .mapToInt(s -> Integer.valueOf(s))
                .filter(number -> number % 3 == 0)
                .count();

// working out the average
        double average = inputs.stream()
                .mapToInt(s -> Integer.valueOf(s))
                .average()
                .getAsDouble();

// printing out the statistics
        System.out.println("Divisible by three " + numbersDivisibleByThree);
        System.out.println("Average number: " + average);
    }
}
