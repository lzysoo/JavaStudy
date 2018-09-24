package practices.dailywritten;

/**
 * 爱奇艺往届秋招测开笔试：判断题
 *
 * 有一个长度为n的整数序列,想对这个序列进行重排为一个非严格升序序列。
 * 若想移动尽量少的数就完成重排,请你计算一下他最少需要移动多少个序列中的元素。
 * (当一个元素不在它原来所在的位置,这个元素就是被移动了的)
 *
 * 思路：排序后对应位置比较是不是同一个数，不是就表示移动了元素，统计不同的个数即为移动的元素
 */

import java.util.Arrays;
import java.util.Scanner;

public class MoveEle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int[] arr0 = new int[n];
        for (int i = 0; i < n; i++) {
            arr0[i] = arr[i];
        }
        Arrays.sort(arr);
        int i = 0;
        int count = 0;
        while (i < n) {
            if (arr0[i] != arr[i])
                count++;
            i++;
        }

        System.out.println(count);
    }
}
