package class2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> students = new ArrayList<>();

        boolean exit = false;

        while (!exit){
            System.out.println("1-Ekleme, 2-Çıkarma, 3-Listeleme, 4-Çıkış");
            System.out.println("İşlemi giriniz");
            int operation = scanner.nextInt();
            scanner.nextLine();

            System.out.println("operasyon + " + operation);

            switch (operation){
                case 1:
                    System.out.println("Eklemek istediğiniz öğrenci adını giriniz");
                    String name = scanner.nextLine();
                    students.add(name);
                    break;
                case 2:
                    System.out.println("Çıkarmak istediğiniz öğrenci indeksini giriniz");
                    int index = scanner.nextInt();
                    scanner.nextLine();
                    students.remove(index);
                    break;
                case 3:
                    for (String student : students){
                        System.out.println("Öğrenci: " + student);
                    }
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
