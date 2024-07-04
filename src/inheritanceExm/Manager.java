package inheritanceExm;

public class Manager extends Person{
    private int salary;
    public Manager(int id, String name, int age, int salary){
        super(id, name, age);
        this.salary = salary;
    }
    public void displayInfo(){
        super.displayInfo();
        System.out.println("Maaş =>" + salary);
    }
    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getSalary(){
        return salary;
    }
}
