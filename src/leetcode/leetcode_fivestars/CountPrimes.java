package leetcode.leetcode_fivestars;

/**
 * ͳ������С�ڷǸ����� n ������������.
 */

public class CountPrimes {
    public static void main(String[] args) {
        int n = 10;
        int n1 = 20;
        System.out.println(countPrimes(n));
        System.out.println(countPrimes(n1));
    }

    public static int countPrimes(int n){
        boolean[] notPrime = new boolean[n];
        int count = 0;
        for (int i = 2; i < n; i++) {
            if (notPrime[i] == false){
                count++;
                for (int j = 2; i * j < n; j++) {
                    notPrime[i * j] = true;
                }
            }
        }
        return count;
    }
}
