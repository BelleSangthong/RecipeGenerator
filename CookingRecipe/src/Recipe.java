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
}
