package zapychaczeCzasu;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WalidacjaHaslaTest {

    @Test
    void validateNewPassword() {
        String s1 = "!AaZZ10!@#$%";
        String s2 = "weqweq2";


        assertAll("pass",
                () -> assertEquals(true, WalidacjaHasla.validateNewPassword(s1)),
                () -> assertEquals(false, WalidacjaHasla.validateNewPassword(s2)));
    }

    @Test
    void isPasswordHave2Numbers() {
        String s1 = "!AaZZ10!@#$%";
        String s2 = "weqweq2";
        char[] tab1 = s1.toCharArray();
        char[] tab2 = s2.toCharArray();
        boolean t1 = WalidacjaHasla.isPasswordHave2Numbers(tab1);
        boolean t2 = WalidacjaHasla.isPasswordHave2Numbers(tab2);

        assertAll("pass",
                () -> assertEquals(true, t1),
                () -> assertEquals(false, t2));
    }

    @Test
    void isPassHaveCorrectChars() {
        String s1 = "!AaZZ10!@#$%";
        String s2 = "      ";
        char[] tab1 = s1.toCharArray();
        char[] tab2 = s2.toCharArray();
        boolean t1 = WalidacjaHasla.isPassHaveCorrectChars(tab1);
        boolean t2 = WalidacjaHasla.isPassHaveCorrectChars(tab2);

        assertAll("pass",
                () -> assertEquals(true, t1),
                () -> assertEquals(false, t2));


    }

    @Test
    void isPassHAveBigLetter() {
        String s1 = "Aqewq2e1";
        String s2 = "weqweq2";
        char[] tab1 = s1.toCharArray();
        char[] tab2 = s2.toCharArray();
        boolean t1 = WalidacjaHasla.isPassHAveBigLetter(tab1);
        boolean t2 = WalidacjaHasla.isPassHAveBigLetter(tab2);

        assertAll("pass",
                () -> assertEquals(true, t1),
                () -> assertEquals(false, t2));

    }

    @Test
    void isPassHaveSpecialChar() {
        String s1 = "!!@#$%";
        String s2 = "weqweq2";
        char[] tab1 = s1.toCharArray();
        char[] tab2 = s2.toCharArray();
        boolean t1 = WalidacjaHasla.isPassHaveSpecialChar(tab1);
        boolean t2 = WalidacjaHasla.isPassHaveSpecialChar(tab2);

        assertAll("pass",
                () -> assertEquals(true, t1),
                () -> assertEquals(false, t2));

    }


}