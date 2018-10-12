package practices.written;

/**
 * 好未来笔试：一个n个数组成的序列，想取一个连续的子序列，并且这个子序列必须满足：
 *            最多只改变一个数，就可以使得这个连续的子序列是一个严格上升的子序列
 *            输出这个子序列的长度
 * input：数组的长度n
 *        数组，两个元素间用空格隔开
 * output：最长子序列的长度
 *
 * 解析：
 *      分别求以下标 i 为起始点和结束点的递增子序列的长度
 *      比较下标 i-1 和 i+1 位置的元素差值是否大于 2 ，如果大于 2 则拼接长度
 */

import java.util.Scanner;

public class ZuiChangZiXuLie {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        String s = sc.nextLine();
        String[] strs = s.split(" ");
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(strs[i]);
        }

        int[] pre = new int[n];
        for (int i = 0; i < n; i++) {
            pre[i] = 1;
        }

        int[] last = new int[n];
        for (int i = 0; i < n; i++) {
            last[i] = 1;
        }

        for (int i = 1; i < n; i++) {
            pre[i] = arr[i] > arr[i - 1] ? pre[i - 1] + 1 : 1;
        }
        for (int i = n - 2; i >= 0; i--) {
            last[i] = arr[i + 1] > arr[i] ? last[i + 1] + 1 : 1;
        }
        int res = 1;
        for (int i = 1; i < n - 1; i++) {
            res = Math.max(res,pre[i]);
            res = Math.max(res,last[i]);
            if (arr[i + 1] - arr[i - 1] >= 2)
                res = Math.max(res,pre[i - 1] + last[i + 1] + 1);
        }
        System.out.println(res);
    }
}
