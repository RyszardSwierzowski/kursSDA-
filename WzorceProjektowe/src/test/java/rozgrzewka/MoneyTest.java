package rozgrzewka;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class MoneyTest {

//    @BeforeEach
//    public void startTest(){
//        Money money =
//    }

    @Test
    public void returnCurrentAndValueWhenToString(){
        //
        Money money = new Money(Currency.DOLAR, 45);
        //
        String result = money.toString();
        //
        assertEquals("DOLAR : 45.0",result);
    }

    @Test
    public void sholudReturnTrueIfTwoObjAreEquals(){
        //
        Money money = new Money(Currency.EURO,55);
        //
        assertAll("equals",
                ()->assertEquals(true,money.equals(new Money(Currency.EURO,55))),
                ()->assertEquals(false,money.equals(new Money(Currency.DOLAR,55))),
                ()->assertEquals(false,money.equals(new Money(Currency.EURO,35))),
                ()->assertEquals(false,money.equals(new Money(Currency.FRANK_SZWAJCARSKI,11)))
                );
    }

    @Test
    public void shouldReturnNewMonayWhenParseToMoneyWithEuro_45(){
        //
        String arg="EURO 45";
        Money money ;
        //
        Money result= Money.parseToMoney(arg);
        //
        assertEquals(new Money(Currency.EURO,45), result);
    }

    @ParameterizedTest
    @ValueSource(strings = {"Dolar 45","DOLAR45"})
    public void shouldTrowExceptionWhenParseToMoneyWithWrongFormat(String param){
        //
        Money money ;
       // String arg="EURO45";
        //

        //
        assertEquals(null, Money.parseToMoney(param));
    }

    @Test
    public void shouldReturnGoodNewMoney(){
        //
        Money moneyInput = new Money(Currency.FRANK_SZWAJCARSKI,100);
        //
        Money moneyResult = moneyInput.convertCurrency(Currency.EURO);
        //
        assertEquals(new Money(Currency.EURO,87.5f), moneyResult);
    }

}