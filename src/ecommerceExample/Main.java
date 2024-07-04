package ecommerceExample;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Product> products = new ArrayList<>();
        List<Cart> carts = new ArrayList<>();

      boolean exit = false;
      while (!exit){
          System.out.println("Ne Yapmak İstiyorsun 1-Ürün Ekle, 2-Listele - , 3-Sepete Ekle, 4-Sepeti Göster,  5 Çıkış");
          int operation = scanner.nextInt();
          scanner.nextLine();
          switch (operation){
              case 1:
                  System.out.println("Ürün Kodunu Giriniz");
                  String pCode = scanner.nextLine();
                  System.out.println("Ürün Adını Giriniz");
                  String pName = scanner.nextLine();
                  System.out.println("Ürün Fiyatı");
                  double pPrice = scanner.nextDouble();
                  Product product = new Product(pCode, pName, pPrice);
                  products.add(product);
                  break;
              case 2:
                  for (Product p : products){
                      p.showProductInfo();
                  }
                  break;

              case 3:
                  System.out.println("Sepete eklemek istediğiniz ürünün kodu");
                  String pCodeCard = scanner.nextLine();
                  Cart cart = new Cart(pCodeCard);
                  carts.add(cart);
              case 4:
                  for (Cart c : carts){
                      String pcodeDisplay = c.getProductCode();
                      System.out.println(pcodeDisplay);
                  }
                  break;
              case 5:
                  exit = true;
                  break;
              default:
                  break;
          }
      }

    }
}
