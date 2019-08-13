package tddlession.fizzbuzz.v3;

/**
 * @className: tddlession.fizzbuzz.v3.FizzBuzz
 * @description: 
 * @author gdw
 * @date 2019-08-13 16:47:42
 */
public class FizzBuzz {
    public static String of(int num) {
        if(num % 15 == 0 || (String.valueOf(num).contains("3") && String.valueOf(num).contains("5"))){
            return "fizzbuzz";
        }
        if(num % 3 == 0 || String.valueOf(num).contains("3")){
            return "fizz";
        }
        if(num % 5 == 0 || String.valueOf(num).contains("5")){
            return "buzz";
        }
        return String.valueOf(num);
    }
}
