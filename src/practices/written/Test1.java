package practices.written;

import java.util.Arrays;
import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String[] strs = str.split(" ");
        if (strs.length >= 100000)
            return;
        long [] fi = new long[strs.length];
        for (int i = 0; i < strs.length; i++) {
            fi[i] = Long.parseLong(strs[i]);
        }
        Arrays.sort(fi);

        long sum1 = 0, sum2 = 0;
        long tmp = 0;

        for (int i = 0; i < fi.length; i++) {
            for (int j = 0; j < fi.length; j++) {
                if (fi[i] > fi[j]) {
                    tmp = fi[i];
                    fi[i] = fi[j];
                    fi[j] = tmp;
                }
            }
        }
        for (int i = 0; i < fi.length; i++) {
            if (sum1 < sum2) {
                sum1 += fi[i];
            } else {
                sum2 += fi[i];
            }
        }
        System.out.println(Math.abs(sum1 - sum2));
    }

}
