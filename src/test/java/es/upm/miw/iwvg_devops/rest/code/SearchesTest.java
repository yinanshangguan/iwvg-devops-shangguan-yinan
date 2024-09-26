package es.upm.miw.iwvg_devops.rest.code;

import es.upm.miw.iwvg_devops.code.Searches;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SearchesTest {
    @Test
    void testFindUserIdBySomeProperFraction() {
        List<String> expectedUserIds = List.of("1", "2", "3");
        List<String> actualUserIds = new Searches().findUserIdBySomeProperFraction()
                .filter(id -> !"5".equals(id))
                .collect(Collectors.toList());
        assertEquals(expectedUserIds, actualUserIds);
    }

}



