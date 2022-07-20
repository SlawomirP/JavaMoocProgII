package ex7_07;

import java.io.IOException;
import java.nio.file.Paths;
import java.util.Scanner;

public class RecipesPanel {

    private RecipeList recipeList;
    private Scanner scanner;
    private SimpleList tempList;

    public RecipesPanel() {
        this.recipeList = new RecipeList();
        this.scanner = new Scanner(System.in);
        this.tempList = new SimpleList();
    }


    public void start() {

        while (true) {


            System.out.println("File to read:");
            String fileName = scanner.nextLine();
//-----------PETLA TWORZY LISTE Z PLIKU
            try {
                Scanner reader = new Scanner(Paths.get(fileName));
                while (reader.hasNextLine()) {
                    tempList.addToList(reader.nextLine());
                }
            } catch (IOException ex) {
                System.out.println("Reader error.");
            }

            tempList.printList();



//-----------
            System.out.println("Commands: \n" + "list - lists the recipes \n" + "stop - stops the program \n");

            System.out.println("Enter command:");
            String command = scanner.nextLine();

            if (command.equals("stop")) {
                break;
            }

            if (command.equals("list")) {

            }


        }
    }
}
