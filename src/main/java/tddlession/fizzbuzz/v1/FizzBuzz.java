package tddlession.fizzbuzz.v1;

public class FizzBuzz {

    public static String of(int num) {
        if(num % 3 == 0 && num % 5 ==0){
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
