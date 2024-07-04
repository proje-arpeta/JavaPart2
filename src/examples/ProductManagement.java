package examples;

import java.util.Scanner;

public class ProductManagement {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ürün SKU");
        String sku = scanner.nextLine();
        System.out.println("Ürün Adı");
        String name = scanner.nextLine();
        double price = scanner.nextDouble();
        scanner.nextLine();

        Product product = new Product(sku, name, price);
        System.out.println(product.getProductName());

        double productPrice = product.getPrice();
        System.out.println(productPrice);
        productPrice = productPrice - 300;
        product.setPrice(productPrice);
        System.out.println(product.getPrice());
    }
}
