package tddlession.fizzbuzz.v2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

/**
 * @author gdw
 * @className: tddlession.fizzbuzz.v2.FizzBuzzTests
 * @description:
 * @date 2019-08-13 16:01:18
 */
public class FizzBuzzTests {
    @ParameterizedTest(name = "should return {0} given {1}")
    @CsvSource({
            "1,1",
            "3,fizz",
            "5,buzz ",
            "15,fizzbuzz"
    })
    public void test_of(int num, String output) {
        Assertions.assertEquals(FizzBuzz.of(num), output);
    }
}
