package practices.written;

/**
 * 京东测开笔试题：中位数
 */

import java.util.Arrays;
import java.util.Scanner;

public class Median {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        String[] num = sc.nextLine().split(" ");
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(num[i]);
        }
        Arrays.sort(arr);
        int mid = arr.length / 2;
        double result;
        if (arr.length % 2 == 0){
            result = (double)(arr[mid] + arr[mid - 1])/2;
            System.out.println(String.format("%.1f",result));
        }
        else
            System.out.println(arr[mid]);
        //System.out.println(result);

        /**
         * 使用java正则表达式去掉多余的.与0
         * @param s
         * @return
         */
/*
        public static String subZeroAndDot(String s){
            if(s.indexOf(".") > 0){
                s = s.replaceAll("0+?$", "");//去掉多余的0
                s = s.replaceAll("[.]$", "");//如最后一位是.则去掉
            }
            return s;
        }
*/
    }
}

