package leetcode.stringleetcode;

import java.util.Scanner;

public class JudjeCircle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        JudjeCircle jc = new JudjeCircle();
        boolean flag = jc.judgeCircle(s);
        System.out.println(flag);
    }

    public boolean judgeCircle(String moves){
        int x = 0;
        int y = 0;
        for (int i = 0; i < moves.length(); i++) {
            char ch = moves.charAt(i);
            if(ch == 'R')
                x++;
            else if(ch == 'L')
                x--;
            else if(ch == 'U')
                y++;
            else if(ch == 'D')
                y--;
        }
        return x == 0 && y == 0;
    }
}
