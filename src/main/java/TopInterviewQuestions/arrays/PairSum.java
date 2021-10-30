package TopInterviewQuestions.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Given a list of numbers and a number k, return whether any two numbers from the list add up to k.
 *
 * For example, given [10, 15, 3, 7] and k of 17, return true since 10 + 7 is 17.
 *
 * Bonus: Can you do this in one pass?
 */
public class PairSum {

    /**  T(0)=O(N*N), space=1 */
    public boolean isTwoSum(int [] nums, int target ){
       for(int i=0;i<nums.length-1;i++){
           for(int j=i+1;j<nums.length;j++)
               if(nums[i]+nums[j]==target)
                   return true;
       }
       return false;
    }
    /** T(0)=O(N), space= O(N) */
    public boolean isPairSumFound(int [] nums, int target ){
        /**
         * 1. check if number is found in the list that store the complement of a number
         *  if found return true;
         */
        List<Integer> complement=new ArrayList<>();
        for (int num:nums) {
           if(!complement.contains(num))
                complement.add(target-num);
           else
            return true;
          }
        return false;
    }
    /** T(0)=O(N log N) space=O(N)- Using two pointers */
    public boolean isPairSumUsingTwoPointers(int [] nums, int target ){
        Arrays.sort(nums);
        int st=0, last=nums.length-1;
        while(st<last){
            if(nums[st]+nums[last] > target)
                last--;
            else if(nums[st]+nums[last] < target)
                st++;
            else
                return true;
        }
        return false;
    }

    public static void main(String[] args) {
        PairSum twoSum=new PairSum();
        int [] arrA={10, 15, 3, 7};
        int [] arrB= {2, 5, 6, 7};
        int k=17,A=11,B=18,C=10,D=9;
        System.out.println(twoSum.isPairSumUsingTwoPointers(arrA, k));//true
        System.out.println(twoSum.isPairSumUsingTwoPointers(arrA, A));//false
        System.out.println(twoSum.isPairSumUsingTwoPointers(arrB, B));// false
        System.out.println(twoSum.isPairSumUsingTwoPointers(arrB, A));// true
    }
}
