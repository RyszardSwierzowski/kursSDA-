package pl.swierzowski;

public class Pytanie {
    String pytanie;
    String a;
    String b;
    String c;
    String d;
    int poprawna;

    public Pytanie(String pytanie, String a, String b, String c, String d, int poprawna) {
        this.pytanie = pytanie;
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.poprawna = poprawna;
    }

    public String getPytanie() {
        return pytanie;
    }

    public String getA() {
        return a;
    }

    public String getB() {
        return b;
    }

    public String getC() {
        return c;
    }

    public String getD() {
        return d;
    }

    public int getPoprawna() {
        return poprawna;
    }
}
