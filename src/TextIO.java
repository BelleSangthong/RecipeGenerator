import java.util.InputMismatchException;
import java.util.Scanner;

public class TextIO {

    public void run () {
        Scanner scanner = new Scanner(System.in);
        RecipeManager recipeManager = new RecipeManager();

        while (true) {
            System.out.println("Choose an option:  " +
                    "\n1) Add Recipe " +
                    "\n2) Remove Recipe " +
                    "\n3) Display Recipes " +
                    "\n4) Exit the program");

            int menuchoices = 0;
            try {
                menuchoices = scanner.nextInt();
                scanner.nextLine();
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a number between 1 and 4.");
                scanner.nextLine();
                continue;
            }

            switch (menuchoices) {
                case 1:
                    System.out.print("Enter meal type (Breakfast, Lunch, Dinner): ");
                    String mealType = scanner.nextLine().toLowerCase();
                    System.out.print("Enter recipe title: ");
                    String title = scanner.nextLine();
                    System.out.print("Enter instructions: ");
                    String instructions = scanner.nextLine();
                    Recipe recipe = new Recipe(title, instructions);

                    System.out.print("How many ingredients? ");
                    int ingredientCount = scanner.nextInt();
                    scanner.nextLine();  // Consume the newline

                    for (int i = 0; i < ingredientCount; i++) {
                        System.out.print("Enter ingredient name: ");
                        String name = scanner.nextLine();
                        System.out.print("Enter ingredient quantity: ");
                        String quantity = scanner.nextLine();
                        recipe.addIngredient(new Ingredients(name, quantity));
                    }

                    Category<Recipe> category = recipeManager.getCategory(mealType);
                    if (category != null) {
                        category.addItem(recipe);
                        System.out.println("Recipe added!\n");
                    } else {
                        System.out.println("Invalid meal type.");
                    }
                    break;

                case 2:
                    System.out.print("Enter meal type to remove from (Breakfast, Lunch, Dinner): ");
                    String removeMealType = scanner.nextLine().toLowerCase();
                    System.out.print("Enter the title of the recipe to remove: ");
                    String removeTitle = scanner.nextLine();

                    Category<Recipe> removeCategory = recipeManager.getCategory(removeMealType);
                    if (removeCategory != null) {
                        removeCategory.removeItem(removeTitle);
                        System.out.println("Recipe removed!\n");
                    } else {
                        System.out.println("Invalid meal type.");
                    }
                    break;

                case 3:
                    recipeManager.displayAllRecipes();
                    break;

                case 4:
                    System.out.println("Exiting...");
                    scanner.close();
                    return;

                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
    }

}

