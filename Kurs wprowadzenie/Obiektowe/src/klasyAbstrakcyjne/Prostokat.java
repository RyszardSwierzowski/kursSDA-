package klasyAbstrakcyjne;

public class Prostokat {
    private int dlugosc,szerokosc;

    public Prostokat(int dlugosc, int szerokosc) {
        this.dlugosc = dlugosc;
        this.szerokosc = szerokosc;
    }

    public int obliczPole(){
        return this.dlugosc*this.szerokosc;
    }
}
