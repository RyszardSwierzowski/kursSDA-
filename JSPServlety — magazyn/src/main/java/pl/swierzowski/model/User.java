package pl.swierzowski.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity(name = "user")
public class User {

    @Id
    @GeneratedValue
    private long id;
//    private String imie;
//    private String nazwisko;
    private UserType typUsera;
    private String email;
    private String login;
    private String password;

    public User() {
    }

    public User( UserType typUsera, String email) {
        this.typUsera = typUsera;
        this.email = email;
    }

    public User( UserType typUsera, String email, String login, String password) {
        this.typUsera = typUsera;
        this.email = email;
        this.login = login;
        this.password = password;
    }

    public User(long id, UserType typUsera, String email, String login) {
        this.id = id;
        this.typUsera = typUsera;
        this.email = email;
        this.login = login;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public UserType getTypUsera() {
        return typUsera;
    }

    public void setTypUsera(UserType typUsera) {
        this.typUsera = typUsera;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String passord) {
        this.password = passord;
    }
}
