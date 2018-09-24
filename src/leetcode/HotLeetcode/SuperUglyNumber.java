package leetcode.HotLeetcode;

import java.util.Scanner;

/**
 * 超级丑数，编写一段程序来查找第 n 个超级丑数。
 * 注意：
 *     超级丑数是指其所有质因数都是长度为 k 的质数列表 primes 中的正整数。
 */

public class SuperUglyNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        String[] strs = sc.nextLine().split(",");
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(strs[i]);
        }


    }

//    public static int superUglyNumber(int n,int[] Primes) {
//
//    }
}
