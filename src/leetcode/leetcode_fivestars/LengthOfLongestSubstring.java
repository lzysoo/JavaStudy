package leetcode.leetcode_fivestars;

/**
 * �������ظ����ַ����ĳ���
 * eg:
 *      akweqawj ,return 5
 *      bbbbbb ,return 1
 *      abcadeba ,return 5
 */

import java.util.*;

public class LengthOfLongestSubstring {
    public static void main(String[] args) {
        String s = "aweqaqwrt";
        String s1 = " ";
        System.out.println(lengthOfLongestSubstring2(s1));
    }

    public static int lengthOfLongestSubstring1(String s){
        if(s.length() == 0)
            return 0;
        String sub;
        List<Integer> list = new ArrayList<>();
        list.add(1);
        for (int i = 0; i < s.length() - 1; i++) {
            for (int j = i; j < s.length(); j++) {
                sub = s.substring(i, j + 1);
                Set<String> set = new HashSet<>((Arrays.asList(sub.split(""))));
                if (set.size() == sub.length()) {
                    list.add(sub.length());
                }
            }
        }
        return Collections.max(list);
    }

    /**
     *
     * @param s
     * @return
     * ˼·�����������ڣ�
     *      �����ַ��������ַ������map����
     *      ���ص���⣩�������ظ����ַ�ʱ��j��ʾ���� �������������ظ����ַ������ȣ�Ҫ�� j ������Ӧ���ַ���ʼ����
     *       max ��Ϊ���ظ����ַ����ĳ��ȣ�
     */

    public static int lengthOfLongestSubstring2(String s){
        if(s.length() == 0)
            return 0;
        HashMap<Character,Integer> map = new HashMap<>();
        int max = 0;
        for (int i = 0,j = 0; i < s.length(); ++i) {
            if (map.containsKey(s.charAt(i)))
                j = Math.max(j,map.get(s.charAt(i)) + 1);
            map.put(s.charAt(i),i);
            max = Math.max(max, i - j + 1);
        }
        return max;
    }
}
