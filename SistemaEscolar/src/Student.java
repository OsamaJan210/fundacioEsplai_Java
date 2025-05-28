public class Student extends Person {
    String grade;

    Student(String name, int age, String grade) {
        super(name, age);
        this.grade = grade;
    }

    String getInfo() {
        return name + " (Age: " + age + ", Grade: " + grade + ")";
    }
}
