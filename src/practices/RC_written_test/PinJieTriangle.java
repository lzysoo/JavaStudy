package practices.RC_written_test;

/**
 * 爱奇艺往届秋招测开笔试：拼凑三角形
 * 有三根木棍,长度分别是a,b,c。可以把任一一根木棍长度削短,
 * 目标是让这三根木棍构成一个三角形,并且希望这个三角形的周长越大越好。
 *
 * 思路：将三个数排序，判断 两个较小数之和是否大于另一个数，大于则直接计算周长，
 *      不大于则最大数减1，然后重新排序，再次比较
 */

import java.util.Arrays;
import java.util.Scanner;

public class PinJieTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] str = sc.nextLine().split(" ");
        int[] arr = new int[str.length];
        for (int i = 0; i < str.length; i++) {
            arr[i] = Integer.parseInt(str[i]);
        }

        int perimeter;
        while (true){
            Arrays.sort(arr);
            if (arr[0] + arr[1] > arr[2]) {
                perimeter = arr[0] + arr[1] + arr[2];
                break;
            }
            else
                arr[2]--;
        }
        System.out.println(perimeter);

    }
}
