package examples;

import java.util.Scanner;

public class Aile {
    public String anne ;
    private int anneYas;

    public String baba;
    private  int babaYas;

    public String cocuk;
    private  int cocukYas;

  public  Aile(String anne, String baba, String cocuk){
        this.anne = anne;
        this.baba = baba;
        this.cocuk = cocuk;
  }

  public int getAnneYas(){
      return  anneYas;
  }
  public void setAnneYas(int yas){
      anneYas = yas;
  }

    public int getBabaYas() {
        return babaYas;
    }

    public int getCocukYas() {
        return cocukYas;
    }

    public void setBabaYas(int babaYas) {
        this.babaYas = babaYas;
    }

    public void setCocukYas(int cocukYas) {
        this.cocukYas = cocukYas;
    }



    public void printAile(String mahalle){
      System.out.println("Anne:" + anne + " Baba" + baba + " Çocuk" + cocuk + "Mahalle" + mahalle);
  }

  public String getAnne(){
      return anne;
  }
public static  void  printBaba(String baba){
      System.out.println("Baba" + baba);
}

    public static void main(String[] args) {
      Aile aile = new Aile("x", "y","z");
aile.printAile("Kadıköy");
        printBaba(aile.baba);

    }



}
