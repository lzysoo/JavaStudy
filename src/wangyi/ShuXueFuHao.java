package wangyi;

import java.util.Arrays;
import java.util.Scanner;

public class ShuXueFuHao {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int sum = a + b + c;
        int sum1 = a * b * c;
        int sum2 = a + b * c;
        int sum3 = (a + b) * c;
        int sum4 = a * b + c;
        int sum5 = a * (b + c);
        int[] sarr = new int[]{sum,sum1,sum2,sum3,sum4,sum5};
        Arrays.sort(sarr);
        System.out.println(sarr[sarr.length - 1]);
    }
}
