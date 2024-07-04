package productManagement;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProductOperation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Product product = new Product(1, "macbook",100);
        List<String> items = new ArrayList<>();
        items.add("X");
        items.add("Y");

        List<Product> products = new ArrayList<>();
        products.add(product);

        Product product2 = new Product(2, "telefon",300);
        products.add(product2);
        for (Product p:products){
            p.displayInfo();
        }

        boolean exit = false;
        while (!exit){
            System.out.println("1-Ekle,2-Çıkar, 3-Liste, 4-Çıkış");
              int operation = scanner.nextInt();
              scanner.nextLine();
            switch (operation){
                case 1:
                    System.out.println("Ürün Id");
                    int id = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Ürün adı");
                    String  name = scanner.nextLine();
                    System.out.println("Fiyat");
                    double price = scanner.nextDouble();
                    scanner.nextLine();
                    Product urun = new Product(id,name,price);
                    products.add(urun);
                    break;
                case 2:
                    System.out.println("Ürün Indeks");
                    int index = scanner.nextInt();
                    products.remove(index);
                    break;
                case 3:
                    for (Product p:products){
                        p.displayInfo();
                    }
                    break;
                case 4:
                    exit = true;
                    break;
                default:
                    break;
            }
        }
    }
}
