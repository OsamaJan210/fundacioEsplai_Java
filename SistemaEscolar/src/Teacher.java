public class Teacher extends Person {
    String specialty;

    Teacher(String name, int age, String specialty) {
        super(name, age);
        this.specialty = specialty;
    }

    String getInfo() {
        return name + " (Age: " + age + ", Specialty: " + specialty + ")";
    }
}

