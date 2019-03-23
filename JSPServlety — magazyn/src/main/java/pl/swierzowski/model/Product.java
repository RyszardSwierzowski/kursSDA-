package pl.swierzowski.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity(name = "products")
public class Product {

    @Id
    @GeneratedValue
    private long id;
    private double cena;
    private String naza;
    private int ilosc;

    public Product() {
    }

    public Product(double cena, String naza, int ilosc) {
        this.cena = cena;
        this.naza = naza;
        this.ilosc = ilosc;
    }


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public double getCena() {
        return cena;
    }

    public void setCena(double cena) {
        this.cena = cena;
    }

    public String getNaza() {
        return naza;
    }

    public void setNaza(String naza) {
        this.naza = naza;
    }

    public int getIlosc() {
        return ilosc;
    }

    public void setIlosc(int ilosc) {
        this.ilosc = ilosc;
    }
}
