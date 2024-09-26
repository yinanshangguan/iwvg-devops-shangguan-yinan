package es.upm.miw.iwvg_devops.rest.code;

import es.upm.miw.iwvg_devops.code.Fraction;
import es.upm.miw.iwvg_devops.code.User;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class UserTest {
    private User user;
    private Fraction fraction1;
    private Fraction fraction2;

    @BeforeEach
    void setUp() {
        fraction1 = new Fraction(1, 2);
        fraction2 = new Fraction(3, 4);

        List<Fraction> fractions = new ArrayList<>();
        fractions.add(fraction1);
        fractions.add(fraction2);

        user = new User("1", "John", "Doe", fractions);
    }

    @Test
    void testFullName() {
        assertEquals("John Doe", user.fullName());
    }

    @Test
    void testInitials() {
        assertEquals("J.", user.initials());
    }

    @Test
    void testAddFraction() {
        Fraction newFraction = new Fraction(2, 5);
        user.addFraction(newFraction);
        List<Fraction> fractions = user.getFractions();
        assertEquals(3, fractions.size());
        assertEquals(newFraction, fractions.get(2));
    }

    @Test
    void testGetId() {
        assertEquals("1", user.getId());
    }

    @Test
    void testGetName() {
        assertEquals("John", user.getName());
    }

    @Test
    void testGetFamilyName() {
        assertEquals("Doe", user.getFamilyName());
    }

    @Test
    void testSetAndGetFractions() {
        List<Fraction> newFractions = new ArrayList<>();
        Fraction fraction3 = new Fraction(2, 5);
        newFractions.add(fraction3);
        user.setFractions(newFractions);
        assertEquals(newFractions, user.getFractions());
    }

    @Test
    void testToString() {
        String expected = "User{id='1', name='John', familyName='Doe', fractions=[Fraction{numerator=1, denominator=2}, Fraction{numerator=3, denominator=4}]}";
        assertEquals(expected, user.toString());
    }

}