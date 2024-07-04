import java.util.ArrayList;
import java.util.List;

public class ProductManagement {
    List<Product> products;

    public ProductManagement(){
        products = new ArrayList<>();
    }
    public  void  addProduct(Product product){
        products.add(product);
    }
    public  void removeProduct(int id){
        Product toRemove = null;
        for (Product product:products){
            if(product.getProductId() == id){
                toRemove = product;
            }
        }
        if (toRemove != null) {
            products.remove(toRemove);
            System.out.println(toRemove.getProductName() + " Ürün çıkarıldı.");
        } else {
            System.out.println("Ürün bulunamadı.");
        }
    }
    public void listProducts() {
        for (Product product : products){
            System.out.println("SKU:" + product.getProductId() + " - " + product.getProductName() + " - " + product.getPrice());
        }
    }
}
