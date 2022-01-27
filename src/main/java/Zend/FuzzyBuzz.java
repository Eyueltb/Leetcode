package Zend;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * Given  a number nm for each integer i in the range from 1 to n inclusive, print one value per line as follows.
 *      If i is a multiple of both 3 and 5, print FizzBuzz =>(i%5==0 && i%3==0)? "FizzBuzz"
 *      If i is a multiple of both 3(but not 5), print Fizz => (3==0)? "Fizz"
 *      If i is a multiple of both 5(but not 3), print Buzz => (i%5==0)? "Buzz"
 *      If i is a is not multiple of 3 or 5, print the value of i =>!(i%5==0 && i%3==0)? "i"
 *
 *      Remark- return null if input n is above the upper limit of values to test (inclusive)
 *      Input: n=15
 *      output:- 1,2,Fizz,4,Buzz,Fizz,7,8,Fizz,Buzz,11,Fizz,13,14,FizzBuzz
 */
class FizzBuzz{
     public static void fizzBuzz(int n){
         IntStream.rangeClosed(1,n)
                 .mapToObj(i->
                         (i%5==0 && i%3==0)? "FizzBuzz": (i%3==0) ?
                                 "Fizz": (i%5==0 ) ?  "Buzz": i)
                 .forEach(System.out::println);
     }

}
public class FuzzyBuzz {
    private void fuzzBuzz(int n){
        IntStream
                .rangeClosed(1,n)
                .mapToObj( i->(i%5==0 && i%3==0) ? "FuzzBuzz" : (i%5==0) ? "Buzz" : (i%3==0) ? "Fuzz" : "")
                .forEach(System.out::println);
    }

}

/**
 * Given an integer n, return a string array answer (1-indexed) where:
 *
 * answer[i] == "FizzBuzz" if i is divisible by 3 and 5.
 * answer[i] == "Fizz" if i is divisible by 3.
 * answer[i] == "Buzz" if i is divisible by 5.
 * answer[i] == i if non of the above conditions are true.
 *
 *
 * Example 1:
 *
 * Input: n = 3
 * Output: ["1","2","Fizz"]
 * Example 2:
 *
 * Input: n = 5
 * Output: ["1","2","Fizz","4","Buzz"]
 * Example 3:
 *
 * Input: n = 15
 * Output: ["1","2","Fizz","4","Buzz","Fizz","7","8","Fizz","Buzz","11","Fizz","13","14","FizzBuzz"]
 *
 * Remark- I tested in the leetcode and the test passes
 */
class LeetCodeFizzBuzz{
    public List<String> fizzBuzz(int n) {

      return IntStream.rangeClosed(1,n)
                .mapToObj(i->
                        (i%5==0 && i%3==0)? "FizzBuzz": (i%3==0) ?
                                "Fizz": (i%5==0 ) ?  "Buzz": i).map(Objects::toString).collect(Collectors.toList());
    }

}