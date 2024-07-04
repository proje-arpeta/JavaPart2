package inheritanceExm;

public class Main {
    public static void main(String[] args) {
        Employee employee = new Employee(1,"irem",20,"Mühendis");
        employee.displayInfo();

        Manager manager = new Manager(1,"fatma",40,1000000);
        manager.displayInfo();
    }
}
