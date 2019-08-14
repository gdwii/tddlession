package tddlession.fizzbuzz.v4;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class GameNumberTest {
    @Test
    public void should_show_raw_number_for_normal_number(){
        checkGameNumberOutput(1, "1");
        checkGameNumberOutput(2, "2");
    }
    
    @Test
    public void should_show_fizz_if_raw_number_is_divisible_by_3(){
        checkGameNumberOutput(3, "fizz");
        checkGameNumberOutput(6, "fizz");
    }

    @Test
    public void should_show_buzz_if_raw_number_is_divisible_by_5(){
        checkGameNumberOutput(5, "buzz");
        checkGameNumberOutput(10, "buzz");
    }

    @Test
    public void should_show_fizzbuzz_if_raw_number_is_divisible_by_3_and_5(){
        checkGameNumberOutput(15, "fizzbuzz");
    }

    @Test
    public void should_show_fizz_or_buzz_if_raw_number_contain_3_or_5(){
        checkGameNumberOutput(31, "fizz");
        checkGameNumberOutput(51, "fizzbuzz");
        checkGameNumberOutput(52, "buzz");
        checkGameNumberOutput(53, "fizzbuzz");
    }

    private void checkGameNumberOutput(int i, String fizz) {
        Assertions.assertEquals(new GameNumber(i).toString(), fizz);
    }
}
