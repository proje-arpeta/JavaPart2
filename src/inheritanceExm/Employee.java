package inheritanceExm;

public class Employee extends Person{
    private String position;
    public Employee(int id, String name, int age, String position){
        super(id,name,age);
        this.position = position;
    }
    public  void displayInfo(){
          super.displayInfo(); // Kişi Id 1 Adı: İrem
         System.out.println("Pozisyon => " + position);
    }
    public String getPosition() {
        return position;
    }
    public void setPosition(String position) {
        this.position = position;
    }
}
