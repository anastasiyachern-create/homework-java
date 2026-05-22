package Lesson6;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class MainStudents {
    public static void main(String[] args) {

        Set<Student> students = new HashSet<>();
        students.add(new Student(
                "Анна",
                "A1",
                1,
                Arrays.asList(5, 4, 4)
        ));
        students.add(new Student(
                "Иван",
                "A1",
                1,
                Arrays.asList(2, 2, 3)
        ));
        students.add(new Student(
                "Мария",
                "B1",
                2,
                Arrays.asList(5, 5, 5)
        ));
        students.add(new Student(
                "Олег",
                "B1",
                2,
                Arrays.asList(2, 2, 2)
        ));
        System.out.println("До удаления:");
        for (Student student : students) {
            System.out.println(student);
        }
        System.out.println();
        StudentManager.removeBadStudents(students);
        StudentManager.promoteStudents(students);
        System.out.println("После удаления и перевода:");
        for (Student student : students) {
            System.out.println(student);
        }
        System.out.println();
        StudentManager.printStudents(students, 2);
        StudentManager.printStudents(students, 3);
    }
}
