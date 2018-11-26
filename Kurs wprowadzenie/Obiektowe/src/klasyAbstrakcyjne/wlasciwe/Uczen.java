package klasyAbstrakcyjne.wlasciwe;

public class Uczen extends Osoba {
    private int klasa;

    public Uczen(String imie, String nazwisko, int wiek, int klasa) {
        super(imie, nazwisko, wiek);
        this.klasa = klasa;
    }

    @Override
    public void wypiszDane() {
        System.out.println("Imie: "+this.imie+" Nazwiko: "+this.nazwisko+" Wiek: "+this.wiek+" Klasa : "+this.klasa);
    }
}
