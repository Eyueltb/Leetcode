package google;

import java.util.ArrayList;
import java.util.List;

/**
 * The first recurring character->is the first character that repeats itself.
 *
 * Example
 * a)	“ABCDE”-> Answer none
 * b)	“ABCBD”->B
 * c)	“ABCDEA”->A
 * Solution 1. The first naïve solution to compare the first character to the remaining next character to check if  it repeats itself   then compare the second character to the reaming characters and so on.
 * 	So the time complexity is O(N*N)
 * Solution 2- Using space=> time complexity is O(N) but space complexity=O(N)
 */
public class FirstRecurringCharacter {
    /** The first naive solution using 2 for loop=> T(O)=O(N*N) */
    private static String getFirstRecurringCharacter(String str){
        char[] chars=str.toCharArray();
        for(int i=0;i < chars.length-1;i++)
            for(int j=i+1;j <  chars.length; j++)
                if(chars[j]==chars[i])
                    return Character.toString(chars[j]);
        return "none";
    }
    /** Using memory => T(O)=O(N) and space=O(N)*/
    private static String getFirstRecurringCharacterUsingMemory(String str){
        List<Character> inputs=new ArrayList<>();
        char[] chars=str.toCharArray();
        for (char aChar : chars) {
            if (inputs.contains(aChar))
                return Character.toString(aChar);
            inputs.add(aChar);
        }
        return "none";
    }
   //How to do this using stream


}
