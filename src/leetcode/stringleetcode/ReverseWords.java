package leetcode.stringleetcode;

import java.util.Scanner;

public class ReverseWords {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        ReverseWords rw = new ReverseWords();
        System.out.println(rw.reverseWords(s));
    }
    public String reverseWords(String s){
        String[] sarr = s.split(" ");
        String ss = "";
        for (int i = 0; i < sarr.length; i++) {
            StringBuffer sb = new StringBuffer(sarr[i]);
           if (i == sarr.length - 1)
               ss = ss + sb.reverse().toString();
           else
               ss = ss + sb.reverse().toString() + " ";
        }
        return ss;
    }
}
