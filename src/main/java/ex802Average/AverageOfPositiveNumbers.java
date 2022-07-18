package ex802Average;


import java.util.ArrayList;
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> positiveNumbers = new ArrayList<>();
        int sum = 0;

        while (true) {
            int number = scanner.nextInt();
            if (number == 0) {
                break;
            }
            if (number > 0) {
                positiveNumbers.add(number);
            }
        }
        for (Integer number : positiveNumbers) {
            sum += number;
        }
        if (positiveNumbers.size() != 0){
            System.out.println((double) (sum / positiveNumbers.size()));
        }
    }
}