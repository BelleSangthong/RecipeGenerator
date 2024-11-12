import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class RecipeManagementTest {

    // TODO: Write a test case to test the addRecipe method
    @Test
    public void testAddRecipe() {
        RecipeManager manager = new RecipeManager();
        Recipe recipe = new Recipe("Yogurt Parfait",
                "Layer the yogurt, granola, and fresh fruit in a cup");
        recipe.addIngredient(new Ingredients("1 cup", "yogurt"));
        recipe.addIngredient(new Ingredients("1/2 cup", "granola"));
        recipe.addIngredient(new Ingredients("1/2 cup", "fresh fruit"));

        Category<Recipe> breakfast = manager.getCategory("breakfast");
        breakfast.addItem(recipe);

        assertEquals(1, breakfast.getRecipe().size());
        assertEquals("Yogurt Parfait", breakfast.getRecipe().get(0).getTitle());
    }

    //TODO: Write a test case to test the removeRecipe method
    @Test
    public void testRemoveRecipe() {
        RecipeManager manager = new RecipeManager();
        Recipe recipe = new Recipe("Yogurt Parfait",
                "Layer the yogurt, granola, and fresh fruit in a cup");

        Category<Recipe> breakfast = manager.getCategory("breakfast");
        breakfast.addItem(recipe);
        breakfast.removeItem("Yogurt Parfait");

        assertEquals(0, breakfast.getRecipe().size());
    }

    // TODO: Write a test case to test the showAllRecipes method
    @Test
    public void testShowAllRecipes() {
        RecipeManager manager = new RecipeManager();
        Recipe recipe = new Recipe("Yogurt Parfait",
                "Layer the yogurt, granola, and fresh fruit in a cup");
        recipe.addIngredient(new Ingredients("1 cup", "yogurt"));
        recipe.addIngredient(new Ingredients("1/2 cup", "granola"));
        recipe.addIngredient(new Ingredients("1/2 cup", "fresh fruit"));

        Category<Recipe> breakfast = manager.getCategory("breakfast");
        breakfast.addItem(recipe);

        Recipe addedRecipe = breakfast.getRecipe().get(0);

        assertEquals("Yogurt Parfait", addedRecipe.getTitle());
        assertEquals("Layer the yogurt, granola, and fresh fruit in a cup", addedRecipe.getInstructions());
        assertEquals(3, addedRecipe.getIngredients().size());
        assertEquals("yogurt of 1 cup", addedRecipe.getIngredients().get(0).toString());
        assertEquals("granola of 1/2 cup", addedRecipe.getIngredients().get(1).toString());
        assertEquals("fresh fruit of 1/2 cup", addedRecipe.getIngredients().get(2).toString());
    }
}