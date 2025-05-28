import java.util.ArrayList;
import java.util.List;

public class Course {
    String courseName;
    Teacher teacher;
    List<Student> students;

    Course(String courseName, Teacher teacher) {
        this.courseName = courseName;
        this.teacher = teacher;
        this.students = new ArrayList<>();
    }

    void addStudent(Student s) {
        students.add(s);
    }

    void showParticipants() {
        System.out.println("Course: " + courseName);
        System.out.println("Teacher: " + teacher.getInfo());
        System.out.println("Students:");
        for (Student s : students) {
            System.out.println("- " + s.getInfo());
        }
    }
}
