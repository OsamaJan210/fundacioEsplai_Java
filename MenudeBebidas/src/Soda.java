public class Soda extends Drink {
    boolean carbonated;

    Soda(String name, String size, boolean carbonated) {
        super(name, size);
        this.carbonated = carbonated;
    }

    @Override
    String getDescription() {
        return name + " (" + size + ") - Carbonated: " + (carbonated ? "Yes" : "No");
    }
}