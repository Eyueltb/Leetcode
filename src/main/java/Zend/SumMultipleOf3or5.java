package Zend;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

/**
 * If we list all the natural numbers below 10 that are multiples of 3 or 5,
 * we get 3, 5, 6 and 9. The sum of these multiples is 23.
 *
 * # Specification
 *
 * Create a solution that returns the sum of all numbers
 * that are multiples of 3 or 5,and are smaller than a given number. # Examples
 * sum35(10) should return 23 sum35(200) should return 9168
 *
 * # Input
 *
 * An integer specifying the exclusive upper bound.
 * # Output
 */
public class SumMultipleOf3or5 {
    private int getSumMultipleOf3or5(int n){
        int sum=0;
        for(int i=0;i<n;i++){
            if(i%3==0 || i%5==0){
                sum+=i;
            }
        }
        return sum;
    }
    private int getSumMultipleOf3or5Stream(int n){
        //Step 1- change n to stream
        int [] nums =new int [n];
        for(int i=0;i<n;i++)// IntStream.range(0,n)
            nums[i]=i;
        //step 2- sum using stream
        return Arrays.stream(nums).filter(i->i%3==0 || i%5==0).sum();

    }
    private int getSumMul3or5StreamBest(int n){
        return IntStream
                    .range(0,n)
                    .filter(i->i%3==0 || i%5==0)
                    .sum();
    }

    public static void main(String[] args) {
        SumMultipleOf3or5 sumMultipleOf3or5=new SumMultipleOf3or5();
        System.out.println(sumMultipleOf3or5.getSumMultipleOf3or5(10));//23
        System.out.println(sumMultipleOf3or5.getSumMultipleOf3or5(200));//9168
        System.out.println(sumMultipleOf3or5.getSumMultipleOf3or5Stream(10));//23
        System.out.println(sumMultipleOf3or5.getSumMultipleOf3or5Stream(200));//9168

        System.out.println(sumMultipleOf3or5.getSumMul3or5StreamBest(10));//23
        System.out.println(sumMultipleOf3or5.getSumMul3or5StreamBest(200));//9168
    }
}
