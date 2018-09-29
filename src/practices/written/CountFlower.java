package practices.written;

import java.util.Scanner;

public class CountFlower {
    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int count = 0;
        if (M > N)
            System.out.println(0);
        while (M <= N) {
            if (N % M == 0)
                count++;
            M++;
        }
        System.out.println(count);
        long end = System.currentTimeMillis();
        System.out.println(end - start);
    }
}
