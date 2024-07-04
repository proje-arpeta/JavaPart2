import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProductOperations {
    public static void main(String[] args) {
        ProductManagement productManagement = new ProductManagement();
        Scanner scanner = new Scanner(System.in);
        boolean exit = false;

        while (!exit){
            System.out.println("1. Ürün Ekle");
            System.out.println("2. Ürün Çıkar");
            System.out.println("3. Ürünleri Listele");
            System.out.println("4. Çıkış");
            System.out.print("Seçiminiz: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Satır sonunu tüket

            switch (choice) {
                case 1:
                    System.out.print("Ürün ID: ");
                    int id = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Ürün Adı: ");
                    String name = scanner.nextLine();
                    System.out.print("Ürün Fiyatu: ");
                    double price = scanner.nextDouble();
                    scanner.nextLine();
                    Product product = new Product(id,price,name);
                    productManagement.addProduct(product);
                    break;
                case 2:
                    System.out.print("Çıkarılacak Ürün ID: ");
                    id = scanner.nextInt();
                    productManagement.removeProduct(id);
                    break;
                case 3:
                    productManagement.listProducts();
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
