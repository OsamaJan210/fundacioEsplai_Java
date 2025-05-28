import java.util.ArrayList;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        List<Animal> zoo = new ArrayList<>();

        // Adding animals
        zoo.add(new Dog("Rex", 5));
        zoo.add(new Cat("Whiskers", 3));
        zoo.add(new Bird("Tweety", 2));
        zoo.add(new Dog("Buddy", 4));
        zoo.add(new Cat("Luna", 1));

        // Making all animals sound
        for (Animal animal : zoo) {
            System.out.print(animal.name + " speaks: ");
            animal.makeSound();
        }
    }
}