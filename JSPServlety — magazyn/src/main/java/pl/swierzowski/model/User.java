package pl.swierzowski.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity(name = "user")
public class User {

    @Id
    @GeneratedValue
    private long id;
    private String imie;
    private String nazwisko;
    private UserType typUsera;

    public User() {
    }

    public User(long id, String imie, String nazwisko, UserType typUsera) {
        this.id = id;
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.typUsera = typUsera;
    }


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getImie() {
        return imie;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }

    public UserType getTypUsera() {
        return typUsera;
    }

    public void setTypUsera(UserType typUsera) {
        this.typUsera = typUsera;
    }
}
