package ex7_07;

import java.util.ArrayList;

public class Recipe {

    private String name;
    private int cookingTime;
    private ArrayList<String> ingredients;

    public Recipe(String name, int cookingTime, ArrayList<String> ingredients) {
        this.name = name;
        this.cookingTime = cookingTime;
        this.ingredients = ingredients;
    }

    public Recipe(String name, int cookingTime) {
        this.name = name;
        this.cookingTime = cookingTime;
    }

    public String getName() {
        return name;
    }

    public int getCookingTime() {
        return cookingTime;
    }

    public ArrayList<String> getIngredientsList() {
        return this.ingredients;
    }

    public void addToIngredients(String ingredients) {
        this.ingredients.add(ingredients);
    }

    public boolean isContainsIngredient(String ingredient) {
        return this.ingredients.contains(ingredient);
    }

    public void printIngredientsList() {
        for (String ingredient : this.ingredients) {
            System.out.println(ingredient);
        }
    }

    public String getIngedient(int position) {
        return this.ingredients.get(position);
    }

    public String toString() {
        return this.name + ", cooking time: " + this.cookingTime;
    }
}
