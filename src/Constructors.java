public class Constructors {
    String marka;
    String model;
    int yil;

    // Parametresiz Yapıcı Metod
    public Constructors() {
        this.marka = "Bilinmiyor";
        this.model = "Bilinmiyor";
        this.yil = 0;
    }

    // Parametreli Yapıcı Metod
    public Constructors(String marka, String model, int yil) {
        this.marka = marka;
        this.model = model;
        this.yil = yil;
    }

    public static void main(String[] args) {
        Constructors araba1 = new Constructors();
        System.out.println(araba1.marka); // Çıktı: Bilinmiyor
        System.out.println(araba1.model); // Çıktı: Bilinmiyor
        System.out.println(araba1.yil);   // Çıktı: 0

        Constructors araba2 = new Constructors("Honda", "Civic", 2021);
        System.out.println(araba2.marka); // Çıktı: Honda
        System.out.println(araba2.model); // Çıktı: Civic
        System.out.println(araba2.yil);   // Çıktı: 2021
    }
}
