import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ValidatorTest {

    @Test
    void isAdult() {
        // given
        Validator val = new Validator();

        // where
        assertAll("Age",
                () -> assertFalse(val.isAdult(17)),
                () -> assertTrue(val.isAdult(18)),
                () -> assertTrue(val.isAdult(19))
        );

        // then
    }


}