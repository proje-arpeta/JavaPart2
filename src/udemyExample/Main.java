package udemyExample;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Student student = new Student("ayşe",17,"irem@a.com","1a");
        student.displayInfo();

        Instructor instructor = new Instructor("irem",25,"irem@dlk.com","a1","Bilgi İşlem");
        instructor.displayInfo();

        List<Student> students = new ArrayList<>();
        List<Instructor> instructors = new ArrayList<>();
        List<Course> courses = new ArrayList<>();

        Student student1 = new Student("ayşe",17,"irem@a.com","1a");
        Student student2 = new Student("fatma",20,"irem@a.com","1a");
        Student student3 = new Student("deniz",24,"irem@a.com","1a");

        students.add(student1);
        students.add(student2);
        students.add(student3);

        Instructor instructor1 = new Instructor("irem",25,"irem@dlk.com","a1","Bilgi İşlem");
        Instructor instructor2 = new Instructor("cenk",30,"irem@dlk.com","a1","Bilgi İşlem");
        instructors.add(instructor1);
        instructors.add(instructor2);

        Course course1 = new Course("1","Java","irem");
        course1.addStudent(student1);

        Course course2 = new Course("2","JavaScript","irem");

        course2.addStudent(student2);
        course2.addStudent(student3);
        Course course3 = new Course("3","React","irem");
        Course course4 = new Course("4","Node","cenk");

        courses.add(course1);
        courses.add(course2);
        courses.add(course3);
        courses.add(course4);
        for (Course c: courses){
            c.displaycourse();
            c.listStudent();
        }



    }
}
