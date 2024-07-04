package arrayList;

import java.util.ArrayList;
import java.util.List;

public class StudentList {
   List<String> students;

   public StudentList(){
       students = new ArrayList<>();
   }

   public void addStudent(String student){
       students.add(student);
   }

   public void removeStudent(int i){
       students.remove(i);
   }

   public List<String> getStudents(){
       return students;
   }

   public void listStudent(){
       for (String student : students){
           System.out.println("Öğrenci: " + student);
       }
   }

}
