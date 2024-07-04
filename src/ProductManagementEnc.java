public class ProductManagementEnc {
    // Özellikler private olarak tanımlanır
    private String productId;
    private String name;
    private double price;

    // Yapıcı metod (constructor)
    public ProductManagementEnc(String productId, String name, double price) {
        this.productId = productId;
        this.name = name;
        this.price = price;
    }

    // Getter ve setter yöntemleri
    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if (price > 0) {
            this.price = price;
        } else {
            System.out.println("Geçersiz fiyat değeri.");
        }
    }

    // İş mantığı yöntemi
    public void displayProduct() {
        System.out.println("Ürün ID: " + productId + ", Adı: " + name + ", Fiyat: " + price + " TL");
    }
    public static void main(String[] args) {
        // Yeni ürün oluşturma
        ProductManagementEnc product = new ProductManagementEnc("001", "Laptop", 4500);

        // Bilgi alma ve güncelleme
        product.displayProduct();

        product.setPrice(5000);
        System.out.println("Güncellenmiş Fiyat: " + product.getPrice() + " TL");
    }


}