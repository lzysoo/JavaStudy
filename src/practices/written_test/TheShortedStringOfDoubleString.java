package practices.written_test;

/**
 * 京东2018秋招笔试编程题1：
 * 给定一个字符串s, 请计算输出含有连续两个s作为子串的最短字符串。 注意两个s可能有重叠部分。例如,"ababa"含有两个"aba".
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
