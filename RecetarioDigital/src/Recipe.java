import java.util.ArrayList;
import java.util.List;

public  abstract  class Recipe{
    String name;
    List<Ingredient> ingredients = new ArrayList<>();
    List<String> steps = new ArrayList<>();

    Recipe(String name) {
        this.name = name;
    }

    void addIngredient(Ingredient ingredient) {
        ingredients.add(ingredient);
    }

    void addStep(String step) {
        steps.add(step);
    }

    abstract String getDescription();

    void showDetails() {
        System.out.println("Name: " + name);
        System.out.println("Type: " + this.getClass().getSimpleName());
        System.out.println("Ingredients:");
        for (Ingredient ing : ingredients) {
            System.out.println(" -> " + ing);
        }
        System.out.println("Steps:");
        for (int i = 0; i < steps.size(); i++) {
            System.out.println((i + 1) + ". " + steps.get(i));
        }
    }
}

