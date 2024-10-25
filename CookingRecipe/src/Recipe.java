import java.util.ArrayList;
import java.util.List;

public class Recipe {
    private String title;
    private List<Ingredients> ingredients;
    private String instructions;

    //Konstruktor
    public Recipe(String title, String instructions) {
        this.title = title;
        this.ingredients = new ArrayList<>();
        this.instructions = instructions;
    }

    public void addIngredient(Ingredients ingredient) {
        this.ingredients.add(ingredient);
    }

    public String getInstructions() {
        return instructions;
    }

    public List<Ingredients> getIngredients() {
        return ingredients;
    }





    public String getTitle() {
        return title;
    }
}
