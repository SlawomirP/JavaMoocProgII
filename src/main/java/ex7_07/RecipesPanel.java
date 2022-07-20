package ex7_07;

import java.io.IOException;
import java.nio.file.Paths;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Scanner;

public class RecipesPanel {

    private RecipeList recipeList;
    private Scanner scanner;
    private SimpleList tempList;
    private int counter;

    public RecipesPanel() {
        this.recipeList = new RecipeList();
        this.scanner = new Scanner(System.in);
        this.tempList = new SimpleList();
        this.counter = 0;
    }



    public void start() {

        while (true) {

            System.out.println("File to read:");
            String fileName = scanner.nextLine();
//-----------PETLA TWORZY LISTE Z PLIKU
            try {
                Scanner reader = new Scanner(Paths.get(fileName));
                while (reader.hasNextLine()) {
                    String word = reader.nextLine();
                    tempList.addToList(word);
                }
            } catch (IOException ex) {
                System.out.println("Reader error.");
            }

            // PODZIELENIE LISTY I STWORZENIE OBIEKTOW

            SimpleList temporaryForRecipe = new SimpleList();

            for(int j = 0; j <= tempList.howMuchEmptyRows(); j++) {
                for (int i = this.counter; i < tempList.getListSize(); i++) {
                    if (tempList.getFromIndex(i).isBlank()) {
                        counterUp();
                        break;
                    }
                    temporaryForRecipe.addToList(tempList.getFromIndex(i));
                    counterUp();
                }
                recipeList.addRecipeToList(new Recipe(temporaryForRecipe.getFromIndex(0), Integer.valueOf(temporaryForRecipe.getFromIndex(1))));
                temporaryForRecipe.clearList();
            }
            recipeList.printRecipesList();




//-----------ROZDZIELENIE LISTY TEMP NA POSZCZEGOLNE OBIEKTY


//            String text = "";
//            for(String position : tempList.getList()){
//                if(position.isBlank()){
//                    text += "\n";
//                }
//
//                    text += position + " ";
//
//            }
//            System.out.println(text);
//
//            String [] temporary = text.split("\n");
//
//            System.out.println(temporary.length);
//
//            String first = temporary[0];
//            String second = temporary[1];
//            String third = temporary[2];
//
//
//            System.out.println(first);
//            System.out.println(first.split("").length);
//            System.out.println();
//            System.out.println(second);
//            System.out.println();
//            System.out.println(third);

//-----------
//            System.out.println("Commands: \n" + "list - lists the recipes \n" + "stop - stops the program \n");
//
//            System.out.println("Enter command:");
//            String command = scanner.nextLine();
//
//            if (command.equals("stop")) {
//                break;
//            }
//
//            if (command.equals("list")) {
//
//            }


        }
    }
    private void counterUp(){
        this.counter ++;
    }

}
