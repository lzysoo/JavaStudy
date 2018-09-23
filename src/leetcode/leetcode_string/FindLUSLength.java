package leetcode.leetcode_string;

import java.util.Scanner;

public class FindLUSLength {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();
        FindLUSLength f = new FindLUSLength();
        int n = f.findLUSlength(s1,s2);
        System.out.println(n);
    }

    public int findLUSlength(String a,String b){
        int length = 0;
        int lengthA = a.length();
        int lengthB = b.length();
        if(lengthA != lengthB)
            length = Math.max(lengthA,lengthB);
        else{
            if(a.equals(b))
                length = -1;
            else
                length = lengthA;
        }
        return length;
    }
}
