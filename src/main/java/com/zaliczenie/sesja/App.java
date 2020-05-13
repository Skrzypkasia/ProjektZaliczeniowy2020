/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package com.zaliczenie.sesja;

import com.sun.tools.javac.Main;

import java.util.ArrayList;

enum Produkt {
    JABLKO, TRUSKAWKA, MALINA, GRUSZKA, BOROWKA, BANAN,
    ZIEMNIAK, SALATA, MARCHEWKA, PAPRYKA, SELER, OGOREK

}

public class App {


    public static void main(String[] args) {
//        var array = new ArrayList<Double>();
//        var a = 10.0;

        App app = new App();
        System.out.println("Banan to: "+app.rodzaj(Produkt.BANAN));
        System.out.println("Jabłko to: " + app.rodzaj(Produkt.JABLKO));
        System.out.println("Ziemniak to: " + app.rodzaj(Produkt.ZIEMNIAK));

    }



        String rodzaj(Produkt produkt){
            String kategoria = "";
            switch (produkt) {
                case JABLKO, TRUSKAWKA, MALINA, GRUSZKA, BOROWKA, BANAN -> kategoria = "Owoc";
                case ZIEMNIAK, SALATA, MARCHEWKA, PAPRYKA, SELER, OGOREK -> kategoria = "Warzywo";
                default -> kategoria = "Inny produkt";
            }
            return kategoria;
        }

        }


