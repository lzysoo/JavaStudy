package practices.written;

/**
 * “¯––ªµ’À
 */

import java.util.Scanner;

public class BankBadDebts {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String[] strs = str.split(" ");
        long n = Long.parseLong(strs[0]);
        long w = Long.parseLong(strs[1]);
        long k = 100003;
        long n1 = n % k;
        long n2 = (n - 1) % k;
        long result1 = n1;
        for (long i = 1; i < w; i++) {
            result1 = (result1 * n1) % k;
        }
        long result2 = n % k;
        for (int i = 1; i < w; i++) {
            result1 = (result1 * n2) % k;
        }
        System.out.println((result1 - result2 + k) % k);

        System.out.println(n * (w - 1) % k);
    }

}
