public class Drink {
    String name;
    String size;

    Drink(String name, String size) {
        this.name = name;
        this.size = size;
    }

    String getDescription() {
        return name + " (" + size + ")";
    }
}
