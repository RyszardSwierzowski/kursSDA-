package UML;

import java.time.LocalDateTime;

public abstract class Osoba {
    private  String imie;
    private String nazwisko;
    private LocalDateTime dataUrodzenial;
    private int wiek;
    private Płeć plec;

    public abstract void getDochody();

}
