package Udemy;

public class Instructor extends Person {
    private String instructorId;
    private String department;

    public Instructor(String name, int age, String email, String instructorId, String department) {
        super(name, age, email);
        this.instructorId = instructorId;
        this.department = department;
    }

    public String getInstructorId() {
        return instructorId;
    }

    public void setInstructorId(String instructorId) {
        this.instructorId = instructorId;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Instructor ID: " + instructorId);
        System.out.println("Department: " + department);
    }
}
