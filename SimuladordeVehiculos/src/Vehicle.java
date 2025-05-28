public class Vehicle {
    String brand;
    int year;

    Vehicle(String brand, int year) {
        this.brand = brand;
        this.year = year;
    }

    void start() {
        System.out.println("Starting vehicle...");
    }

    void stop() {
        System.out.println("Stopping vehicle...");
    }
}
