package udemyExmpl;

public class Instructor extends Person{
    private String department;

    public Instructor(int id, String name, String department){
        super(id,name);
        this.department = department;
    }

    public void displayIndo(){
        super.displayInfo();
        System.out.println("Departman " + department);
    }
}
