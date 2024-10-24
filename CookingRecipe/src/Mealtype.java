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
        this.recipes.add(recipe);
    }
}

