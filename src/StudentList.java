import java.util.ArrayList;
import java.util.Scanner;

public class StudentList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean exit = false;

        ArrayList<String> students = new ArrayList<>();
        while (!exit){
            System.out.println("1. Öğrenci Ekle");
            System.out.println("2. Öğrenci Çıkar");
            System.out.println("3. Öğrencileri Listele");
            System.out.println("4. Çıkış");
            System.out.print("Seçiminiz: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Satır sonunu tüket

            switch (choice){
                case 1:
                    System.out.print("Öğrenci Adı: ");
                    String name = scanner.nextLine();
                    students.add(name);
                    break;
                case 2:
                    System.out.print("Çıkarılacak Öğrenci İndex: ");
                    int indeks = scanner.nextInt();
                    scanner.nextLine(); // Satır sonunu tüket
                    students.remove(indeks);
                    break;
                case 3:  for (int i = 0; i < students.size(); i++) {
                    System.out.println((i + 1) + ". Öğrenci: " + students.get(i));
                }
                    break;
                case 4:
                    exit = true;
                    break;
                default:
                    System.out.println("Geçersiz seçim.");
                    break;

            }
        }

    }
}
