import java.util.ArrayList;
import java.util.List;

public class Book {
    List<Recipe> recipes = new ArrayList<>();

    void addRecipe(Recipe recipe) {
        recipes.add(recipe);
    }

    void showSummary() {
        for (Recipe r : recipes) {
            System.out.println(r.getDescription());
        }
    }

    void showRecipeDetail(String recipeName) {
        for (Recipe r : recipes) {
            if (r.name.equalsIgnoreCase(recipeName)) {
                r.showDetails();
                return;
            }
        }
        System.out.println("Recipe not found.");
    }
}
