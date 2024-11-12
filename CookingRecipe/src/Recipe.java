import java.util.ArrayList;
import java.util.List;

public class Recipe {
    private String title;
    private List<Ingredients> ingredients;
    private String instructions;

    public Recipe(String title, String instructions) {
        this.title = title;
        this.ingredients = new ArrayList<>();
        this.instructions = instructions;
    }

    public String getTitle() {
        return title;
    }

    public void addIngredient(Ingredients ingredient) {
        ingredients.add(ingredient);
    }

    public List<Ingredients> getIngredients() {
        return ingredients;
    }

    public String getInstructions() {
        return instructions;
    }

    @Override
    public String toString() {
        return "Recipe name: " + title + "\nIngredients: " + ingredients + "\nInstructions: " + instructions;
    }
}
