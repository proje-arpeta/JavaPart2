package ecommerceExample;

public class Product {
    private  String productCode;
    private  String productName;
    private double productPrice;

    public Product(String productCode, String productName, double productPrice){
        this.productCode = productCode;
        this.productName = productName;
        this.productPrice = productPrice;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductName() {
        return productName;
    }

    public double getProductPrice() {
        return productPrice;
    }

    public String getProductCode() {
        return productCode;
    }

    public void setProductCode(String productCode) {
        this.productCode = productCode;
    }

    public void setProductPrice(double productPrice) {
        this.productPrice = productPrice;
    }

    public  void  showProductInfo(){
        System.out.println(" Ürün Bilgileri " + productCode + "/" + productName + " " + productPrice);
    }
}
