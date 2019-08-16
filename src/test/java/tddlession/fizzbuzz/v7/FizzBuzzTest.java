package tddlession.fizzbuzz.v7;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class FizzBuzzTest {
    @ParameterizedTest(name = "should return {0} given {1}")
    @CsvSource({
            "1,1"
            ,"2,2"
            ,"3,fizz"
            ,"5,buzz"
            ,"15,fizzbuzz"
            ,"31,fizz"
            ,"52,buzz"
            ,"53,fizzbuzz"
        }
    )
    public void testFizzBuzz(int input, String expected){
        GameNumber gameNumber = new GameNumber(input);
        Assertions.assertEquals(expected, gameNumber.toString());
    }
}
