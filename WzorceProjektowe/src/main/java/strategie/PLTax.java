package strategie;

public class PLTax implements TaxStartegy {
    float tax = 0.23f;

    @Override
    public Float calculate(Float income) {
        return income * tax;
    }
}
