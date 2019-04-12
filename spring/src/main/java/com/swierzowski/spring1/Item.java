package com.swierzowski.spring1;

public class Item {
    private String nazwa;
    private Integer cena;
    private String opis;

    public Item(String nazwa, Integer cena, String opis) {
        this.nazwa = nazwa;
        this.cena = cena;
        this.opis = opis;
    }

    public Item() {
    }

    public String getNazwa() {
        return nazwa;
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }

    public Integer getCena() {
        return cena;
    }

    public void setCena(Integer cena) {
        this.cena = cena;
    }

    public String getOpis() {
        return opis;
    }

    public void setOpis(String opis) {
        this.opis = opis;
    }

    @Override
    public String toString() {
        return "Item{" +
                "nazwa='" + nazwa + '\'' +
                ", cena=" + cena +
                ", opis='" + opis + '\'' +
                '}';
    }
}


