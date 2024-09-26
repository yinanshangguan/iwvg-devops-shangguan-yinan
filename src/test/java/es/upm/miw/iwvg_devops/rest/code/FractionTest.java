package es.upm.miw.iwvg_devops.rest.code;

import es.upm.miw.iwvg_devops.code.Fraction;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class FractionTest {

    @Test
    void testDecimal() {
        Fraction fraction = new Fraction(1, 2);
        assertEquals(0.5, fraction.decimal(), 0.001);
    }

    @Test
    void testToString() {
        Fraction fraction = new Fraction(3, 4);
        assertEquals("Fraction{numerator=3, denominator=4}", fraction.toString());
    }

    @Test
    void testSetNumerator() {
        Fraction fraction = new Fraction();
        fraction.setNumerator(5);
        assertEquals(5, fraction.getNumerator());
    }

    @Test
    void testSetDenominator() {
        Fraction fraction = new Fraction();
        fraction.setDenominator(7);
        assertEquals(7, fraction.getDenominator());
    }

    @Test
    void testGetNumerator() {
        Fraction fraction = new Fraction(4, 5);
        assertEquals(4, fraction.getNumerator());
    }

    @Test
    void testGetDenominator() {
        Fraction fraction = new Fraction(4, 5);
        assertEquals(5, fraction.getDenominator());
    }

    @Test
    void testConstructor() {
        Fraction fraction = new Fraction(8, 10);
        assertEquals(8, fraction.getNumerator());
        assertEquals(10, fraction.getDenominator());
    }

    @Test
    void testDefaultConstructor() {
        Fraction fraction = new Fraction();
        assertEquals(1, fraction.getNumerator());
        assertEquals(1, fraction.getDenominator());
    }
}
