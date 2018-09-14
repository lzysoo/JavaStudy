package practices.written_test;

/**
 * ����2018���б��Ա����1��
 * ����һ���ַ���s, ��������������������s��Ϊ�Ӵ�������ַ����� ע������s�������ص����֡�����,"ababa"��������"aba".
 */

import java.util.Scanner;

public class TheShortedStringOfDoubleString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(theShortedStringOfDoubleString(s));
    }

    public static String theShortedStringOfDoubleString(String s){
        int index = 0;
        for (int i = 1; i < s.length(); i++) {
            if (s.substring(i,s.length()).equals(s.substring(0,s.length() - i))){
                index = i;
                break;
            }
        }
        if (index == 0)
            return s + s;
        else
            return s.substring(0,index) + s;
    }
}
