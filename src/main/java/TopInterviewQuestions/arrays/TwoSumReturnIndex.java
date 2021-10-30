package TopInterviewQuestions.arrays;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
 * Example 1:
 *
 * Input: nums = [2,7,11,15], target = 9
 * Output: [0,1]
 * Output: Because nums[0] + nums[1] == 9, we return [0, 1].
 * Example 2:
 *
 * Input: nums = [3,2,4], target = 6
 * Output: [1,2]
 * Example 3:
 *
 * Input: nums = [3,3], target = 6
 * Output: [0,1]
 *
 * Hint #1
 *          A really brute force way would be to search for all possible pairs of numbers but that would be too slow.
 *          Again, it's best to try out brute force solutions for just for completeness.
 *          It is from these brute force solutions that you can come up with optimizations.
 * Hint #2
 *      So, if we fix one of the numbers, say x, we have to scan the entire array
 *      to find the next number  y which is y=value - x
 *      where value is the input parameter. Can we change our array somehow so that this search becomes faster?
 * Hint #3
 *      The second train of thought is, without changing the array, can we use additional space somehow? Like maybe a hash map to speed up the search?
 */
public class TwoSumReturnIndex {
    /**  T(0)=O(N*N), space=1 */
    public int [] getTwoSumIndex(int [] nums, int target ){
          for(int i=0;i<nums.length-1;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[j]==target-nums[i]){
                    return new int[]{i,j};
                }
            }
       }
       throw new IllegalArgumentException("no match found");
    }
    /** T(0)=O(N), space= O(N) */
   public int[] getIndexOfTwoSums(int [] nums, int target){
       Map<Integer,Integer> num_map=new HashMap<>();
       int [] res=new int[2];
       for (int i=0;i<nums.length;i++) {
            if(num_map.containsKey(target-nums[i])){
               return new int []{num_map.get(target-nums[i]),i};
           }
           num_map.put(nums[i],i);
      }
       throw new IllegalArgumentException("No match");
   }

}
