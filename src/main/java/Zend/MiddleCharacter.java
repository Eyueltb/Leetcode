package Zend;

/**
 * Given a string, return the middle character of the string.
 *  If the string's length is odd, return the middle character.
 *  If the string's length is even, return the middle 2 characters.
 *
 * Examples
 *
 * getMiddle("test") should return "es"
 * getMiddle("testing”) should return "t"
 * getMiddle("middle") should return "dd"
 * getMiddle("A") should return "A"
 *
 * # Input
 *
 * A string of length 0	str	1000. # Output
 * The middle character(s) of the string, represented as another string.
 *
 * Questions need to be asked -
 *      1. space need to be removed?
 *      2. What if string is empty
 *      3.
 */
public class MiddleCharacter {

    private String getMiddle(String str){
        assert str.length()!=0;
        //change string to character
        char[] inputs=str.toCharArray();
        // determine the size and find the middle
        int size=str.length();
        int middle=size/2;
        //if odd send a middle element or if even the middle two
        if(size%2!=0)//if odd
            return new String(String.valueOf(inputs[middle]));
        else
           return new String(String.valueOf(inputs[middle-1])+String.valueOf(inputs[middle]));
    }

    /** TODO- Implement using stream */
    private String getMiddleUsingStream(String str){
        return null;
    }
    public static void main(String[] args) {
        MiddleCharacter middleCharacter=new MiddleCharacter();
        System.out.println(middleCharacter.getMiddle("ABCD"));
    }
}
