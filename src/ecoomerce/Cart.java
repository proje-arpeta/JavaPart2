package ecoomerce;

import java.util.ArrayList;
import java.util.List;

public class Cart {
    private List<Product> products;

    public Cart() {
        this.products = new ArrayList<>();
    }

    public List<Product> getProducts() {
        return products;
    }

    public void addProduct(Product product) {
        products.add(product);
        System.out.println(product.getProductName() + " added to the cart.");
    }

    public void displayCart() {
        if (products.isEmpty()) {
            System.out.println("The cart is empty.");
        } else {
            System.out.println("Products in the cart:");
            for (Product product : products) {
                product.displayInfo();
                System.out.println();
            }
        }
    }

    public double calculateTotal() {
        double total = 0;
        for (Product product : products) {
            total += product.getPrice();
        }
        return total;
    }
}
