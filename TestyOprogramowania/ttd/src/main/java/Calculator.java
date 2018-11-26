import java.math.BigDecimal;

public class Calculator
{
    public static String add(String a, String b) {
        BigDecimal firstNumber = new BigDecimal(a);
        BigDecimal secondNumber = new BigDecimal(b);
        return firstNumber.add(secondNumber).toPlainString();
    }

    public static void main(String[] args) {
        System.out.println(add("1","2"));
    }




}
