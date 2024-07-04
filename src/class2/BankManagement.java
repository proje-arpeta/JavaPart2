package class2;

import java.util.Scanner;

public class BankManagement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Bank account1 = new Bank("12I3REM",500000);
        boolean exit = false;
        while (!exit){
            System.out.println("1-Deposit, 2-withdraw, 3- bakiye, 4-tüm bakiyeyi çek, 5- çıkış");
            int operation = scanner.nextInt();
            switch (operation){
                case 1:
                    System.out.println("Yatırmak istediğiniz tutarı girin");
                    double amount = scanner.nextDouble();
                    scanner.nextLine();
                    account1.deposit(amount);
                    break;
                case 2:
                    System.out.println("Çekmek istediğiniz tutarı girniz");
                    double amount2 = scanner.nextDouble();
                    scanner.nextLine();
                    account1.withdraw(amount2);
                    break;
                case 3:
                    double balance = account1.getBalance();
                    System.out.println("Bakiyeniz: " + balance);
                    break;
                case 4:
                    account1.setBalance(0);
                    break;
                case 5:
                    exit = true;
                    break;
                default:
                    System.out.println("Geçersiz işlem");
                    break;
            }
        }
    }
}
