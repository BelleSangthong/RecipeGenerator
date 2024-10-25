import java.util.ArrayList;
import java.util.List;

public class Mealtype {
    private String mealName;
    private List<Recipe> recipes;

    public Mealtype(String mealName) {
        this.mealName = mealName;
        this.recipes = new ArrayList<>();
    }

    public void addRecipe(Recipe recipe) {
        recipes.add(recipe);
    }

    public void removeRecipe(String title) {
        recipes.removeIf(recipe -> recipe.getTitle().equals(title));
    }

    public List<Recipe> getRecipes() {
        return recipes;
    }
}

