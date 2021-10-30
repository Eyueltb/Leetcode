/**
 * Given a string s, determine if it is a palindrome, considering only alphanumeric characters and ignoring cases.
 *
 * Example 1:
 *
 * Input: s = "A man, a plan, a canal: Panama"
 * Output: true
 * Explanation: "amanaplanacanalpanama" is a palindrome.
 * Example 2:
 *
 * Input: s = "race a car"
 * Output: false
 * Explanation: "raceacar" is not a palindrome.
 *
 *
 * Constraints:
 *
 * 1 <= s.length <= 2 * 105
 * s consists only of printable ASCII characters.
 *
 * Truth1 char is palindrome and ignore space but compare only when you get alphabet or digits
 * Truth2- compare by changing char to lower case.
 * Truth3- for odd character both pointer reach to the same character so no need to compare and for even they pass one another so st<end
 * Solution- keep 2 pointers read form start and end and loop until st < end
 *             1. compare value of start pointer and end pointer if only find alphabet or digits
 */
public class ValidPalindrome {
    public boolean isValidPalindrome(String s){
        if(s.length()<=1) return true;
        int start=0,end=s.length()-1;
        while(start < end){
            while(start < end && !Character.isLetterOrDigit(s.charAt(start))) start++;
            while(start < end && !Character.isLetterOrDigit(s.charAt(end))) end--;
            if(start < end && Character.toLowerCase(s.charAt(start))!=Character.toLowerCase(s.charAt(end))) return false;
             start++;
             end--;
        }
        return true;
    }

}
