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

    public void addRecipeIngredients (String recipeName,String ingredients){
        for(Recipe recipe : recipes){
            if(recipe.getName().equals(recipeName)){
                recipe.addToIngredients(ingredients);
            }
        }
    }

    public void printIngredients(){
        for(Recipe recipe : recipes){
            recipe.printIngredientsList();
        }
    }

    public void printIngedientsFor (String name){
        for(Recipe recipe : recipes){
            if(recipe.getName().equals(name)){
                recipe.printIngredientsList();
            }
        }
    }

}
