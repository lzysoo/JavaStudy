package practices.written_test;

/**
 * 作业帮捕鱼：
 */

public class BuYu {
    public static void main(String[] args) {
        int j = 0,k = 0,l = 0,m = 0,n = 6,x = 0;
        while (n > 5) {
            j = 4 * (n - 1) / 5;
            k = 4 * (j - 1) / 5;
            l = 4 * (k - 1) / 5;
            m = 4 * (l - 1) / 5;
            if (n % 5 == 1 && j % 5 == 1 && k % 5 == 1 && l % 5 == 1 && m % 5 == 1) {
                System.out.println("至少合伙捕鱼：" + n + "条");
                System.out.println("A、B、C、D、E分别见到的条数为：" + n + "、" + j + "、" + k + "、" + l + "、" + m + "条");
                break;
            }
            n++;
        }
    }
}
