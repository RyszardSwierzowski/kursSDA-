import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class FizzBuzz
{
    public static String generateFizzBuzzGameNumber(int number){


        if(number==0){
            return number+", ";
        }
        else if(number%3==0 && number%5==0){
            return ("Fizz Buzz, ");
        }
        else if(number%3==0){
            return "Fizz, ";
        }else if(number%5==0){
            return "Buzz, ";
        }else{
            return number+", ";
        }
    }

    public static String playInFizzBuzzGame(int seq){
        final String result =IntStream.range(1,seq)
                .mapToObj(i ->generateFizzBuzzGameNumber(i))
                .collect(Collectors.joining());
        return result;
    }
}
