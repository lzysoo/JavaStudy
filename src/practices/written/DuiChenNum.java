package practices.written;

/**
 * 数字的首位和末尾是否一样
 */

import java.util.Scanner;

public class DuiChenNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String[] strs = s.split(" ");
        int l = Integer.parseInt(strs[0]);
        int r = Integer.parseInt(strs[1]);
        if (l <= 0 || r <= 0)
            return;
        int count = 0;

        for (int i = l; i <= r; i++) {
            String temp = String.valueOf(i);
            int x = Integer.parseInt(temp.substring(0,1));
            int y = Integer.parseInt(temp.substring(temp.length() - 1));
            if (x == y)
                count++;
        }
        System.out.println(count);
    }
}
