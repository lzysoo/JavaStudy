package practices.RC_written_test;

/**
 * �������������в⿪���ԣ���������
 * ����ɻ�����s��ȼ��,Ϊ����������,ÿ�η���ǰ�ɻ���ȼ����Ӧ���ڵ��ڴ˴���������Ҫ��ȼ������
 * ��������Ǽ����ڲ����м��͵�����������ܽ��еķ��д�����
 * ���룺
 *      ��һ�а�����������n��s(1 �� n �� 50, 1 �� s �� 1000),�ֱ��ʾ�ƻ����еĴ����ͷ����ʼ״̬���е�ȼ������
 *      �ڶ��а���n������f[i], (1 �� f[i] �� 1000), ��ʾÿ�μƻ���������Ҫ��ȼ������
 *
 * ˼·�������ڶ������飬��ͣ����ʹ��ڳ�ʼȼ����ʱ��ֹͣ���������
 *      �����������󣬺���ȻС�ڳ�ʼȼ������������ƻ����д�����
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
