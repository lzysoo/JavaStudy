package leetcode.leetcode_fivestars;

/**
 * 输出最长无重复子字符串的长度
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
     * 思路：（滑动窗口）
     *      遍历字符串，将字符添加至map集合
     *      （重点理解）当出现重复的字符时，j表示的是 接下来计算无重复子字符串长度，要从 j 索引对应的字符开始算起
     *       max 即为无重复子字符串的长度，
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
