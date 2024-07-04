public class ClassCreation {
    String name = "irem"; // Aynı paket içindeki sınıflardan erişilebilir
    public String name2 = "Arpeta"; // Her yerden erişilebilir
    private  String name3 = "İrem Arslan"; // Sadece tanımlandığı sınıf içinde erişilebilir
    protected  String  name4 = "Arpeta Yazılım"; // Aynı paket içindeki sınıflardan ve alt sınıflardan erişilebilir.

    public void printAttributes(){
        System.out.println(name);
        System.out.println(name2);
        System.out.println(name3);
        System.out.println(name4);
    }
    public static void main(String[] args) {
      ClassCreation object1 = new ClassCreation();
      object1.printAttributes();
    }

}
