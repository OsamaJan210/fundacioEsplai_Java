//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args){
        Book book = new Book();

    SweetRecipe cake = new SweetRecipe("Chocolate Cake");
        cake.addIngredient(new Ingredient("Flour", 200, "grams"));
        cake.addIngredient(new Ingredient("Sugar", 100, "grams"));
        cake.addIngredient(new Ingredient("Cocoa Powder", 50, "grams"));
        cake.addStep("Mix all dry ingredients.");
        cake.addStep("Add eggs and mix.");
        cake.addStep("Bake at 180°C for 30 minutes.");

    SavoryRecipe soup = new SavoryRecipe("Chicken Soup");
        soup.addIngredient(new Ingredient("Chicken", 500, "grams"));
        soup.addIngredient(new Ingredient("Carrots", 2, "units"));
        soup.addIngredient(new Ingredient("Water", 1, "liter"));
        soup.addStep("Boil the chicken.");
        soup.addStep("Add vegetables and simmer.");
        soup.addStep("Season to taste.");

        book.addRecipe(cake);
        book.addRecipe(soup);

        System.out.println("Recipe Summary:");
        book.showSummary();

        System.out.println("\nRecipe Details - Chocolate Cake:");
        book.showRecipeDetail("Chocolate Cake");

        System.out.println("\nRecipe Details - Chicken Soup:");
        book.showRecipeDetail("Chicken Soup");
}
}