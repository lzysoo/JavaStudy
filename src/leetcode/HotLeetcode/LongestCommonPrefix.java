package leetcode.HotLeetcode;

/**
 * �����ַ��������е������ǰ׺
 */

public class LongestCommonPrefix {
    public static void main(String[] args) {
        String[] strs = {"foow","flort","flrio"};
        System.out.println(longestCommonPrefix(strs));
    }

    public static String longestCommonPrefix(String[] strs){
        if (strs == null || strs.length ==0)
            return "";
        String pre = strs[0]; //�Ե�һ���ַ�����Ϊ��ʼǰ׺ȥ�Ƚ�
        int i = 1;
        while(i < strs.length){
            while (strs[i].indexOf(pre) != 0) // ������ʱΪ -1
                pre = pre.substring(0,pre.length() - 1); //�������� pre ���� -1
            i++;
        }
        return pre;
    }
}
