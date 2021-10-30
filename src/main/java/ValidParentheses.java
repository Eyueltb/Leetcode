import java.util.*;

/**
 * Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.
 *
 * An input string is valid if:
 *
 * Open brackets must be closed by the same type of brackets.
 * Open brackets must be closed in the correct order.
 *
 *
 * Example 1:
 *
 * Input: s = "()"
 * Output: true
 * Example 2:
 *
 * Input: s = "()[]{}"
 * Output: true
 * Example 3:
 *
 * Input: s = "(]"
 * Output: false
 * Example 4:
 *
 * Input: s = "([)]"
 * Output: false
 * Example 5:
 *
 * Input: s = "{[]}"
 * Output: true
 *
 * Task- solve using stream
 */
public class ValidParentheses {
    public boolean isValid(String s) {
        if (s.length() %2==1) return false;
        Stack<Character> stack = new Stack<Character>();
        for (char c : s.toCharArray()) {
            if (c == '(')
                stack.push(')');
            else if (c == '{')
                stack.push('}');
            else if (c == '[')
                stack.push(']');
            else if (stack.isEmpty() || stack.pop() != c)
                return false;
        }
        return stack.isEmpty();
    }
    public boolean isValidWithMap(String s) {
        Map<Character,Character> mappings = new HashMap<Character,Character>(){{
            put(')', '(');
            put('}', '{');
            put(']', '[');
        }};

        Stack<Character> letters = new Stack<>();

        for(int i = 0; i < s.length(); i++){
            char temp = s.charAt(i);
            if(mappings.containsKey(temp)){
                if(letters.isEmpty() || letters.pop() != mappings.get(temp)){
                    return false;
                }
            } else{
                letters.push(temp);
            }
        }
        return letters.isEmpty();
    }

    public static void main(String[] args) {
        ValidParentheses validParentheses=new ValidParentheses();
        System.out.println(validParentheses.isValid("()[]{}"));
        System.out.println(validParentheses.isValidWithMap("()[]{}"));
        System.out.println(validParentheses.isValid("{[]}"));
        System.out.println(validParentheses.isValidWithMap("{[]}"));
    }
}
