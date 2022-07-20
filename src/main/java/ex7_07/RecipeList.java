package ex7_07;

import java.util.ArrayList;

public class RecipeList {

    private ArrayList<Recipe> recipes;

    public RecipeList() {
        this.recipes = new ArrayList<>();
    }

    public void addRecipeToList(Recipe recipe) {
        this.recipes.add(recipe);
    }

    public ArrayList<Recipe> getRecipesList() {
        return this.recipes;
    }

    public void printRecipesList() {
        for (Recipe recipe : this.recipes) {
            System.out.println(recipe);
        }
    }

}
