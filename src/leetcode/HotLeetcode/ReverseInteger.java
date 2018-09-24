package leetcode.HotLeetcode;

/**
 * ��ת����
 * eg��1230  �����321
 *    -12345 �����-54321
 */

public class ReverseInteger {
    public static void main(String[] args) {
        int n = 123405;
//        reverseInteger(n);
        System.out.println(reverseInteger(n));
        System.out.println("���ַ�ת");
    }

    public static int reverseInteger(int x){
        int result = 0;
        while(x != 0){
            int tail = x % 10;
            result = result * 10 + tail;
            x = x / 10;
        }
        return result;
    }
}
