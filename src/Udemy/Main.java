package Udemy;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    private static List<Student> students = new ArrayList<>();
    private static List<Instructor> instructors = new ArrayList<>();
    private static List<Course> courses = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        boolean running = true;

        while (running) {
            System.out.println("\n--- Online Learning Platform ---");
            System.out.println("1. Add Student");
            System.out.println("2. Add Instructor");
            System.out.println("3. Add Course");
            System.out.println("4. Enroll Student in Course");
            System.out.println("5. Display Students");
            System.out.println("6. Display Instructors");
            System.out.println("7. Display Courses");
            System.out.println("8. Exit");
            System.out.print("Choose an option: ");
            int option = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (option) {
                case 1:
                    addStudent();
                    break;
                case 2:
                    addInstructor();
                    break;
                case 3:
                    addCourse();
                    break;
                case 4:
                    enrollStudentInCourse();
                    break;
                case 5:
                    displayStudents();
                    break;
                case 6:
                    displayInstructors();
                    break;
                case 7:
                    displayCourses();
                    break;
                case 8:
                    running = false;
                    break;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }

        System.out.println("Goodbye!");
    }

    private static void addStudent() {
        System.out.print("Enter student name: ");
        String name = scanner.nextLine();
        System.out.print("Enter student age: ");
        int age = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        System.out.print("Enter student email: ");
        String email = scanner.nextLine();
        System.out.print("Enter student ID: ");
        String studentId = scanner.nextLine();

        Student student = new Student(name, age, email, studentId);
        students.add(student);
        System.out.println("Student added successfully.");
    }

    private static void addInstructor() {
        System.out.print("Enter instructor name: ");
        String name = scanner.nextLine();
        System.out.print("Enter instructor age: ");
        int age = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        System.out.print("Enter instructor email: ");
        String email = scanner.nextLine();
        System.out.print("Enter instructor ID: ");
        String instructorId = scanner.nextLine();
        System.out.print("Enter department: ");
        String department = scanner.nextLine();

        Instructor instructor = new Instructor(name, age, email, instructorId, department);
        instructors.add(instructor);
        System.out.println("Instructor added successfully.");
    }

    private static void addCourse() {
        System.out.print("Enter course ID: ");
        String courseId = scanner.nextLine();
        System.out.print("Enter course name: ");
        String courseName = scanner.nextLine();
        System.out.print("Enter instructor ID for this course: ");
        String instructorId = scanner.nextLine();

        Instructor instructor = findInstructorById(instructorId);
        if (instructor == null) {
            System.out.println("Instructor not found.");
            return;
        }

        Course course = new Course(courseId, courseName, instructor);
        courses.add(course);
        System.out.println("Course added successfully.");
    }

    private static void enrollStudentInCourse() {
        System.out.print("Enter course ID: ");
        String courseId = scanner.nextLine();
        System.out.print("Enter student ID: ");
        String studentId = scanner.nextLine();

        Course course = findCourseById(courseId);
        Student student = findStudentById(studentId);

        if (course == null) {
            System.out.println("Course not found.");
            return;
        }

        if (student == null) {
            System.out.println("Student not found.");
            return;
        }

        course.addStudent(student);
        System.out.println("Student enrolled in course successfully.");
    }

    private static void displayStudents() {
        System.out.println("\n--- Students ---");
        for (Student student : students) {
            student.displayInfo();
            System.out.println();
        }
    }

    private static void displayInstructors() {
        System.out.println("\n--- Instructors ---");
        for (Instructor instructor : instructors) {
            instructor.displayInfo();
            System.out.println();
        }
    }

    private static void displayCourses() {
        System.out.println("\n--- Courses ---");
        for (Course course : courses) {
            course.displayCourseInfo();
            System.out.println();
        }
    }

    private static Instructor findInstructorById(String instructorId) {
        for (Instructor instructor : instructors) {
            if (instructor.getInstructorId().equals(instructorId)) {
                return instructor;
            }
        }
        return null;
    }

    private static Student findStudentById(String studentId) {
        for (Student student : students) {
            if (student.getStudentId().equals(studentId)) {
                return student;
            }
        }
        return null;
    }

    private static Course findCourseById(String courseId) {
        for (Course course : courses) {
            if (course.getCourseId().equals(courseId)) {
                return course;
            }
        }
        return null;
    }
}
