package leetcode.leetcode_fivestars;

/**
 * 回文数，回文数是指正序（从左向右）和倒序（从右向左）读都是一样的整数
 * 判断一个数是不是回文数字，若是则输出true，否则输出false
 * eg: 121  true
 *     -121 false
 *
 */

public class PalindromeNumber {
    public static void main(String[] args) {
        int n = 12233221;
        int n1 = -121;
        int n2 = 120;
        System.out.println(isPalindromeNumber(n));
        System.out.println(isPalindromeNumber(n1));
        System.out.println(isPalindromeNumber(n2));
}

    public static boolean isPalindromeNumber(int n){
        //n小于0或者能被10整除时，则直接返回 false
        if(n < 0 || (n != 0 && n % 10 ==0))
            return false;
        int reverse = 0;
        // 条件为 n > reverse ，是因为下面的语句是将n的一半翻转了顺序，若已翻转的部分和未翻转部分相等（数字个数为偶数个）或
        // 未翻转部分 = 已翻转 / 10 (数字个数为奇数个)，则说明数字 n 为回文数
        while (n > reverse){
            reverse = reverse * 10 + n % 10;
            n = n / 10;
        }
        return (n == reverse || n == reverse / 10);
    }
}
