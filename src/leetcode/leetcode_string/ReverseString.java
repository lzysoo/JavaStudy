package leetcode.leetcode_string;

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        ReverseString rs = new ReverseString();
        System.out.println(rs.reverse_String2(s));
    }

    public String reverse_String1(String s){
        char[] ch = s.toCharArray();
        String reverse = "";
        for (int i = ch.length - 1; i >= 0; i--) {
            reverse += ch[i];
        }
        return reverse;
    }

    public String reverse_String2(String s){
        String reverse = "";
        for (int i = 0; i < s.length(); i++) {
            reverse = s.charAt(i) + reverse;
        }
        return reverse;
    }

    public String reverse_String3(String s){
        StringBuilder sb = new StringBuilder(s);
        String afterreverse = sb.reverse().toString();
        return afterreverse;
    }
}
