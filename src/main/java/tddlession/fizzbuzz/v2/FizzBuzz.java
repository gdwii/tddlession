package tddlession.fizzbuzz.v2;

/**
 * @className: tddlession.fizzbuzz.v2.FizzBuzz
 * @description: 
 * @author gdw
 * @date 2019-08-13 16:02:44
 */
public class FizzBuzz {
    public static String of(int num) {
        if(num % 15 == 0){
            return "fizzbuzz";
        }
        if(num % 3 == 0){
            return "fizz";
        }
        if(num % 5 == 0){
            return "buzz";
        }

        return String.valueOf(num);
    }
}
