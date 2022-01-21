package test;

import com.exercises.model.RomanNumeral;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RomanNumeralTest {

    @Test
    public void checkConvertingIntegerToRomanNumeral() {
        //Arrange
        RomanNumeral romanNumeral = new RomanNumeral();

        //Act
        String s = romanNumeral.convertIntegerToRomanNumeral(25);

        //Assert
        assertEquals("XXV", s);
    }

    @Test
    public void checkConvertingIntegerToRomanNumeralCheckAGreaterNumber() {
        //Arrange
        RomanNumeral romanNumeral = new RomanNumeral();

        //Act
        String s = romanNumeral.convertIntegerToRomanNumeral(3140);

        //Assert
        assertEquals("This number cannot be converted to roman numeral", s);
    }


    @Test
    public void checkConvertingIntegerToRomanNumeralCheckALesserNumber() {
        //Arrange
        RomanNumeral romanNumeral = new RomanNumeral();

        //Act
        String s = romanNumeral.convertIntegerToRomanNumeral(0);

        //Assert
        assertEquals("This number cannot be converted to roman numeral", s);
    }

    @Test
    public void checkConvertingRomaNumeralToInteger() {
        //Arrange
        RomanNumeral romanNumeral = new RomanNumeral();

        //Act
        int n = romanNumeral.convertRomanNumeralToInteger("XXV");

        //Assert
        assertEquals(25, n);
    }

    @Test
    public void checkConvertingRomaNumeralToIntegerCheckNullString() {
        //Arrange
        RomanNumeral romanNumeral = new RomanNumeral();

        //Act
        int n = romanNumeral.convertRomanNumeralToInteger("");

        //Assert
        assertEquals(-1, n);
    }

    @Test
    public void checkConvertingRomaNumeralToIntegerCheckAnotherNumber() {
        //Arrange
        RomanNumeral romanNumeral = new RomanNumeral();

        //Act
        int n = romanNumeral.convertRomanNumeralToInteger("LV");

        //Assert
        assertEquals(55, n);
    }

}
