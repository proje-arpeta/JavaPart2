package productManagement;

public class Product {
    private int id;
    private String name;
    private double price;
    public String barcode;

    public Product(int id, String name, double price){
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public void displayInfo(){
        System.out.println("Ürün: " + name + " = Fiyat : " + price);
    }
}
