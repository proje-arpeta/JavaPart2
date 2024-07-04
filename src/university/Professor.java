package university;

public class Professor extends Person {
    private String department;

    public Professor(String name, int age, String department) {
        super(name, age);
        this.department = department;
    }

    public String getDepartment() {
        return department;
    }

    public void teach() {
        System.out.println(getName() + " is teaching in the " + department + " department.");
    }
}
