package konwertowanieRzymskieArabskie;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class ConvertRomanToArabicTest
{
    @Test
    public void shouldReturn0ForEmptyString(){
        //
        ConvertRomanToArabic convertRomanToArabic = new ConvertRomanToArabic();

        //
        String emptyString = "";

        //
        assertEquals(0,convertRomanToArabic.convertToArabic(emptyString));
    }

    @ParameterizedTest
    @ValueSource(strings = {"i","Iii","iii"})
    public void shouldReturnTrueIsCorrectRomanNumber(String param){
        //
        ConvertRomanToArabic convertRomanToArabic = new ConvertRomanToArabic();
        //
        boolean seq = convertRomanToArabic.isRomanNumber(param);
        //
        assertTrue(seq);

    }
    @Test
    public void shouldReturn1_2_3_4ForI_II_III_IV(){
        //
        ConvertRomanToArabic convertRomanToArabic = new ConvertRomanToArabic();
        //
        int expected1 = convertRomanToArabic.convertToArabic("i");
        int expected2 = convertRomanToArabic.convertToArabic("ii");
        int expected3 = convertRomanToArabic.convertToArabic("iii");
        int expected4 = convertRomanToArabic.convertToArabic("iv");
        //
        assertAll("Roman",
                ()->assertEquals(1,expected1),
                ()->assertEquals(2,expected2),
                ()->assertEquals(3,expected3),
                ()->assertEquals(4,expected4));

    }


    @Test
    public void shouldReturn5_6_7_8ForV_VI_VII_VII(){
        //
        ConvertRomanToArabic convertRomanToArabic = new ConvertRomanToArabic();
        //
        int expected1 = convertRomanToArabic.convertToArabic("V");
        int expected2 = convertRomanToArabic.convertToArabic("VI");
        int expected3 = convertRomanToArabic.convertToArabic("VII");
        int expected4 = convertRomanToArabic.convertToArabic("VIII");
        //
        assertAll("Roman",
                ()->assertEquals(5,expected1),
                ()->assertEquals(6,expected2),
                ()->assertEquals(7,expected3),
                ()->assertEquals(8,expected4));

    }
    @Test
    public void shouldReturn9ForIX(){
        //
        ConvertRomanToArabic convertRomanToArabic = new ConvertRomanToArabic();
        //
        int expected = convertRomanToArabic.convertToArabic("ix");
        //
    }

    @Test
    public void shouldReturnCorrectRomanNumber(){
        //
        ConvertRomanToArabic convertRomanToArabic = new ConvertRomanToArabic();
        //
        int expected1 = convertRomanToArabic.convertToArabic("CCIX");
        int expected2 = convertRomanToArabic.convertToArabic("MM");
        int expected3 = convertRomanToArabic.convertToArabic("DC");
        int expected4 = convertRomanToArabic.convertToArabic("LIX");
        int expected5 = convertRomanToArabic.convertToArabic("xc");
        int expected6 = convertRomanToArabic.convertToArabic("xix");
        //
        assertAll("Roman",
                ()->assertEquals(209,expected1),
                ()->assertEquals(2000,expected2),
                ()->assertEquals(600,expected3),
                ()->assertEquals(59,expected4),
                ()->assertEquals(90,expected5),
                ()->assertEquals(19,expected6));

    }
}