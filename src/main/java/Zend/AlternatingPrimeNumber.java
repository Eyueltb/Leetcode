package Zend;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.stream.IntStream;

/**
 * Write a method that takes an integer called 'max' as argument and that writes all prime numbers from (and including) 3 to
 * (and including) 'max' to the console.
 * Write the prime numbers alternating like this: Write the lowest prime on the first line. Write the highest prime number on
 * the second line. Write the second-lowest prime number on the third line. Write the second-highest prime number on the
 * fourth line. Continue writing all the prime numbers according to that pattern.
 * Also, check that the 'max' argument is greater than 3 and throw an exception if it isn't.
 * Sample usage:
 * AlternatingPrimeNumberWriter(15);
 * // This is written to the console:
 * // 3
 * // 13
 * // 5
 * // 11
 * // 7
 */
public class AlternatingPrimeNumber {
    /** TODO- Do using stream */
    private static boolean isPrimeStream(int max){
        //IntStream.range(2, max).filter(i -> (max % i == 0));
       return false;
    }
    private static boolean isPrime(int max) {
         for (int i = 2; i < max; i++) {
            if (max % i == 0)
                return false;
        }
        return true;
    }
    private static void AlternatingPrimeNumberWriter(int max)
    {
        List<Integer> prime = new ArrayList<>();
        for (int i = 3; i <= max; i++) {
            if (isPrime(i))
                prime.add(i);
        }
        List<Integer> reversedPrime = new ArrayList<>(prime);
        Collections.reverse(reversedPrime);
        List<Integer> alternativePrimes = new ArrayList<>();
        for (int i=0;i<prime.size();i++) {
            if (!alternativePrimes.contains(prime.get(i)))
            {
                alternativePrimes.add(prime.get(i));
            }
            if (!alternativePrimes.contains(reversedPrime.get(i)))
            {
              alternativePrimes.add(reversedPrime.get(i));
            }
        }
        for (int pr:alternativePrimes) {
            System.out.println(pr);
        }
    }

    public static void main(String[] args) {
        AlternatingPrimeNumber.AlternatingPrimeNumberWriter(15);
        System.out.println("....");
        AlternatingPrimeNumber.isPrimeStream(15);
    }
}
