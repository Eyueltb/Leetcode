package arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class PrimeNumbers {
    private List<Integer> getPrimeNumbersUsingSieveOfEratosthenes(int n){
        boolean prime[] = new boolean[n+1];
        List<Integer> primeNumbers=new ArrayList<>();
        for(int i=0;i<=n;i++)
            prime[i] = true;

        for(int p = 2; p*p <=n; p++)
        {
            if(prime[p] == true)
            {
                // Update all multiples of p
                for(int i = p*p; i <= n; i += p)
                    prime[i] = false;
            }
        }

        for(int i = 2; i <= n; i++)
        {
            if(prime[i] == true)
                primeNumbers.add(i);

        }

        return primeNumbers;
    }
    public boolean checkPerfectNumber(int num) {
        //find the prime number less than num
        final var primes = getPrimeNumbersUsingSieveOfEratosthenes(num);
        //int[] primes=new int[]{2,3,5,7,13,17,19,31};
        for (int prime: primes) {
            if (perfectNumber(prime) == num)
                return true;
        }
        return false;
    }
    private int perfectNumber(int p) {
        return (1 << (p - 1)) * ((1 << p) - 1);
    }
    public static void main(String[] args) {
        PrimeNumbers primeNumbers=new PrimeNumbers();
        int count=0;
        for(int i=0;i<1000;i++){
            if(primeNumbers.checkPerfectNumber(i)){
                count++;
                System.out.println(i + " " +primeNumbers.checkPerfectNumber(i));
            }

        }
        System.out.println(count);

    }

}
