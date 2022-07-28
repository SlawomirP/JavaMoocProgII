package ex10_06;

import java.util.ArrayList;
import java.util.Scanner;

public class LimitedNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> userNumbers = new ArrayList<>();

        System.out.println("Write a number and press Enter");

        while (true) {
            int userNumber = scanner.nextInt();

            if (userNumber < 0) {
                break;
            }

            userNumbers.add(userNumber);
        }

        userNumbers.stream().filter(number -> number >= 1 && number <= 5).forEach(number -> System.out.println(number));
    }
}
