package arrays;


import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/***
 * Sum or product all unique elements in a given array of integer
 * Example- int [] num={2,7,9} =>18 since all are unique
 *          int [] num={1,1,2,2,9} =>12 since {1,2,9}
 * The simple solution using set- copy the array to set then sum the element in the set=> time:O(N) and space:O(N)
 *  Sort the array and sum/product only if the current and previous elements are different!
 *  Task- Solve the above also by using stream!!!
 */
public class ArithmeticDistinctArray {
    public int sumUniqueElementsOfArray(int []nums){
        Set<Integer> numbers=new HashSet<Integer>();
        int sum=0;
        for (int num:nums)
            numbers.add(num);

        for (int num:numbers)
            sum+=num;
        return sum;

    }
    public int sumArrayElementsDistinctWithOutSpace(int [] nums){
        Arrays.sort(nums);
        int sum=0;
        for(int i=1;i<nums.length;i++){
            if(nums[i]!=nums[i-1])
                sum+=nums[i-1];
        }
        return sum;
    }
    public int sumUniqueElementsOfArrayUsingStream(int []nums){
        Set<Integer> numbers=new HashSet<Integer>(Arrays.hashCode(nums));
         //Arrays.stream(nums).map(i->i+1).filter(i->i!=i-1).sum();
        return numbers.stream().mapToInt(Integer::intValue).sum();
    }
    public static void main(String[] args) {
        ArithmeticDistinctArray distinctArray=new ArithmeticDistinctArray();
        int [] num1={2,7,9};
        int [] num2={1,1,2,2,9};
/*        System.out.println(distinctArray.sumUniqueElementsOfArray(num1));
        System.out.println(distinctArray.sumUniqueElementsOfArray(num2));
        System.out.println(distinctArray.sumArrayElementsDistinctWithOutSpace(num1));
        System.out.println(distinctArray.sumArrayElementsDistinctWithOutSpace(num2));
        System.out.println(distinctArray.sumUniqueElementsOfArrayUsingStream(num1));
        System.out.println(distinctArray.sumUniqueElementsOfArrayUsingStream(num2));*/
    }
}

