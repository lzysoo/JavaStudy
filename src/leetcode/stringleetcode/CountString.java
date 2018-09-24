package leetcode.stringleetcode;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

/**
 * ͳ���ַ�����ÿ���ַ����ֵĴ���
 *
 * 1������һ������
 * 2������һ��HashMap���ϣ�����key����Character   ֵ��value����Integer
 * 3�����ַ���ת��Ϊ�ַ�����
 * 4�������ַ�����õ�ÿһ���ַ�
 * 5���øոյõ����ַ���Ϊkey��������ȥ��ֵ��������ֵ
 *       ��Ϊnull��˵����key�����ڣ��ͰѸ��ַ���Ϊkey��1��Ϊvalue�洢��
 *       ����Ϊnull��˵����key���ڣ��Ͱ�value +1��Ȼ�����´洢��key��value
 * 6������һ���ַ�������������
 * 7���������ϣ��õ�����ֵ����Ҫ�����ƴ��
 * 8�����ַ�������������ת��Ϊ�ַ������
 *
 */
public class CountString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        countString(s);
    }

    public static void countString(String s){
        HashMap<Character,Integer> map = new HashMap<>();
        char[] chs = s.toCharArray();
        for (char ch:chs) {
            Integer value = map.get(ch);
            if(value == null)
                map.put(ch,1);
            else{
                value++;
                map.put(ch,value);
            }
        }

        StringBuilder sb = new StringBuilder();

        Set<Character> set = map.keySet();
        for (Character key:set){
            Integer value = map.get(key);
            sb.append(value).append(key);
        }
        String result = sb.toString();
        System.out.println(result);
    }
}
