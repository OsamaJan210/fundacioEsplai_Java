public class Water extends Drink {
    boolean mineral;

    Water(String name, String size, boolean mineral) {
        super(name, size);
        this.mineral = mineral;
    }

    @Override
    String getDescription() {
        return name + " (" + size + ") - Mineral: " + (mineral ? "Yes" : "No");
    }
}