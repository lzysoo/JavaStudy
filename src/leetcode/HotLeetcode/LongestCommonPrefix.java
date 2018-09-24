package leetcode.HotLeetcode;

/**
 * 查找字符串数组中的最长公共前缀
 */

public class LongestCommonPrefix {
    public static void main(String[] args) {
        String[] strs = {"foow","flort","flrio"};
        System.out.println(longestCommonPrefix(strs));
    }

    public static String longestCommonPrefix(String[] strs){
        if (strs == null || strs.length ==0)
            return "";
        String pre = strs[0]; //以第一个字符串作为初始前缀去比较
        int i = 1;
        while(i < strs.length){
            while (strs[i].indexOf(pre) != 0) // 不包含时为 -1
                pre = pre.substring(0,pre.length() - 1); //不包含则 pre 长度 -1
            i++;
        }
        return pre;
    }
}
