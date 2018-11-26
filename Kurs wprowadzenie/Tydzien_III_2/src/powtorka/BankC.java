package powtorka;

public class BankC extends AbstractBank {
    private static final double PROWIZJA=0.25;

    @Override
    protected double computerCommistion() {
        return kwota*PROWIZJA;
    }

    @Override
    protected void decreaseAmount(double val) {
        kwota=kwota-val;
    }


}
