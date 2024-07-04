package productManagement;

import udemyExmpl.Student;

import java.util.ArrayList;
import java.util.List;

public class Course {
    private  int id;
    private  String name;
    private int instructorId;
    List<Student> registeredStudents;

    public  Course(int id, String name, int instructorId){
        this.id = id;
        this.name = name;
        this.instructorId = instructorId;
        registeredStudents = new ArrayList<>();
    }

    public  void  addStudent(Student student){
        registeredStudents.add(student);
    }

    public  void  removeOgrenci(int index){
        registeredStudents.remove(index);
    }

    public  void  displayInfo(){
        System.out.println("Kurs => " + name );
        System.out.println("Eğitmen => " + instructorId );
        System.out.println("Kayıtlı Öğrecniler");
        for (Student s: registeredStudents){
            s.displayInfo();
        }
    }
}
