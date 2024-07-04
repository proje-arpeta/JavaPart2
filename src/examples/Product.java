package examples;

public class Product {
    private String sku;
    private String productName;
    private double price;

    public  Product(String sku, String productName, double price){
        this.sku = sku;
        this.productName = productName;
        this.price= price;
    }

    public String getSku(){
        return sku;
    }
    public void setSku(String sku){
        this.sku = sku;
    }

    public String getProductName(){
        return productName;
    }
    public void  setProductName(String productName){
        this.productName = productName;
    }

    public double getPrice(){
        return price;
    }

    public void setPrice(double price){
        this.price = price;
    }
}
