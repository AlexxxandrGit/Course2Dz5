package product;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class RecipeList {
    private Set<Recipe> recipes;

    public RecipeList(Set<Recipe> recipes) {
        this.recipes = recipes;
    }

    public void add(Recipe recipe) {
        if (recipes.contains(recipes)) {
            throw new IllegalArgumentException("Такой рецепт уже есть");
        }
    }

    public void remove(Recipe recipe) {
        recipes.remove(recipes);
    }

    @Override
    public String toString() {
        return "RecipeList{" +
                "recipes=" + recipes +
                '}';
    }


}