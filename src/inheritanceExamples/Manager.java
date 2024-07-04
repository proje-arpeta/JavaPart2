package inheritanceExamples;

public class Manager extends Employee {
    private String department;

    public Manager(String name, int id, double salary, String department){
        super(name,id,salary);
        this.department = department;
    }

    public void meetingInfo(){
        System.out.println("Meeting + " + department );
    }

}
