import java.util.ArrayList;
import java.util.List;

public abstract class Category<T> {
    protected String name;
    protected List<T> recipe;

    public Category(String name) {
        this.name = name;
        this.recipe = new ArrayList<>();
    }

    public void addItem(T item) {
        this.recipe.add(item);
    }

    public void removeItem(String title) {
        recipe.removeIf(item -> ((Recipe) item).getTitle().equals(title));
    }

    public String getName() {
        return name;
    }

    public List<T> getRecipe() {
        return recipe;
    }

    public void showAllItems() {
        System.out.println(name + " Recipes:");
        for (T item : recipe) {
            System.out.println(item);
            System.out.println();
        }
    }
}