package udemyExmpl;

import productManagement.Course;

import java.util.ArrayList;
import java.util.List;

public class Operation {
    public static void main(String[] args) {
        Instructor instructor1 = new Instructor(1,"irem","Java");
        Instructor instructor2 = new Instructor(2,"ayse","React");
        Instructor instructor3 = new Instructor(3,"fatma","JS");
        Instructor instructor4 = new Instructor(4,"cenk","HTML");
        Instructor instructor5 = new Instructor(1,"melis","XXX");

        Student student1 = new Student(1, "büşra",19);
        Student student2 = new Student(2, "a",19);
        Student student3 = new Student(3, "b",19);
        Student student4 = new Student(4, "c",19);
        Student student5 = new Student(5, "d",19);
        Student student6 = new Student(7, "e",19);
        Student student7 = new Student(8, "f",19);

        List<Student> studentListe = new ArrayList<>();
        studentListe.add(student1);
        studentListe.add(student2);
        studentListe.add(student3);
        studentListe.add(student4);
        studentListe.add(student5);
        List<Instructor> instructorList = new ArrayList<>();
        instructorList.add(instructor1);
        instructorList.add(instructor2);
        instructorList.add(instructor3);
        instructorList.add(instructor4);
        instructorList.add(instructor5);


        Course course1 = new Course(1,"JAVA",1);
        course1.addStudent(student6);
        course1.addStudent(student1);
        Course course2 = new Course(1,"HTML e giriş",2);
        course2.addStudent(student1);
        course2.addStudent(student2);
        course2.addStudent(student3);
        Course course3 = new Course(1,"FullStack",3);
        course3.addStudent(student6);
        course3.addStudent(student7);

        List<Course> courseList = new ArrayList<>();
        courseList.add(course1);
        courseList.add(course2);
        courseList.add(course3);


        for (Course c: courseList){
            c.displayInfo();
        }
    }
}
