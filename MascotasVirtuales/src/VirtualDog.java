public class VirtualDog extends VirtualPet {
    VirtualDog(String name) {
        super(name);
    }

    @Override
    void play() {
        energy -= 10;
        happiness += 20;
        System.out.println(name + " played and is super happy!");
    }
}

