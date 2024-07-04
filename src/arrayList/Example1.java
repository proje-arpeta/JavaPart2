package arrayList;

import java.util.ArrayList;

public class Example1 {
    public static void main(String[] args) {

        ArrayList<String> students = new ArrayList<>();
        System.out.println("Array list boyut" + students.size());
        String[] student2 = {"irem","Büşra","Kübra","Müge"};
        System.out.println("Arrayin boyut" + student2.length);
        students.add("İrem");
        students.add("Büşra");
        students.add("Kübra");
        students.add("Müge");


        students.remove(0);
        students.remove("Büşra");

        for (int i = 0; i < students.size(); i++) {
            System.out.println(students.get(i));

            String student = students.get(i);
        }

        for (String student : students){
System.out.println(student);
        }




    }


}
