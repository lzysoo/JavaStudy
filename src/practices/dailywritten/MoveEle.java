package practices.dailywritten;

/**
 * �������������в⿪���ԣ��ж���
 *
 * ��һ������Ϊn����������,���������н�������Ϊһ�����ϸ��������С�
 * �����ƶ������ٵ������������,�������һ����������Ҫ�ƶ����ٸ������е�Ԫ�ء�
 * (��һ��Ԫ�ز�����ԭ�����ڵ�λ��,���Ԫ�ؾ��Ǳ��ƶ��˵�)
 *
 * ˼·��������Ӧλ�ñȽ��ǲ���ͬһ���������Ǿͱ�ʾ�ƶ���Ԫ�أ�ͳ�Ʋ�ͬ�ĸ�����Ϊ�ƶ���Ԫ��
 */

import java.util.Arrays;
import java.util.Scanner;

public class MoveEle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int[] arr0 = new int[n];
        for (int i = 0; i < n; i++) {
            arr0[i] = arr[i];
        }
        Arrays.sort(arr);
        int i = 0;
        int count = 0;
        while (i < n) {
            if (arr0[i] != arr[i])
                count++;
            i++;
        }

        System.out.println(count);
    }
}
