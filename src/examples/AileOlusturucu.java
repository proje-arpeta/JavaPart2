package examples;

import java.util.Scanner;

public class AileOlusturucu {
    public static void main(String[] args) {
        Aile aile = new Aile("gülgün","halit","irem");
        System.out.println(aile.anne);

        aile.printAile("Kadıköy");
        String anneName = aile.getAnne();

        aile.setAnneYas(30);


        aile.setAnneYas(45);

        int aYas = aile.getAnneYas();
        System.out.println(aYas);
    }
}
