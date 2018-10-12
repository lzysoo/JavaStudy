package practices.written;

/**
 * µÎµÎ±ÊÊÔ£ºÄ§·¨Ê¯
 */

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Magic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String[] strs = s.split(" ");
        int n = Integer.parseInt(strs[0]);
        int m = Integer.parseInt(strs[1]);
        String s1 = sc.nextLine();
        String[] strs1 = s1.split(" ");
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
           list.add(Integer.parseInt(strs1[i]));
        }

        List<Integer> after = new ArrayList<>();
        for (int i = 0; i < m; i += 2) {
            int temp;
            temp = list.get(i) + list.get(i + 1);
            after.add(temp);
        }
        for (int i = m; i < list.size(); i++) {
            after.add(list.get(i));
        }
        Collections.sort(after);
        System.out.println(after.get(0));
    }
}
