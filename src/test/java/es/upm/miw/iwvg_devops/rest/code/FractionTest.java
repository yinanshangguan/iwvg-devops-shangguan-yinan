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
    void testEquals() {
        Fraction fraction1 = new Fraction(2, 3);
        Fraction fraction2 = new Fraction(2, 3);
        Fraction fraction3 = new Fraction(3, 4);

        assertEquals(fraction1, fraction2);
        assertNotEquals(fraction1, fraction3);
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
    void testIsProper() {
        Fraction properFraction = new Fraction(1, 2);
        assertTrue(properFraction.isProper());

        Fraction improperFraction = new Fraction(3, 2);
        assertFalse(improperFraction.isProper());
    }

    @Test
    void testIsImproper() {
        Fraction properFraction = new Fraction(1, 2);
        assertFalse(properFraction.isImproper());

        Fraction improperFraction = new Fraction(3, 2);
        assertTrue(improperFraction.isImproper());
    }

    @Test
    void testIsEquivalent() {
        Fraction fraction1 = new Fraction(1, 2);
        Fraction fraction2 = new Fraction(2, 4);
        assertTrue(fraction1.isEquivalent(fraction2));

        Fraction fraction3 = new Fraction(3, 5);
        Fraction fraction4 = new Fraction(6, 10);
        assertTrue(fraction3.isEquivalent(fraction4));

        Fraction fraction5 = new Fraction(2, 3);
        Fraction fraction6 = new Fraction(3, 4);
        assertFalse(fraction5.isEquivalent(fraction6));
    }

    @Test
    void testAdd() {
        Fraction fraction1 = new Fraction(1, 2);
        Fraction fraction2 = new Fraction(1, 4);
        Fraction result = fraction1.add(fraction2);
        assertEquals(new Fraction(6, 8), result);
    }

    @Test
    void testMultiply() {
        Fraction fraction1 = new Fraction(1, 2);
        Fraction fraction2 = new Fraction(2, 3);
        Fraction result = fraction1.multiply(fraction2);
        assertEquals(new Fraction(2, 6), result);
    }

    @Test
    void testDivide() {
        Fraction fraction1 = new Fraction(1, 2);
        Fraction fraction2 = new Fraction(3, 4);
        Fraction result = fraction1.divide(fraction2);
        assertEquals(new Fraction(4, 6), result);
    }
}