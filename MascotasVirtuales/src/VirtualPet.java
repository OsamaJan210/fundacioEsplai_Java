public class VirtualPet {
    String name;
    int energy;
    int happiness;

    VirtualPet(String name) {
        this.name = name;
        this.energy = 50;
        this.happiness = 50;
    }

    void eat() {
        energy += 10;
        System.out.println(name + " ate and gained energy.");
    }

    void play() {
        energy -= 10;
        happiness += 10;
        System.out.println(name + " played and became happier.");
    }

    void showStatus() {
        System.out.println(name + " - Energy: " + energy + ", Happiness: " + happiness);
    }
}
