import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class FizzBuzzTest {
    @Test
    public void shouldReturn0WhengenerateFizzBuzzGameNumberWith0(){
        // given
        FizzBuzz fb = new FizzBuzz();
        // when
        String result = fb.generateFizzBuzzGameNumber(0);
        //then
        assertEquals("0, ",result);
    }
    @Test
    public void shouldReturn0WhengenerateFizzBuzzGameNumberWith15(){
        // given
        FizzBuzz fb = new FizzBuzz();
        // when
        String result = fb.generateFizzBuzzGameNumber(15);
        //then
        assertEquals("Fizz Buzz, ",result);
    }
    @Test
    public void shouldReturnFizzWhengenerateFizzBuzzGameNumberWith9(){
        // given
        FizzBuzz fb = new FizzBuzz();
        // when
        String result = fb.generateFizzBuzzGameNumber(9);
        //then
        assertEquals("Fizz, ",result);
    }
    @Test
    public void shouldReturnBuzzWhengenerateFizzBuzzGameNumberWith10(){
        // given
        FizzBuzz fb = new FizzBuzz();
        // when
        String result = fb.generateFizzBuzzGameNumber(10);
        //then
        assertEquals("Buzz, ",result);
    }
    @Test
    public void shouldReturn11WhengenerateFizzBuzzGameNumberWith11(){
        // given
        FizzBuzz fb = new FizzBuzz();
        // when
        String result = fb.generateFizzBuzzGameNumber(11);
        //then
        assertEquals("11, ",result);
    }




   // @Test
    public void generateFizzBuzzGameNumber(){
        // given
        FizzBuzz fb = new FizzBuzz();
        // when
        assertAll("FizzBuzz",
                ()->assertEquals("0, ",fb.generateFizzBuzzGameNumber(0)),
                ()->assertEquals("Fizz Buzz, ",fb.generateFizzBuzzGameNumber(15)),
                ()->assertEquals("Fizz, ",fb.generateFizzBuzzGameNumber(9)),
                ()->assertEquals("Buzz, ",fb.generateFizzBuzzGameNumber(10)),
                ()->assertEquals("11, ",fb.generateFizzBuzzGameNumber(11))
                );
        // then
    }

    @Test
    public void playInFizzBuzzGame(){
        String value = "1, 2, Fizz, 4, Buzz, Fizz, 7, 8, Fizz, Buzz, 11, Fizz, 13, 14, Fizz Buzz, 16, 17, Fizz, 19, Buzz, ";
        // given
        FizzBuzz fb = new FizzBuzz();
        // when
        String result = fb.playInFizzBuzzGame(21);

        // then
        assertEquals(value,result);
    }

    // testy z parametrem
    @ParameterizedTest
    @ValueSource (ints={15,30})
    public void shouldReturnFizzBuzzForParam(int param){
        // given
        String expected ="Fizz Buzz, ";
        FizzBuzz fb = new FizzBuzz();
        // when
        String seq =fb.generateFizzBuzzGameNumber(param);
        //then
        assertEquals(expected,seq);
    }


}