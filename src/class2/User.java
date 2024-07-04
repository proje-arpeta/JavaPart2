package class2;

public class User {
    public String userName;
    private String password;
    private  String name;
    private int age;

    public User(String userName, String password, String name, int age){
      this.userName = userName;
      this.password = password;
      this.name = name;
      this.age = age;
    }
    public String getUserName(){
        return userName;
    }

    public void setUserName(String userName){
        this.userName = userName;
    }

    public String getPassword(){
        return  password;
    }
    public  void setPassword(String password){
        this.password = password;
    }

    public int getAge() {
        return age;
    }
    public void setAge(int age){
        this.age = age;
    }

    public String getName(){
        return  name;
    }

    public void setName(String name){
        this.name = name;
    }
}
