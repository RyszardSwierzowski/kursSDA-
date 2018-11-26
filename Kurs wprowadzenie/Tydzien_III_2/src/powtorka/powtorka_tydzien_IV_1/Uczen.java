package powtorka.powtorka_tydzien_IV_1;

public class Uczen extends Osoba implements Nauka{
    private int klasa;

    public Uczen(String imie, String nazwisko, int klasa) {
        super(imie, nazwisko);
        this.klasa = klasa;
    }

    public void wyswietlInfo(){
        System.out.println(imie+" "+nazwisko+" klasa: "+klasa);
    }
    @Override public void czytaj(String nazwaKsiazki) {
        System.out.println("czytam powoli :"+nazwaKsiazki);
    }

    public static void main(String... a){
        Uczen u1 = new Uczen("Jacek","Pyra",1);
        u1.wyswietlInfo();
    }


}
