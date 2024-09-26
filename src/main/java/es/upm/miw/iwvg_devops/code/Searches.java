package es.upm.miw.iwvg_devops.code;

import org.apache.logging.log4j.LogManager;

import java.util.Objects;
import java.util.stream.Stream;

public class Searches {
    public Stream<String> findUserIdBySomeProperFraction() {
        return new UsersDatabase().findAll()
                .filter(user -> user.getFractions().stream()
                        .anyMatch(fraction -> fraction.getNumerator() < fraction.getDenominator()))
                .map(User::getId)
                .distinct();
    }
    public Stream<Double> findDecimalFractionByNegativeSignFraction() {
        return new UsersDatabase().findAll()
                .flatMap(user -> user.getFractions().stream())
                .filter(fraction -> fraction.getNumerator() < 0)
                .map(Fraction::decimal);
    }
}