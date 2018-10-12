package wangyi;

/**
 * 网易笔试：
 * 一个数列，可以对其中一些数加上一个数字n（只能加一次）,然后对另外一些数减去n（只能减一次），剩下的数不做改动
 * 使得改动后的数列所有数字都相同，如果存在这样的数字n，则输出 yes，不存在则输出 no
 */

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class IsExistNumber {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int allData = sc.nextInt();
        int[][] data = new int[allData][];
        for (int i = 0; i < allData; i++) {
            int n = sc.nextInt();
            data[i] = new int[n];
            for (int j = 0; j < n; j++) {
                data[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < allData; i++) {
            isExistNumber(data[i]);
        }
    }
    public static void isExistNumber(int[] arr){
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if (!list.contains(arr[i]))
                list.add(arr[i]);
        }
        Collections.sort(list);
        if (list.size() == 1)
            System.out.println("NO");
        else if (list.size() == 2)
            System.out.println("YES");
        else if (list.size() == 3) {
            if (list.get(1) - list.get(0) == list.get(2) - list.get(1))
                System.out.println("YES");
            else
                System.out.println("NO");
        }
        else System.out.println("NO");
    }
}
