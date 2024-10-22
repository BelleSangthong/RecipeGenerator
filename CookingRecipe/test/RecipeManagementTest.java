import org.junit.jupiter.api.Test;

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



    }

}
