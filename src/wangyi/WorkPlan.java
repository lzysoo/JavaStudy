package wangyi;

import java.util.Scanner;

public class WorkPlan {
    private static int s;
    private static int a, b, c;
    private static final int MOD = 1000000007;
    public static void main(String[] args){
        int loop = 1;
        Scanner scanner = new Scanner(System.in);
        //loop = scanner.nextInt();
        for (; loop-- > 0;) {
            s = scanner.nextInt();
            a = scanner.nextInt();
            b = scanner.nextInt();
            c = scanner.nextInt();
            solve();
        }
        scanner.close();
    }
    private static void solve() {
        long cnt = 0;
        int left = s - a; // a put
        for (int i = Math.max(Math.max(0, left - c), b - a); i <= Math.min(b, left); i++) {
            // b get i in left, c get left - i in left
            cnt += ((C(i, left)* C(b - i, a) % MOD) * C(c - left + i, a + i)) % MOD;
        }
        cnt *= C(a, s);
        System.out.println(cnt % MOD);
    }
    // C m in n
    private static long C(int m, int n) {
        double d = 1;
        for (int i = 0, len = m; i < len; i++) {
            d = d * n-- / m--;
        }
        return Math.round(d) % MOD;
    }
}
