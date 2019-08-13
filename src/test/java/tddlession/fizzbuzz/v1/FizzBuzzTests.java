package tddlession.fizzbuzz.v1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FizzBuzzTests {
    @Test
    public void should_show_raw_num_of_normal_num(){
        Assertions.assertEquals(FizzBuzz.of(1), "1");
        Assertions.assertEquals(FizzBuzz.of(2), "2");
    }

    @Test
    public void should_show_fizz_when_num_diviable_by_3(){
        Assertions.assertEquals(FizzBuzz.of(3), "fizz");
        Assertions.assertEquals(FizzBuzz.of(6), "fizz");
    }

    @Test
    public void should_show_buzz_when_num_diviable_by_5(){
        Assertions.assertEquals(FizzBuzz.of(5), "buzz");
        Assertions.assertEquals(FizzBuzz.of(10), "buzz");
    }

    @Test
    public void shoule_show_fizzbuzz_when_num_diviable_by_5_and_3(){
        Assertions.assertEquals(FizzBuzz.of(15), "fizzbuzz");
        Assertions.assertEquals(FizzBuzz.of(45), "fizzbuzz");
    }
}
