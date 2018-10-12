package practices.written;

/**
 * 快手笔试：
 * 1,2,2,3,3,3,4,4,4,4,5,5,5,5,5……
 *
 * 输入 n ,求第 n 项是多少
 */

import java.util.Scanner;

public class Sequence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        //Math.ceil()返回大于或等于参数的最小double值，等于一个数学整数
        //System.out.println((int)Math.ceil((Math.sqrt(1 + 8 * n) - 1) / 2));

        int k = 1;
        while (true) {
            if ((1 + k) * k / 2 < n && (1 + (k + 1)) * (k + 1) / 2 >= n) {
                System.out.println(k + 1);
                break;
            } else
                k++;
        }
    }
}
