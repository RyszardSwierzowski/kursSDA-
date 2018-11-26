import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class WalidacjaPeselTest {

    @ParameterizedTest
    @ValueSource(strings={
            "83100352677",
            "94053176197",
            "48100996186",
            "79050274758",
            "51110335438",
            "89082076695",
            "95070947975",
            "79121549839",
            "90011187283",
            "43102337159",})
    void shouldReturnTrueForIsValidIfValueIsCorrect(String param) {
        // given
        WalidacjaPesel pesel = new WalidacjaPesel();
        //when
        boolean seq = pesel.isValidPesel(param);
        //then
        assertEquals(true,seq);
    }
    @Test
    void shouldReturnMężczyznaForInitGetGenderByPeselForMen() {
        // given
        WalidacjaPesel pesel = new WalidacjaPesel();
        //when
        String expectedResult = pesel.getGenderByPesel("94032912930");
        //then
        assertEquals("Mężczyzna", expectedResult);
    }
    @Test
    void shouldReturnKobietaForInitGetGenderByPeselForMen() {
        // given
        WalidacjaPesel pesel = new WalidacjaPesel();
        //when
        String expectedResult = pesel.getGenderByPesel("65120722889");
        //then
        assertEquals("Kobieta", expectedResult);
    }


}