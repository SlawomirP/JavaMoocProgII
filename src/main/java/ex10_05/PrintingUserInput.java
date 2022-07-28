package ex10_05;

import java.util.ArrayList;
import java.util.Scanner;

public class PrintingUserInput {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> wordsFromUser = new ArrayList<>();

        System.out.println("Write your text... and press Enter.");

        while (true) {
            String userWord = scanner.nextLine();

            if (userWord.equals("")) {
                break;
            }

            wordsFromUser.add(userWord);

        }

        wordsFromUser.stream()
                .forEach(word -> System.out.println(word));
    }
}
