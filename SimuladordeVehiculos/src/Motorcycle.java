public class Motorcycle extends Vehicle {
    Motorcycle(String brand, int year) {
        super(brand, year);
    }

    @Override
    void start() {
        System.out.println("Motorcycle ready to roll.");
    }
}