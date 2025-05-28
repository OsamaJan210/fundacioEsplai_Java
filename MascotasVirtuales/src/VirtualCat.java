public class VirtualCat extends VirtualPet {
    VirtualCat(String name) {
        super(name);
    }

    @Override
    void eat() {
        energy += 20;
        System.out.println(name + " ate and recovered a lot of energy.");
    }
}
