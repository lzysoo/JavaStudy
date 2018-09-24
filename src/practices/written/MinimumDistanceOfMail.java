package practices.written;

import java.util.Arrays;
import java.util.Scanner;

/**
 *  �ʾ�ѡַ���⣺����n ��������λ��,��̼���n ������㵽�ʾֵľ����ܺ͵���Сֵ��
 *
 *  Input:
 *      ��1���Ǿ������n��1<10000��< ������x ���Ǿ�����λ�ã�ÿ��2>
 *  Output:
 *      n������㵽�ʾֵľ����ܺ͵���Сֵ��
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
