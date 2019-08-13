package tddlession.fizzbuzz.v3;

import java.util.stream.IntStream;

/**
 * @className: tddlession.fizzbuzz.v3.FizzBuzzClient
 * @description: 
 * @author gdw
 * @date 2019-08-13 16:49:59
 */
public class FizzBuzzClient {
    public static void main(String[] args) {
        IntStream.range(1, 100).forEach(i -> System.out.println(FizzBuzz.of(i)));
    }
}
