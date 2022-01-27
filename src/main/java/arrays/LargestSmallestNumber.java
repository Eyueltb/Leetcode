package arrays;


import java.util.Arrays;

public class LargestSmallestNumber {
    private int smallest = Integer.MAX_VALUE;
    private int largest = Integer.MIN_VALUE;
    private void find(int [] number){
        for(int num : number){
            if(num < smallest)
                smallest=num;
            if(num > largest)
                largest = num;
        }
    }
    private void findA(int [] number){
        Arrays.stream(number).forEach(i->{
           if(i < smallest)
               smallest=i;
           if(i > largest)
                largest = i;
        });
    }
    private void findB(int [] number){


    }
    public int getSmallest(){ return  smallest; }

    public int getLargest() { return largest;  }

    public static void main(String[] args) {
        LargestSmallestNumber largestSmallestNumber=new LargestSmallestNumber();
        int A[] = {4, 25, 7,9};
        largestSmallestNumber.findA(A);
        System.out.println(largestSmallestNumber.getSmallest());
        System.out.println(largestSmallestNumber.getLargest());
    }
}
