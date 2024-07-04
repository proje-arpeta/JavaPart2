package university;

public class UniversityManagement {
    public static void main(String[] args) {
        Student student = new Student("Alice", 20, "Computer Science");
        Professor professor = new Professor("Dr. Smith", 45, "Engineering");

        student.introduce();
        student.study();

        professor.introduce();
        professor.teach();
    }
}
