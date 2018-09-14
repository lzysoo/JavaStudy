package practices.RC_written_test;

import java.util.Scanner;

public class DelRepeatedChars {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        char[] chs = str.toCharArray();
        StringBuilder sb = new StringBuilder("");
        for (int i = 0; i < chs.length; i++) {
            if (!sb.toString().contains(Character.toString(chs[i])))
                sb.append(chs[i]);

        }
        System.out.println(sb.toString());
    }
}
