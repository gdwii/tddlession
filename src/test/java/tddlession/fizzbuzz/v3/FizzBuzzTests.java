package tddlession.fizzbuzz.v3;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class FizzBuzzTests {
    @ParameterizedTest(name = "should return {0} given {1}")
    @CsvSource({
            "1,1",
            "3,fizz",
            "31,fizz",
            "5,buzz",
            "52,buzz",
            "15,fizzbuzz",
            "35,fizzbuzz "

        }
    )
    public void test(int num, String out){
        Assertions.assertEquals(FizzBuzz.of(num), out);
    }
}
