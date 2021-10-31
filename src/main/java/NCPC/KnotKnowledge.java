package NCPC;

import java.util.Arrays;

/**
 *  Problem- Given two list of the same numbers except, one number has been removed. What number was removed
 *  Example- A=[3, 5,6 ,8] B=[3,5,8]
 *  Assume- integer of numbers
 *  Answer: The Sum difference of the two lists= SumA - SumB
 */
public class KnotKnowledge {
    private static int missingNumber(int[] A, int [] B){
        return Math.abs(Arrays.stream(A).sum()-Arrays.stream(B).sum());
    }
    public static void main(String[] args) {
        int [] A={3,2,5,9,8};
        int [] B={3,9,5,8};
        System.out.println(KnotKnowledge.missingNumber(A,B));
    }
}
