package class2;

import java.util.Scanner;

public class AileYonetimi {
    public static void main(String[] args) {
        Aile aile = new Aile("Gülgün","Halit","İrem");

        System.out.println(aile.baba);
        String anneName = aile.returnAnneNAme();
        System.out.println(anneName);

    }

}
