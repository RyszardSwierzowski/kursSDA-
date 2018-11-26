package powtorka;

public abstract class AbstractBank {
    protected static double kwota;

    //protected static final double PROWIZJA;



    protected abstract double computerCommistion();
    protected void incresseAmount(double val){
        kwota=kwota+val;
    }
    protected abstract void decreaseAmount(double val);

}
