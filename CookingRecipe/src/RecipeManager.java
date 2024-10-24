public class RecipeManager {
    private Mealtype breakfast;
    private Mealtype lunch;
    private Mealtype dinner;

    public RecipeManager() {
        this.breakfast = new Mealtype("Breakfast");
        this.lunch = new Mealtype("Lunch");
        this.dinner = new Mealtype("Dinner");
    }

    public Mealtype getBreakfast() {
        return this.breakfast;
    }

}

