package practices.dailywritten;

/**
 * �������������в⿪���ԣ��ж���
 * ���԰���n���ж���,ÿ����һ������1��,�ڿ�����һ���²���t����Ŀ�Ĵ���"��ȷ",������ţţ��Ϊ"����"��
 * ʵ����n��������a����Ŀ�Ĵ�Ӧ����"��ȷ",���ǲ�֪����������Щ��Ŀ
 * ������ܻ�õ���ߵĿ��Է����Ƕ��١�
 */

import java.util.Scanner;

public class IsCorrect {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] str = sc.nextLine().split(" ");
        int[] arr = new int[str.length];
        for (int i = 0; i < str.length; i++) {
            arr[i] = Integer.parseInt(str[i]);
        }
        int sum = 0;
        int n = arr[0];
        int t = arr[1];
        int a = arr[2];
        if (t == a)
            sum = n;
        else if (t > a)
            sum = a + (n - a - (t - a));
        else
            sum = t + (n - a);
        System.out.println(sum);
    }
}
