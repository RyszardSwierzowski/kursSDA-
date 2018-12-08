package rozgrzewka;

public enum Currency {

    EURO(1.12f),
    DOLAR(1f),
    ZŁOTE(0.26f),
    FRANK_SZWAJCARSKI(0.98f);
    private float kwota;
    Currency(float kwota){
        this.kwota=kwota;
    }

    public float getKwota() {
        return kwota;
    }
}
