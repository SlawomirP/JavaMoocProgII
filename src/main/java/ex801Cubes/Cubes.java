package ex801Cubes;

import java.util.Scanner;

public class Cubes {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {

            String command = scanner.nextLine();

            if (!command.equals("end")) {
                int number = Integer.parseInt(command);
                System.out.println(number * number * number);
            } else {
                break;
            }
        }
    }
}