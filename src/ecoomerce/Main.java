package ecoomerce;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    private static List<Product> products = new ArrayList<>();
    private static Cart cart = new Cart();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        boolean running = true;

        while (running) {
            System.out.println("\n--- Shopping System ---");
            System.out.println("1. Add Product");
            System.out.println("2. Add Product to Cart");
            System.out.println("3. Display Cart");
            System.out.println("4. Calculate Total");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");
            int option = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (option) {
                case 1:
                    addProduct();
                    break;
                case 2:
                    addProductToCart();
                    break;
                case 3:
                    displayCart();
                    break;
                case 4:
                    calculateTotal();
                    break;
                case 5:
                    running = false;
                    break;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }

        System.out.println("Goodbye!");
    }

    private static void addProduct() {
        System.out.print("Enter product ID: ");
        String productId = scanner.nextLine();
        System.out.print("Enter product name: ");
        String productName = scanner.nextLine();
        System.out.print("Enter product price: ");
        double price = scanner.nextDouble();
        scanner.nextLine(); // Consume newline

        Product product = new Product(productId, productName, price);
        products.add(product);
        System.out.println("Product added successfully.");
    }

    private static void addProductToCart() {
        System.out.print("Enter product ID: ");
        String productId = scanner.nextLine();

        Product product = findProductById(productId);

        if (product == null) {
            System.out.println("Product not found.");
            return;
        }

        cart.addProduct(product);
    }

    private static void displayCart() {
        cart.displayCart();
    }

    private static void calculateTotal() {
        double total = cart.calculateTotal();
        System.out.println("Total cost: $" + total);
    }

    private static Product findProductById(String productId) {
        for (Product product : products) {
            if (product.getProductId().equals(productId)) {
                return product;
            }
        }
        return null;
    }
}
