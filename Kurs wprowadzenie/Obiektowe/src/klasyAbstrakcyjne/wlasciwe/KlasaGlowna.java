package klasyAbstrakcyjne.wlasciwe;

public class KlasaGlowna {
    public static void main(String[] args){
        Student student = new Student("jan","kowalski",20,3);
        Uczen uczen = new Uczen("jan","kowalski",15,3);

        System.out.println("Czy uczen jest Osobą: " + Osoba.czyOsoba(uczen));
        System.out.println("Czy student jest Osobą: " + Osoba.czyOsoba(student));


        Osoba[] tablica = new Osoba[6];
        tablica[0]= new Student("jan","kowalski",20,3);
        tablica[1]= new Student("Tomek","kowalski",21,4);
        tablica[2]= new Student("Bartek","kowalski",20,3);
        tablica[3]= new Uczen("Stefan","kowalski",15,3);
        tablica[4]= new Uczen("jan","kowalski",14,2);
        tablica[5]= new Uczen("Jacek","kowalski",15,3);
        tablica[5].wypiszDane();
    }



}
