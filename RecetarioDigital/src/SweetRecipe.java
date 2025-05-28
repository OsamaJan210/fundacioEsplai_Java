public class SweetRecipe extends Recipe {
    SweetRecipe(String name) {
        super(name);
    }

    @Override
    String getDescription() {
        return "Sweet recipe: " + name + " with " + ingredients.size() + " ingredients.";
    }
}
