package practices.written_test;

/**
 * 360软测笔试编程题：字典排序
 * 给定一个字符串str 和 一个字符c，将 c 插入字符串中，求插入后字典序最小的字符串
 */

import java.util.Scanner;

public class DictionarySort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        char c = sc.nextLine().toCharArray()[0];

        char[] chs = str.toCharArray();
        int temp = chs.length;
        for (int i = 0; i < chs.length; i++) {
            if (chs[i] > c) {
                temp = i;
                break;
            }
        }
        for (int i = 0; i < temp; i++) {
            System.out.print(chs[i]);
        }
        System.out.print(c);
        for (int i = temp; i < chs.length; i++) {
            System.out.print(chs[i]);
        }
    }

}
