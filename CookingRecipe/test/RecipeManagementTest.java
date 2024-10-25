import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class RecipeManagementTest {

    //TODO Make a test when a recipe added
    @Test
    public void testAddRecipe() {
        RecipeManager manager = new RecipeManager();
        Recipe recipe = new Recipe("Yogurt Parfait",
                                "Layer the yogurt, granola, and fresh fruit in a cup");
        recipe.addIngredient(new Ingredients("1 cup", "yogurt"));
        recipe.addIngredient(new Ingredients("1/2 cup", "granola"));
        recipe.addIngredient(new Ingredients("1/2 cup", "fresh fruit"));

        manager.getBreakfast().addRecipe(recipe);

        assertEquals(1, manager.getBreakfast().getRecipes().size());
        assertEquals("Yogurt Parfait", manager.getBreakfast().getRecipes().get(0).getTitle());
    }

    //TODO: Make a test when a recipe removed
    public void testRemoveRecipe() {
        RecipeManager manager = new RecipeManager();
        Recipe recipe = new Recipe("Yogurt Parfait",
                "Layer the yogurt, granola, and fresh fruit in a cup");

        manager.getBreakfast().addRecipe(recipe);
        manager.getBreakfast().removeRecipe("Yogurt Parfait");

        assertEquals(0, manager.getBreakfast().getRecipes().size());
    }

    //TODO: Make a test to show all recipes
    public void testShowAllRecipes() {
        RecipeManager manager = new RecipeManager();
        Recipe recipe = new Recipe("Yogurt Parfait",
                "Layer the yogurt, granola, and fresh fruit in a cup");
        recipe.addIngredient(new Ingredients("1 cup", "yogurt"));
        recipe.addIngredient(new Ingredients("1/2 cup", "granola"));
        recipe.addIngredient(new Ingredients("1/2 cup", "fresh fruit"));

        manager.getBreakfast().addRecipe(recipe);

        Recipe addedRecipe = manager.getBreakfast().getRecipes().get(0);

        assertEquals("Yogurt Parfait", addedRecipe.getTitle());
        assertEquals("Layer the yogurt, granola, and fresh fruit in a cup", addedRecipe.getInstructions());
        assertEquals(3, addedRecipe.getIngredients().size());
        assertEquals("1 cup of yogurt", addedRecipe.getIngredients().get(0).toString());
        assertEquals("1/2 cup of granola", addedRecipe.getIngredients().get(1).toString());
        assertEquals("1/2 cup of fresh fruit", addedRecipe.getIngredients().get(2).toString());
    }
}
