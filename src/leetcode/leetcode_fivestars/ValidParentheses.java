package leetcode.leetcode_fivestars;

import java.util.Stack;

/**
 * ����һ��ֻ���� '('��')'��'{'��'}'��'['��']' ���ַ������ж��ַ����Ƿ���Ч��
 *
 * ��Ч�ַ��������㣺
 *      �����ű�������ͬ���͵������űպϡ�
 *      �����ű�������ȷ��˳��պϡ�
 *      ע����ַ����ɱ���Ϊ����Ч�ַ�����
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

    //���ַ�������������ѹ��ջ���Ƚ��������Ȼ����һ������ջ���Ƿ���Ұ���ַ���һһ��Ӧ��
    // ����Ӧ�����ַ�����û������ջ��Ϊ���򷵻�false
    //�����򷵻�true
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
