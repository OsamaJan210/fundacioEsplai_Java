public class VirtualHamster extends VirtualPet {
    VirtualHamster(String name) {
        super(name);
    }

    @Override
    void play() {
        energy -= 20;
        happiness += 10;
        System.out.println(name + " played and got tired quickly.");
    }
}
