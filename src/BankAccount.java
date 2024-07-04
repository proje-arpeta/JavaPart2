public class BankAccount {
    // Özellikler private olarak tanımlanır
    private String accountNumber;
    private double balance;
    private String ownerName;

    // Yapıcı metod (constructor)
    public BankAccount(String accountNumber, double balance, String ownerName) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.ownerName = ownerName;
    }

    // Getter ve setter yöntemleri
    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println(amount + " TL yatırıldı. Yeni bakiye: " + balance + " TL");
        } else {
            System.out.println("Geçersiz miktar.");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println(amount + " TL çekildi. Yeni bakiye: " + balance + " TL");
        } else {
            System.out.println("Yetersiz bakiye veya geçersiz miktar.");
        }
    }
}
