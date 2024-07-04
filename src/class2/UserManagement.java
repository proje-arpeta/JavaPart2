package class2;

import java.util.Scanner;

public class UserManagement {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        boolean exit = false;
        while (!exit){

            System.out.println("Yapmak istediğimiz işlemi seçin 1- Register, 2-Şifre Değiştir, 3-İsim Değiştir 4-Profil Bilgileri 5-Çıkış");
            int operation = scanner.nextInt();
            scanner.nextLine();
            switch (operation){
                case 1:
                    System.out.println("Kullanıcı adınız");
                    String userName = scanner.nextLine();
                    System.out.println("Şifre");
                    String password = scanner.nextLine();
                    System.out.println("Adınız");
                    String name = scanner.nextLine();
                    System.out.println("Yaşınız");
                    int age = scanner.nextInt();
                    scanner.nextLine();
                     User user = new User(userName,password,name,age);
                     System.out.println("Hoşgeldin " + user.getUserName());
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    exit  = true;
                    break;
                default:
                    System.out.println("Geçersiz bir işlem");
                    break;
            }
        }
    }

    // Kullanıcı sınıfı userName,password,name, age

    //UserMAnagement sınıfında Kullanıcı Exit yapana kadar
    // 1-> Register
    // userName,password,name, age değerleri isteyecel.
    // 2=> Change Password
    // passqword girecek ve setPassword ile şifre değiştirilecek
    // 3=> Change Name
    // name girecek ve setName ile değiştirecek
    // 4=> Profil bilgilerine erişecek(şifre hariç)
    // 5=> Exit

}
