package practices.written;

/**
 * ��δ�����ԣ�һ��n������ɵ����У���ȡһ�������������У�������������б������㣺
 *            ���ֻ�ı�һ�������Ϳ���ʹ�������������������һ���ϸ�������������
 *            �����������еĳ���
 * input������ĳ���n
 *        ���飬����Ԫ�ؼ��ÿո����
 * output��������еĳ���
 *
 * ������
 *      �ֱ������±� i Ϊ��ʼ��ͽ�����ĵ��������еĳ���
 *      �Ƚ��±� i-1 �� i+1 λ�õ�Ԫ�ز�ֵ�Ƿ���� 2 ��������� 2 ��ƴ�ӳ���
 */

import java.util.Scanner;

public class ZuiChangZiXuLie {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        String s = sc.nextLine();
        String[] strs = s.split(" ");
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(strs[i]);
        }

        int[] pre = new int[n];
        for (int i = 0; i < n; i++) {
            pre[i] = 1;
        }

        int[] last = new int[n];
        for (int i = 0; i < n; i++) {
            last[i] = 1;
        }

        for (int i = 1; i < n; i++) {
            pre[i] = arr[i] > arr[i - 1] ? pre[i - 1] + 1 : 1;
        }
        for (int i = n - 2; i >= 0; i--) {
            last[i] = arr[i + 1] > arr[i] ? last[i + 1] + 1 : 1;
        }
        int res = 1;
        for (int i = 1; i < n - 1; i++) {
            res = Math.max(res,pre[i]);
            res = Math.max(res,last[i]);
            if (arr[i + 1] - arr[i - 1] >= 2)
                res = Math.max(res,pre[i - 1] + last[i + 1] + 1);
        }
        System.out.println(res);
    }
}
