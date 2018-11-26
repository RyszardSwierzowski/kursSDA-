package klasyAbstrakcyjne.wlasciwe;

public abstract class Osoba {
    protected String imie;
    protected String nazwisko;
    protected int wiek;

    public Osoba(String imie, String nazwisko, int wiek) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.wiek = wiek;
    }


    protected static boolean czyOsoba(Osoba os){
        if( os instanceof  Osoba) {
             return true;
        }
        else{
            return  false;
        }
    }

    public abstract void wypiszDane();
}
