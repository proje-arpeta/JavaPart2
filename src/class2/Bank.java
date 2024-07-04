package class2;

public class Bank {
    private String customerId;
    private double balance;
    public String name;

    public Bank(String customerId, double balance){
        this.customerId = customerId;
        this.balance = balance;
    }

    public double getBalance(){
        return balance;
    }


    public String   getName(){
        printName();

        return name;
    }

    public void printName(){
        System.out.println("Hoşgeldin");
    }
    public void  setBalance(double balance){
        this.balance = balance;
    }

    public void deposit(double amount){
        balance = balance + amount;
    };
    public  void withdraw(double amount){
        balance = balance - amount;
    }


    //Bank Sınıfı
    // private customerNumber
    //private balance double
    //constructor customerNumber , balance
    // deposit ve withdraw methodları
    // BankManagement => instance 1 => (123,3000)
    // 1- deposit , 2- withdraw 3- balance gör 4- exit
}
