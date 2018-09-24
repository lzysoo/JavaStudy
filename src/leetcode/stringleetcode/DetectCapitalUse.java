package leetcode.stringleetcode;

import java.util.Scanner;

public class DetectCapitalUse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        DetectCapitalUse dc = new DetectCapitalUse();
        boolean flag = dc.detectCapital_Use(s);
        System.out.println(flag);
    }

    public boolean detectCapital_Use(String s){
        if(s == null || s.length() == 0)
            return false;
        int n = 0;
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i) >= 'A' && s.charAt(i) <= 'Z')
                n++;
        }
        if(n == s.length() || n == 0 || (n == 1 && (s.charAt(0) >= 'A' && s.charAt(0) <= 'Z')))
            return true;
        else
            return false;
    }
}
