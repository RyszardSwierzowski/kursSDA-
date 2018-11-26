package klasyAbstrakcyjne.wlasciwe;

public class Student extends Osoba {

    private int rokStudiów;

    public Student(String imie, String nazwisko, int wiek, int rokStudiów) {
        super(imie, nazwisko, wiek);
        this.rokStudiów = rokStudiów;
    }

    @Override
    public void wypiszDane() {
        System.out.println("Imie: "+this.imie+" Nazwiko: "+this.nazwisko+" Wiek: "+this.wiek+" Rok studiów : "+this.rokStudiów);
    }
}
