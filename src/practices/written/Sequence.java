package practices.written;

/**
 * ���ֱ��ԣ�
 * 1,2,2,3,3,3,4,4,4,4,5,5,5,5,5����
 *
 * ���� n ,��� n ���Ƕ���
 */

import java.util.Scanner;

public class Sequence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        //Math.ceil()���ش��ڻ���ڲ�������Сdoubleֵ������һ����ѧ����
        //System.out.println((int)Math.ceil((Math.sqrt(1 + 8 * n) - 1) / 2));

        int k = 1;
        while (true) {
            if ((1 + k) * k / 2 < n && (1 + (k + 1)) * (k + 1) / 2 >= n) {
                System.out.println(k + 1);
                break;
            } else
                k++;
        }
    }
}
