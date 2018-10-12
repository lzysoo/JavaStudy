package practices.written;

/**
 *快手笔试：字符串长度乘积最大解
 *  input：["a", "ab", "abc", "d", "cd", "bcd", "abcd"]
 *  output: 4
 *
 *  input：["a", "aa", "aaa", "aaaa"]
 *  output: 0
 */

import java.util.Arrays;
import java.util.Scanner;

public class MaxProduct {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String[] split = s.split(",");
        String[] strs = new String[split.length];
        for(int i = 0;i < split.length;i++){
            String str = new String(split[i]);
            strs[i] = str;
        }

//        Scanner sc = new Scanner(System.in);
//        String str = sc.nextLine();
//        str = str.substring(1, str.length() -1);
//        String[] strs = str.split(",");
//        for (String s : strs) {
//            s = s.substring(1, s.length() - 1);
//        }

        System.out.println(maxProduct(strs));
    }

    public static int maxProduct(String[] words) {
        if (words == null || words.length <= 0)
            return 0;
        int[] arr = new int[words.length];
        Arrays.fill(arr,0);
        for (int i = 0; i < words.length; i++) {
            for (int j = 0; j < words[i].length(); j++) {
                arr[i] = arr[i] | (1 << (int)(words[i].charAt(j) - 'a'));
            }
        }

        int maxResult = 0;
        for (int i = 0; i < words.length; i++) {
            for (int j = i + 1; j < words.length; j++) {
                if ((arr[i] & arr[j]) == 0)
                    maxResult = Math.max(maxResult,words[i].length() * words[j].length());
            }
        }
        return maxResult;
    }

}
