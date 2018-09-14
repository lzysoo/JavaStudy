package leetcode.leetcode_fivestars;

import java.util.Stack;

/**
 * 给定一个只包括 '('，')'，'{'，'}'，'['，']' 的字符串，判断字符串是否有效。
 *
 * 有效字符串需满足：
 *      左括号必须用相同类型的右括号闭合。
 *      左括号必须以正确的顺序闭合。
 *      注意空字符串可被认为是有效字符串。
 */

public class ValidParentheses {
    public static void main(String[] args) {
        String s1 = "((()))]";
//        String s2 = "([])";
//        String s3 = "([)]";
        System.out.println(isValidParentheses(s1));
//        System.out.println(isValidParentheses(s2));
//        System.out.println(isValidParentheses(s3));
    }

    //把字符串的左半边括号压入栈（先进后出），然后再一个个出栈看是否和右半边字符串一一对应，
    // 不对应或者字符串还没遍历完栈已为空则返回false
    //否则，则返回true
    public static boolean isValidParentheses(String s){
        Stack<Character> stack = new Stack<>();
        for(char c : s.toCharArray()){
            if(c == '(')
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
}
