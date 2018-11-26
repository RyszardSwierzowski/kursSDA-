package KolkoIKrzyzyk;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class KolkoIKrzyzykTest {
    static KolkoIKrzyzyk kolkoIKrzyzyk;
    static Gracz gracz1;
    static Gracz gracz2;
    static char[][] tab = new char[3][3];

    @BeforeEach
    private void initTest() {
        kolkoIKrzyzyk = new KolkoIKrzyzyk();
        gracz1 = new Gracz('X');
        gracz2 = new Gracz('Y');
    }
}

