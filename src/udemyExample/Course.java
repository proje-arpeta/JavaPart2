package udemyExample;

import java.util.ArrayList;
import java.util.List;

public class Course {
    private String courseId;
    private  String courseDescription;
    private  String instructorId;
    private List<Student> registeredStudents ;

    public Course(String courseId, String courseDescription, String instructorId){
        this.courseDescription = courseDescription;
        this.courseId = courseId;
        this.instructorId = instructorId;
        registeredStudents = new ArrayList<>();
    }

    public void addStudent(Student student){
        registeredStudents.add(student);
    }
    public void listStudent(){
        System.out.println("Kayıtlı öğrenciler");
        for (Student s: registeredStudents){
            s.displayInfo();
        }
    }

    public void  displaycourse(){
        System.out.println("Course Name" + courseDescription);
    }

}
