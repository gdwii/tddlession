package tddlession.fizzbuzz.v6;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FizzBuzzTest {
    @Test
    public void should_show_raw_number_if_normal_number(){
        checkGameNumberOutput("1", 1);
        checkGameNumberOutput("2", 2);
    }

    @Test
    public void should_show_fizz_if_raw_number_is_divisible_by_3(){
        checkGameNumberOutput("fizz", 3);
    }

    @Test
    public void should_show_buzz_if_raw_number_id_divisible_by_5(){
        checkGameNumberOutput("buzz", 5);
    }

    @Test
    public void should_show_fizzbuzz_if_raw_number_is_divisible_by_3_and_5(){
        checkGameNumberOutput("fizzbuzz", 15);
    }

    @Test
    public void should_show_fizz_or_buzz_if_raw_number_is_related_to_3_or_5(){
        checkGameNumberOutput("fizz", 32);
        checkGameNumberOutput("buzz", 52);
        checkGameNumberOutput("fizzbuzz", 53);
    }

    private void checkGameNumberOutput(String fizz, int i) {
        Assertions.assertEquals(fizz, new GameNumber(i).toString());
    }
}
