package class2;

import java.util.ArrayList;
import java.util.List;

public class ArrayExamples {

    public static void main(String[] args) {
        String[] students = {"irem", "selin","ayşe"};
        System.out.println(students.length);

        System.out.println("students " + students[0]);
        System.out.println("students " + students[1]);
        System.out.println("students " + students[2]);

        for (int i = 0; i < students.length; i++) {
            String student = students[i];
       System.out.println(students[i]);
        }

        for(String student : students){
           System.out.println(student);
        }

        ArrayList<String> studentList = new ArrayList<>();

        studentList.add("deniz");
        studentList.add("selin");
        studentList.add("Ayşe");
        studentList.add("ahmet");
        studentList.add("ahmet");
        studentList.add("veli");
        studentList.add("mehmet");
        studentList.add("cağla");

        System.out.println("studetn 0.index" + students[0]);
        System.out.println("student list 3.index " + studentList.get(3));
        studentList.remove("deniz");
        System.out.println(studentList.get(0));
        studentList.remove(0);
        System.out.println(studentList.get(0));
        for (int i = 0; i < studentList.size() ; i++) {
            System.out.println(studentList.get(i));
        }
        for (String student : studentList ){
            System.out.println(student);
        }
        studentList.clear();

    }


}
