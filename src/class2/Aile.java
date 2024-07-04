package class2;

public class Aile {
    public String anne;
    public String baba;
    public  String cocuk;
    private int anneYas;
    private  int babaYas;
    private  int cocukYas;

    public Aile(String anne,String   baba,String  cocuk){
      this.anne = anne;
      this.baba = baba;
      this.cocuk = cocuk;
    }
    public void printFamilyMemeber(){
        System.out.println("Anne " + anne + " Baba" + baba + " Çocuk" + cocuk);
    }

    public  String returnAnneNAme(){

        return anne;
    }

    public static void welcomeMessage(){
        Aile aile = new Aile("kdjfkd","kdjfkdf","ksjkdjs");

        System.out.println("Hoşgeldin" + aile.anne);
    }

    public static void main(String[] args) {
        Aile aile = new Aile("Halit", "Gülgün","irem");
        System.out.println("anne" + aile.anne);
        welcomeMessage();
    }
}
