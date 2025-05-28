//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Teacher teacher = new Teacher("Ms. Sara Victor Fernandez", 30, "JAVA");

        Student s1 = new Student("OSama", 25, "16th");
        Student s2 = new Student("Bob", 15, "9th");
        Student s3 = new Student("Charlie", 14, "8th");

        Course javaCourse = new Course("Full Stack Java", teacher);
        javaCourse.addStudent(s1);
        javaCourse.addStudent(s2);
        javaCourse.addStudent(s3);

        javaCourse.showParticipants();

    }
}