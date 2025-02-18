import java.util.ArrayList;
import java.util.List;

public class RecipeManager {
    private List<Category<Recipe>> categories;

    public RecipeManager() {
        categories = new ArrayList<>();
        categories.add(new Mealtype("Breakfast"));
        categories.add(new Mealtype("Lunch"));
        categories.add(new Mealtype("Dinner"));
    }

    public Category<Recipe> getCategory(String name) {
        for (Category<Recipe> category : categories) {
            if (category.getName().equalsIgnoreCase(name)) {
                return category;
            }
        }
        return null;
    }

    public void displayAllRecipes() {
        for (Category<Recipe> category : categories) {
            category.showAllItems();
        }
    }
}