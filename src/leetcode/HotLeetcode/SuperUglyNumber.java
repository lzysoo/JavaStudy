package leetcode.HotLeetcode;

import java.util.Scanner;

/**
 * ������������дһ�γ��������ҵ� n ������������
 * ע�⣺
 *     ����������ָ���������������ǳ���Ϊ k �������б� primes �е���������
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
