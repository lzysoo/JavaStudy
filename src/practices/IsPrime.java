package practices;

/**
 * 判断一个数是否为素数
 */

public class IsPrime {
    public static void main(String[] args) {
        int n = 3;
        int n1 = 16;
        int n2 = 73;
//        System.out.println(isPrime(n));
//        System.out.println(isPrime(n1));
        System.out.println(isPrime(n2));
    }

    public static boolean isPrime(int n){
        boolean flag = true;
        for (int i = 2; i < Math.sqrt(n); i++) {
            if (n % i == 0){
                flag = false;
                break;
            }
        }
        return flag;
    }
}
