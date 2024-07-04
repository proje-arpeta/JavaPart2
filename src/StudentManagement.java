import java.util.ArrayList;
import java.util.List;

public class StudentManagement {
    private List<Student> students;

    public StudentManagement() {
        this.students = new ArrayList<>();
    }

    public void addStudent(Student student) {
        students.add(student);
        System.out.println(student.getName() + " öğrenci eklendi.");
    }

    public void removeStudent(String id) {
        Student toRemove = null;
        for (Student student : students) {
            if (student.getId().equals(id)) {
                toRemove = student;
                break;
            }
        }
        if (toRemove != null) {
            students.remove(toRemove);
            System.out.println(toRemove.getName() + " öğrenci çıkarıldı.");
        } else {
            System.out.println("Öğrenci bulunamadı.");
        }
    }

    public void listStudents() {
        if (students.isEmpty()) {
            System.out.println("Öğrenci listesi boş.");
        } else {
            System.out.println("Öğrenciler:");
            for (Student student : students) {
                System.out.println("- " + student.getName() + " (" + student.getId() + ")");
            }
        }
    }
}
