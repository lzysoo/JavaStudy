package practices.written_test;

/**
 * 360�����Ա���⣺�ֵ�����
 * ����һ���ַ���str �� һ���ַ�c���� c �����ַ����У��������ֵ�����С���ַ���
 */

import java.util.Scanner;

public class DictionarySort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        char c = sc.nextLine().toCharArray()[0];

        char[] chs = str.toCharArray();
        int temp = chs.length;
        for (int i = 0; i < chs.length; i++) {
            if (chs[i] > c) {
                temp = i;
                break;
            }
        }
        for (int i = 0; i < temp; i++) {
            System.out.print(chs[i]);
        }
        System.out.print(c);
        for (int i = temp; i < chs.length; i++) {
            System.out.print(chs[i]);
        }
    }

}
