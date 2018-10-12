package practices.written;

/**
 * Ï¸°ûÑÐ¾¿
 */

import java.util.*;
import java.math.*;

public class XiBao {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        int b = sc.nextInt();
        int n = sc.nextInt();
        int t = sc.nextInt();

        System.out.println(getSeconds(k, b, n, t));
    }

    public static BigInteger getCounts(int k,int b,int n) {
        BigInteger count = BigInteger.valueOf(1);
        BigInteger K = BigInteger.valueOf(k);
        BigInteger B = BigInteger.valueOf(b);
        while(n-- > 0) {
            count = count.multiply(K).add(B);
        }
        return count;
    }

    public static int getSeconds(int k,int b,int n,int t) {
        BigInteger count = BigInteger.valueOf(t);
        BigInteger K = BigInteger.valueOf(k);
        BigInteger B = BigInteger.valueOf(b);
        BigInteger z = getCounts(k,b,n);
        int s = 0;
        while(count.compareTo(z) < 0) {
            count = count.multiply(K).add(B);
            s++;
        }
        return s;
    }
}