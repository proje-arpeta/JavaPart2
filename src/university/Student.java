package university;

public class Student extends Person {
    private String major;

    public Student(String name, int age, String major) {
        super(name, age);
        this.major = major;
    }

    public String getMajor() {
        return major;
    }

    public void study() {
        System.out.println(getName() + " is studying " + major + ".");
    }
}
