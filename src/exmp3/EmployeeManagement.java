package exmp3;

public class EmployeeManagement {
    public static void main(String[] args) {
        Employee emp1 = new Employee("John Doe", 101, 50000);
        Manager mgr1 = new Manager("Jane Smith", 102, 75000, "IT");

        emp1.work();
        mgr1.work(); // Miras alınan yöntem
        mgr1.holdMeeting();
    }
}
