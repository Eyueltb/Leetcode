package Zend;

import java.util.ArrayList;
import java.util.List;

/**
 * Given "ABcdEFgh" print "cdghABEF"
 * Solution- 1. converting to character then filter by using upper case or lower case
 *           2. Using ascii code small letter vs capital letter
 */
public class SmallLetterFirst {
    /** T(O)=O(N) */
    public static String printSmallLetterFirst(String str){
        //to separate small letter- by small or capital letter
        //if character upper case put in separate memory and do the same for lower case
        //merge them and convert to string
        char[] inputs=str.toCharArray();
        List<String>upperStr=new ArrayList<>();
        List<String>lowerStr=new ArrayList<>();
        List<String>result=new ArrayList<>();
        for(int i=0;i<inputs.length;i++){
            if(Character.isUpperCase(inputs[i]))
                upperStr.add(""+inputs[i]);
            if(Character.isLowerCase(inputs[i]))
                lowerStr.add(""+inputs[i]);
        }
        result.addAll(lowerStr);
        result.addAll(upperStr);
        return result.toString();
    }
    public static void main(String[] args) {
        System.out.println(SmallLetterFirst.printSmallLetterFirst("ABcdEFgh"));
    }
}
