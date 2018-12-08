package rozgrzewka;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Money {
    private float kwota;
    private Currency currency;

    public Money(Currency currency, float kwota){
        this.kwota=kwota;
        this.currency=currency;
    }

    public float getKwota() {
        return kwota;
    }

    public void setKwota(float kwota) {
        this.kwota = kwota;
    }

    public Currency getCurrency() {
        return currency;
    }

    public void setCurrency(Currency currency) {
        this.currency = currency;
    }

    @Override
    public String toString() {
        return this.currency+" "+this.kwota;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Money money = (Money) o;
        return Float.compare(money.kwota, kwota) == 0 &&
                currency == money.currency;
    }
    public static Money parseToMoney(String money){
        String[] str = money.split(" ");
        try{
            return new Money((Currency.valueOf(str[0])),Float.parseFloat(str[1]));
        }catch (java.lang.IllegalArgumentException e){
            System.err.println("Niepoprawny format !!!   Powinien być jako"+ '"'+"WALUTA KWOTA"+'"'+" gdzie kwota jet typu double,a waluta Currency");
           return null;
        }


    }

    public Money convertCurrency( Currency currency){
        float cenaDoDolaraPoczatkowejWaluty= this.currency.getKwota();
        float cenaDoDolaraDocelowejWaluty= currency.getKwota();
        float kwotaWalutyPoczątkowej = this.kwota;
        float value =(cenaDoDolaraPoczatkowejWaluty*kwotaWalutyPoczątkowej/cenaDoDolaraDocelowejWaluty);

        return new Money(currency,value );

    }

    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("src/main/resources/przewalutowania.txt");
        Scanner in = new Scanner(file);


    }


}
