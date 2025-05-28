public class SavoryRecipe extends Recipe {
    SavoryRecipe(String name) {
        super(name);
    }

    @Override
    String getDescription() {
        return "Savory recipe: " + name + ", includes " + ingredients.size() + " ingredients.";
    }
}
