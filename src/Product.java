public class Product{
    private int productId ;
    private  double price;
    private  String productName;
    public Product(int productId, double price, String productName){
        this.productId = productId;
        this.productName = productName;
        this.price = price;
    }

    public int getProductId() {
        return productId;
    };

    public double getPrice() {
        return price;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }
}
