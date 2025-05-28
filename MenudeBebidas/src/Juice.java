public class Juice extends Drink {
    String fruit;

    Juice(String name, String size, String fruit) {
        super(name, size);
        this.fruit = fruit;
    }

    @Override
    String getDescription() {
        return name + " (" + size + ") - Fruit: " + fruit;
    }
}
