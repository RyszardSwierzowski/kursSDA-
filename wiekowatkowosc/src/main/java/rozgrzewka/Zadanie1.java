package rozgrzewka;

import java.util.Random;

/*
    Piotruś w klasie na lekcji matematyki bardzo się nudził i pani postanowiła dać mu dodatkowe zadanie do rozwiązania.
    Piotruś otrzymał kartkę, na której napisane były małe liczby.
    Piotruś ma za zadanie stwierdzić, czy dana liczba jest palindromem
    (tzn. czy czyta się ją tak samo od lewej do prawej strony, jak od prawej do lewej).
    Jeżeli nie, Piotruś powinien dodać do siebie wartość liczby czytanej o
    do lewej do prawej oraz wartość liczby czytanej od prawej do lewej,
    sprawdzić, czy suma jest palindromem, i jeżeli nie -- kontynuować proces, aż otrzyma palindrom.
    Przykładowo, mając daną liczbę 28, Piotruś stwierdzi, że nie jest ona palindromem i wykona dodawanie 28 + 82 = 110.
    Liczba 110 wciąż nie jest palindromem, zatem Piotruś wykona jeszcze dodawanie 110 + 011 = 110 + 11 = 121.
    Wynik tego dodawania jest już palindromem, więc obliczenia zostaną zakończone.
    Twoim zadaniem jest napisać program, który dla każdej liczby rozważanej przez
    Piotrusia wypisze palindrom (wynik obliczeń Piotrusia), oraz liczbę dodawań prowadzących do wyniku.
 */
public class Zadanie1 {


    private static void zrobPalindrom(int liczba) {
        boolean isReady = false;
        int ile = 0;
        int temp1;

        StringBuilder sb;

        String liczbaDoStr;


        while (isReady == false) {
            liczbaDoStr = String.valueOf(liczba);
            sb = new StringBuilder(liczbaDoStr);
            if (liczbaDoStr.equals(sb.reverse().toString())) {
                break;
            } else {
                temp1 = Integer.parseInt(sb.toString());
                liczba += temp1;
                ile++;
            }


        }

        System.out.println(liczba + " -> " + ile + " razy");
    }

    public static void main(String[] args) {

        zrobPalindrom(2);
        zrobPalindrom(28);
        zrobPalindrom(121);
    }
}
