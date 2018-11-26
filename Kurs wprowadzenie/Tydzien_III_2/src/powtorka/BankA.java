package powtorka;

public class BankA implements BankOperations {
    private static double kwota=15;
    public static final double PROWIZJA=0.15;
    @Override
    public double computerCommistion() {

        return kwota*PROWIZJA;
    }

    @Override
    public void incresseAmount(double val) {
        kwota=kwota+val;
    }

    @Override
    public void decreaseAmount(double val) {
        kwota=kwota-val;
        if(kwota>0){
            kwota=0;
        }

    }
}
