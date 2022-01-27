package TopInterviewQuestions.arrays;

/**
 * Two Sum II - Input array is sorted
 * Given a 0-indexed array of integers numbers that is already sorted in non-decreasing order, find two numbers such that they add up to a specific target number. Let these two numbers be numbers[index1] and numbers[index2] where 0 <= index1 < index2 < numbers.length.
 *
 * Return the indices of the two numbers, index1 and index2, added by one as an integer array [index1 + 1, index2 + 1] of length 2.
 *
 * The tests are generated such that there is exactly one solution. You may not use the same element twice.
 *
 *
 *
 * Example 1:
 *
 * Input: numbers = [2,7,11,15], target = 9
 * Output: [1,2]
 * Explanation: The sum of 2 and 7 is 9. Therefore, index1 = 0, index2 = 1. We return [0+1, 1+1].
 * Example 2:
 *
 * Input: numbers = [2,3,4], target = 6
 * Output: [1,3]
 * Explanation: The sum of 2 and 4 is 6. Therefore, index1 = 0, index2 = 2. We return [0+1, 2+1].
 * Example 3:
 *
 * Input: numbers = [-1,0], target = -1
 * Output: [1,2]
 * Explanation: The sum of -1 and 0 is -1. Therefore, index1 = 0, index2 = 1. We return [0+1, 1+1].
 */
public class TwoSumSorted {
    /** T(0)=O(N) space=O(1)- Using two pointers */
    public int[] twoSum(int[] numbers, int target) {
        int start=0, end=numbers.length-1;
        while(start <= end){
            int sum=numbers[start]+numbers[end];
            if(sum > target)
                end-=1;
            else if(sum < target)
                start+=1;
             else
                return new int[]{start+1,end+1};
        }
        throw new IllegalArgumentException("No match!!");
    }

}
