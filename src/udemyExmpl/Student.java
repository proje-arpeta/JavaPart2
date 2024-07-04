package udemyExmpl;

public class Student extends Person {
    private  int age;

    public Student(int id, String name, int age){
        super(id,name);
        this.age = age;
    }

    public void displayInfo(){
        super.displayInfo();
      System.out.println("Yaş : "+ age);
    }

}
