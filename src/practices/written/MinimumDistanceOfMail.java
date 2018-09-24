package practices.written;

import java.util.Arrays;
import java.util.Scanner;

/**
 *  邮局选址问题：给定n 个居民点的位置,编程计算n 个居民点到邮局的距离总和的最小值。
 *
 *  Input:
 *      第1行是居民点数n，1<10000。< 个整数x 行是居民点的位置，每行2>
 *  Output:
 *      n个居民点到邮局的距离总和的最小值。
 *
 */

public class MinimumDistanceOfMail {
     public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         int n = sc.nextInt();
         int[] xarr = new int[n];
         int[] yarr = new int[n];
         for(int i = 0 ;i < n;i++){
             xarr[i] = sc.nextInt();
             yarr[i] = sc.nextInt();
         }
         Arrays.sort(xarr);
         Arrays.sort(yarr);
         double zx ,zy;
         if(n % 2 == 0){
             zx = 1.0 * (xarr[n / 2 - 1] + xarr[n / 2]) / 2;
             zy = 1.0 * (yarr[n / 2 - 1] + yarr[n / 2]) / 2;
         }else{
             zx = xarr[n / 2];
             zy = yarr[n / 2];
         }
         double sum = 0;
         for(int i = 0;i < n;i++){
             sum += Math.abs(xarr[i] - zx);
             sum += Math.abs(yarr[i] - zy);
         }

         System.out.println((int)sum);
     }
}
