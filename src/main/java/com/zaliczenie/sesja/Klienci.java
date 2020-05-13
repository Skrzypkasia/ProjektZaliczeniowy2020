package com.zaliczenie.sesja;

public enum Klienci {
    Krystyna(15, "Jabłko"),
    Jadwiga(30, "Banana"),
    Zygmunt(4.50, "Marchewkę"),
    Marcin(15.60, "Ogórka");

    final private double iloscPieniedzy;
    final public String zakupy;
    final public static String informacja;

    static {
        informacja = "Klienci sklepu";
    }


    Klienci(double iloscPieniedzy, String zakupy) {
        this.iloscPieniedzy = iloscPieniedzy;
        this.zakupy = zakupy;
    }

    public double getIloscPieniedzy() {
        return iloscPieniedzy;
    }
    public String info() {
        return super.toString()+" ma przy sobie "+iloscPieniedzy+"zł.";
    }

    public void zrobZakupy(){
        System.out.println(toString()+ " chce kupić " + zakupy+".");
    }
}


