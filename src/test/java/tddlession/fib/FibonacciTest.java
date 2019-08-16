package tddlession.fib;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FibonacciTest {
    @Test
    public void should_show_0_if_fib0(){
        checkFibonacciOutput(0, 0);
    }

    @Test
    public void should_show_1_if_fib1(){
        checkFibonacciOutput(1, 1);
    }

    @Test
    public void should_show_1_if_fib2(){
        checkFibonacciOutput(1, 2);
    }

    private void checkFibonacciOutput(int expected, int num) {
        Assertions.assertEquals(expected, Fibonacci.fib(num));
    }
}
