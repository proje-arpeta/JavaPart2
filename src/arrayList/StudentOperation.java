package arrayList;

import java.util.Scanner;

public class StudentOperation {
    public static void main(String[] args) {
        StudentList studentList = new StudentList();
        User user = new User(1, "irem");
        boolean exit = false;
        Scanner scanner = new Scanner(System.in);
        while (!exit){
            System.out.println("1-Öğrnci Ekle,2-Öğrenci Çıkar,3-Öğreci Listele,4-Çıkış");
            int operation = scanner.nextInt();
            scanner.nextLine();
            switch (operation){
                case 1:
                    System.out.println("Öğrenci adını giriniz");
                    String name = scanner.nextLine();
                    studentList.addStudent(name);
                    break;
                case 2:
                    System.out.println("Çıkarmak istediğin öğrenci indeksini gir");
                    int indeks = scanner.nextInt();
                    scanner.nextLine();
                    studentList.removeStudent(indeks);
                    break;
                case 3:
                    studentList.listStudent();
                    break;
                case 4:
                    exit = true;
                    break;
                default:
                    System.out.println("Geçersiz işlem");
                    break;
            }
        }
    }
}
