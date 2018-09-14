package leetcode.leetcode_string;

import java.util.Scanner;

public class judje_circle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        judje_circle jc = new judje_circle();
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
