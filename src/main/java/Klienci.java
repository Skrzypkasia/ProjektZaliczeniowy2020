
public enum Klienci {
    Krystyna(15, "Jabłko"),
    Jadwiga(30, "Bana"),
    Zygmunt(4.50, "lolo"),
    Marcin(15.60, "askdj");

    final private double iloscPieniedzy;
    final public String zakupy;
    final public static String info;

    static {
        info = "Klient sklepu";
    }


    Klienci(double iloscPieniedzy, String zakupy) {
        this.iloscPieniedzy = iloscPieniedzy;
        this.zakupy = zakupy;
    }

    public double getIloscPieniedzy() {
        return iloscPieniedzy;
    }
    public String info() {
        return super.toString()+": "+iloscPieniedzy;
    }

    public void zrobZakupy(){
        System.out.println("Kupuje:"+ zakupy);
    }
}


