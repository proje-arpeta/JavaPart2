package exmp3;

public class Manager extends Employee {
    private String department;

    public Manager(String name, int id, double salary, String department) {
        super(name, id, salary);
        this.department = department;
    }

    public String getDepartment() {
        return department;
    }

    public void holdMeeting() {
        System.out.println(getName() + " is holding a meeting in " + department + " department.");
    }
}
