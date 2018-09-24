package leetcode.HotLeetcode;

/**
 * 翻转数字
 * eg：1230  输出：321
 *    -12345 输出：-54321
 */

public class ReverseInteger {
    public static void main(String[] args) {
        int n = 123405;
//        reverseInteger(n);
        System.out.println(reverseInteger(n));
        System.out.println("数字翻转");
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
