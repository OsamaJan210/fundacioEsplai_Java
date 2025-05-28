public class Bicycle extends Vehicle {
    Bicycle(String brand, int year) {
        super(brand, year);
    }

    @Override
    void start() {
        System.out.println("Doesn't need to start.");
    }
}

