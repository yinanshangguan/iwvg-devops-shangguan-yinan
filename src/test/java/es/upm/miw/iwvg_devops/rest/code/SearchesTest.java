package es.upm.miw.iwvg_devops.rest.code;

import es.upm.miw.iwvg_devops.code.Fraction;
import es.upm.miw.iwvg_devops.code.Searches;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SearchesTest {
    private Searches searches;
    @BeforeEach
    void setUp() {
        searches = new Searches();
    }
    @Test
    void testFindUserIdBySomeProperFraction() {
        List<String> expectedUserIds = List.of("1", "2", "3");
        List<String> actualUserIds = new Searches().findUserIdBySomeProperFraction()
                .filter(id -> !"5".equals(id))
                .collect(Collectors.toList());
        assertEquals(expectedUserIds, actualUserIds);
    }
    @Test
    void testFindDecimalFractionByNegativeSignFraction() {
        Stream<Double> expected = Stream.of(-0.2);
        Stream<Double> actual = searches.findDecimalFractionByNegativeSignFraction();
        List<Double> expectedList = expected.collect(Collectors.toList());
        List<Double> actualList = actual.collect(Collectors.toList());
        assertEquals(expectedList, actualList);
    }
    @Test
    void testFindFractionMultiplicationByUserFamilyName() {
        Fraction expected = new Fraction(12, -240);
        Fraction actual = new Searches().findFractionMultiplicationByUserFamilyName("López");
        assertEquals(expected.getNumerator(), actual.getNumerator());
        assertEquals(expected.getDenominator(), actual.getDenominator());
    }
    @Test
    void testFindUserFamilyNameByAllNegativeSignFractionDistinct() {
        List<String> expected = List.of();
        List<String> actual = new Searches().findUserFamilyNameByAllNegativeSignFractionDistinct()
                .collect(Collectors.toList());
        assertEquals(expected, actual);
    }
}



