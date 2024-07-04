package udemyExmpl;

public class Person {
    private int id;
    private String  name;
    public Person(int id, String name){
        this.id = id;
        this.name = name;
    }

    public void displayInfo(){
        System.out.println("Öğrenci Adı" + name);
    }
}
