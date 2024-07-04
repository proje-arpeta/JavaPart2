import java.util.Scanner;

public class StudentOpretions {
    public static void main(String[] args) {
        StudentManagement management = new StudentManagement();
        Scanner scanner = new Scanner(System.in);
        boolean exit = false;

        while (!exit) {
            System.out.println("1. Öğrenci Ekle");
            System.out.println("2. Öğrenci Çıkar");
            System.out.println("3. Öğrencileri Listele");
            System.out.println("4. Çıkış");
            System.out.print("Seçiminiz: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Satır sonunu tüket

            switch (choice) {
                case 1:
                    System.out.print("Öğrenci ID: ");
                    String id = scanner.nextLine();
                    System.out.print("Öğrenci Adı: ");
                    String name = scanner.nextLine();
                    Student newStudent = new Student(id, name);
                    management.addStudent(newStudent);
                    break;
                case 2:
                    System.out.print("Çıkarılacak Öğrenci ID: ");
                    id = scanner.nextLine();
                    management.removeStudent(id);
                    break;
                case 3:
                    management.listStudents();
                    break;
                case 4:
                    exit = true;
                    break;
                default:
                    System.out.println("Geçersiz seçim.");
            }
        }
        scanner.close();
    }
}
