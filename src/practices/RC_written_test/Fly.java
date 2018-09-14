package practices.RC_written_test;

/**
 * 爱奇艺往届秋招测开笔试：空中旅行
 * 起初飞机里有s升燃油,为了正常飞行,每次飞行前飞机内燃油量应大于等于此处飞行所需要的燃油量。
 * 请帮助他们计算在不进行加油的情况下他们能进行的飞行次数。
 * 输入：
 *      第一行包括两个整数n和s(1 ≤ n ≤ 50, 1 ≤ s ≤ 1000),分别表示计划飞行的次数和飞起初始状态下有的燃油量。
 *      第二行包括n个整数f[i], (1 ≤ f[i] ≤ 1000), 表示每次计划飞行所需要的燃油量。
 *
 * 思路：遍历第二个数组，求和，当和大于初始燃油量时则停止遍历，输出
 *      若数组遍历完后，和依然小于初始燃油量，则输出计划飞行次数。
 */

import java.util.Scanner;

public class Fly {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] strs1 = sc.nextLine().split(" ");
        int[] arr1 = new int[strs1.length];
        for (int i = 0; i < strs1.length; i++) {
            arr1[i] = Integer.parseInt(strs1[i]);
        }
        int n = arr1[0];
        String[] strs2 = sc.nextLine().split(" ");
        int[] arr2 = new int[n];
        for (int i = 0; i < n; i++) {
            arr2[i] = Integer.parseInt(strs2[i]);
        }

        System.out.println(timesFly(arr1,arr2));
    }

    public static int timesFly(int[] arr1,int[] arr2) {
        int sum = 0;
        int times = 0;
        for (int i = 0; i < arr2.length; i++) {
            sum += arr2[i];
            if (i == arr1.length - 1 && sum <= arr1[1])
                times = arr2.length;
            if (sum > arr1[1]) {
                times = i + 1;
                break;
            }
        }
        return times;
    }
}
