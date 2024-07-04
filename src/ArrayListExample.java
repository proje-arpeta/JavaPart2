import java.util.ArrayList;

public class ArrayListExample {
    public static void main(String[] args) {
        ArrayList<String> fruits = new ArrayList<>();

        // Eleman ekleme
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");

        // Elemanlara erişim
        System.out.println("İlk meyve: " + fruits.get(0)); // Çıktı: İlk meyve: Apple

        // Eleman sayısını öğrenme
        System.out.println("Liste boyutu: " + fruits.size()); // Çıktı: Liste boyutu: 3

        // Eleman silme
        fruits.remove("Banana");
        System.out.println("Banana silindi, yeni liste boyutu: " + fruits.size()); // Çıktı: Banana silindi, yeni liste boyutu: 2


        // For döngüsü kullanarak elemanlara erişim
        for (int i = 0; i < fruits.size(); i++) {
            System.out.println("Meyve: " + fruits.get(i));
        }

        // For-each döngüsü kullanarak elemanlara erişim
        for (String fruit : fruits) {
            System.out.println("Meyve: " + fruit);
        }

        // Listeyi temizleme
        fruits.clear();
        System.out.println("Liste temizlendi, yeni liste boyutu: " + fruits.size()); // Çıktı: Liste temizlendi, yeni liste boyutu: 0

    }
}
